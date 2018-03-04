import java.io.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.text.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.nio.file.*;
import java.nio.charset.Charset;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.CommonTokenStream;

class TabbedPanel extends JFrame
{
    private JTextArea areaGrammar = new JTextArea(20,120);
    public JTextArea areaTest = new JTextArea(20,120);
    public JScrollPane scrollError = null;
    public JTabbedPane tabbedPane;
    private JTextArea areaError = new JTextArea(20,120);
    private JFileChooser dialog = new JFileChooser(System.getProperty("user.dir"));
    private String currentFile = "Untitled";
    private boolean changed = false;
    private Path file = Paths.get("ErrorLog_Syntax.log");
    private List<String> errors;

    JPanel treePanel = new JPanel();

    JScrollPane scrollTreePanel = new JScrollPane(
        treePanel,
        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
    );

    Action text2Tree = new AbstractAction("Compile") {
        public void actionPerformed(ActionEvent e) {
            readToTree();
        }
    };

    public TabbedPanel()
    {
        add(scrollTreePanel, BorderLayout.CENTER);
        scrollTreePanel.setVisible(true);

        // Test Editor
        areaTest.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollTest = new JScrollPane(
            areaTest,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
        );
        add(scrollTest, BorderLayout.CENTER);
        scrollTest.setVisible(true);

        // Error Viewr
        areaError.setFont(new Font("Monospaced", Font.PLAIN, 12));
        areaError.setEditable(false);
        scrollError = new JScrollPane(
            areaError,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
        );
        add(scrollError, BorderLayout.CENTER);
        scrollError.setVisible(true);

        // Buttons
        JToolBar tool = new JToolBar();
        add(tool, BorderLayout.WEST);
        tool.addSeparator();

        JButton antlr = tool.add(text2Tree);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();

        setTitle(currentFile);
        setVisible(true);

        tabbedPane = new JTabbedPane();
        Container contentPane = getContentPane();

        contentPane.add(tabbedPane,BorderLayout.CENTER);

        tabbedPane.addTab("Input Text to Test", scrollTest);
        tabbedPane.addTab("Tree", scrollTreePanel);
        tabbedPane.addTab("Errors", scrollError);
    }

    public Integer readToTree()
    {
        // ANTLR Tree
        ANTLRInputStream input = new ANTLRInputStream(areaTest.getText());

        BayesLexer lexer = new BayesLexer(input);

        BaseErrorListener miErrorListener = new ThrowingErrorListener();

        // Add custom error handlers
        lexer.removeErrorListeners();
        lexer.addErrorListener(miErrorListener);

        TokenStream tokenStream = new CommonTokenStream(lexer);

        BayesParser parser = new BayesParser(tokenStream);

        // Add custom error handlers
        parser.removeErrorListeners();
        parser.addErrorListener(miErrorListener);

        ParseTree tree = parser.program();
        TreeViewer treeViewer = new TreeViewer(
            Arrays.asList(parser.getRuleNames()),
            tree
        );
        treeViewer.setSize(700, 700);

        // De no poner esto, hace un arbol justo a la par
        treePanel.removeAll();
        treePanel.add(treeViewer);
        

        
        // Este es el visitador del análisis semántico
        MyVisitor visitor = new MyVisitor();
		visitor.visit(tree);
		System.out.println(visitor.nodes);

		// TODO: Agregar pane para output de código intermedio

        // Read and write errors.
        try {
            areaError.setText("");
            errors = Files.readAllLines(file, Charset.forName("UTF-8"));
            Files.deleteIfExists(file);

            for (int i = 0; i < errors.size(); i++) {
                areaError.append("(" + (i + 1) + "): " + errors.get(i) + "\n");
            }
            

            return 1;
        } catch ( IOException e ) {
            areaError.setText("No syntactic errors \n ");


            // Testear si no hay errores de ninguna naturaleza, y si no hay
            // hacer output de código intermedio

            return 1;
        }
    }
    
    private void generarArhivoCodigoIntermedio(ArrayList<String> codigoIntermedioArrayList)
    {
    	Path file = Paths.get("intermediate_output.txt");

    	try {
    		Files.write(file, codigoIntermedioArrayList, Charset.forName("UTF-8"));
        } catch (IOException e) {
            System.err.println("Something is wrong.");
        }
    }
}
