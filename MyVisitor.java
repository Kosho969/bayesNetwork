import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class MyVisitor extends BayesBaseVisitor<String> {
	ArrayList<Node> nodes = new ArrayList<Node>();
	double probability = 0.0;

	public String visitProgram( BayesParser.ProgramContext ctx) { 
		return visitChildren(ctx); 
	}

	public String visitExpressions( BayesParser.ExpressionsContext ctx) { 
		probability = Double.parseDouble(ctx.getChild(2).getText());
		return visitChildren(ctx); 
	}

	public String visitLiterals(BayesParser.LiteralsContext ctx) {
		// START for creating new node and adding the relations
		Set<String> relations = new HashSet<String>();
		boolean add = true;
		Map<Set<String>,Object> probabilities = new HashMap<Set<String>, Object>();
		String currentIdentifier = "";
		if(ctx.getChild(0).getText().contains("!")) 		
			currentIdentifier = ctx.getChild(0).getText().split("!")[1];
		else{
			currentIdentifier = ctx.getChild(0).getText();
		}
		if (ctx.getChildCount()> 1){
			
			
			for (int i = 0; i < ctx.getChild(2).getChildCount(); i++){
				String child = ctx.getChild(2).getChild(i).getText();
				if (!child.equals(",")){
					if (child.contains("!")){
						String [] newChild = child.split("!");
						//System.out.println(newChild[1]);
						if(!relations.contains(newChild[1])){
							relations.add(newChild[1]);
						}
					}
					else if(!relations.contains(child)){
						relations.add(child);
					}
				}
			}
			String text =ctx.getChild(0).getText();
			if (text.contains("!")){
				text = text.split("!")[1];
			}
			for (Node node: nodes){
				if(node.getIdentifier().equals(text)){
					add = false;
					break;
				}
				add = true;
			}
			if(add == true){
				nodes.add(new Node(text, relations));
			}
			else{
				for (Node node: nodes){
					if(node.getIdentifier().equals(text)){
						node.getDependencies().addAll(relations);
					}
				}
			}
		}
		else{
			String text = ctx.getText();
			if (text.contains("!")){
				text = text.split("!")[1];
			}
			for (Node node: nodes){
				if(node.getIdentifier().equals(text)){
					add = false;
					break;
				}
				add = true;
			}
			if(add == true){
				nodes.add(new Node(text));
			}
		}
		// End of creating new node and adding dependencies if there are. 
		
		// Insert probabilities
		System.out.println("C,D".contains("D"));
		Node currentNode = null;
		for(Node node: nodes){
			if (node.getIdentifier().equals(currentIdentifier)){
				currentNode = node;
				break;
			}
		}
		probabilities = currentNode.getProbabilities();
		relations = currentNode.getDependencies();
		Set<String> setA = new HashSet<String>();
		String text = ctx.getText();
		boolean existance = false;
		if (ctx.getChildCount()> 1){
			
			
			for (int i = 0; i < ctx.getChild(2).getChildCount(); i++){
				String child = ctx.getChild(2).getChild(i).getText();
				if (!child.equals(",")){
					setA.add(child);
				}
			}
		}
		else{
			setA.add(text);
		}
		if((setA.size()== relations.size() || (setA.size()-1 == relations.size())) ) {
			for (Set<String> key: probabilities.keySet()){
				if(key.containsAll(setA)){
					existance = true;
					break;
				}
				existance = false;
			}
			if(existance == false){
				currentNode.addProbability(setA, probability );
			}
			
		}
		
		return visitChildren(ctx); 
	}

	public String visitExpr2( BayesParser.Expr2Context ctx) { 
		return visitChildren(ctx); 
	}


	public String visitExpr1( BayesParser.Expr1Context ctx) {
		
		return visitChildren(ctx); 
	}

	public String visitVar1( BayesParser.Var1Context ctx) { 
		return visitChildren(ctx); 
	}

	public String visitVar2( BayesParser.Var2Context ctx) { 
		return visitChildren(ctx); 
	}
}
