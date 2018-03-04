import java.util.ArrayList;


public class MyVisitor extends BayesBaseVisitor<String> {
	ArrayList<Node> nodes = new ArrayList<Node>();

	public String visitProgram( BayesParser.ProgramContext ctx) { 
		return visitChildren(ctx); 
	}

	public String visitExpressions( BayesParser.ExpressionsContext ctx) { 
		return visitChildren(ctx); 
	}

	public String visitLiterals(BayesParser.LiteralsContext ctx) {
		//System.out.println(ctx.getChildCount());
		ArrayList<String> relations = new ArrayList<String>();
		boolean add = true;
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
			for (Node node: nodes){
				if(node.getIdentifier().equals(ctx.getChild(0).getText())){
					add = false;
					break;
				}
				add = true;
			}
			if(add == true){
				nodes.add(new Node(ctx.getChild(0).getText(), relations));
			}
		}
		else{
			nodes.add(new Node(ctx.getText()));
		}
		System.out.println(nodes.size());
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