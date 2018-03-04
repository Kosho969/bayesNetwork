import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Node{
    String identifier;
    Map<Set<String>,Object> probabilities ; 
    Set<String> dependencies ;

    public Node(String id) {
        this.identifier = id;
        this.probabilities = new HashMap<Set<String>, Object>();
        this.dependencies = new HashSet<String>(); 
    }
    
    public Node() {
        this.identifier = "";
        this.probabilities = new HashMap<Set<String>, Object>();
        this.dependencies = new HashSet<String>();
    }
    

	public Node(String id,   Set<String> dependencies) {
        this.identifier = id;
        this.probabilities = new HashMap<Set<String>, Object>();
        this.dependencies = dependencies; 
    }

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public Map<Set<String>, Object> getProbabilities() {
		return probabilities;
	}

	public   Set<String>getDependencies() {
		return dependencies;
	}

	public void addDependency (String dependency){
		this.dependencies.add(dependency);
	}
	
	public void addProbability (Set<String> key, double value){
		this.probabilities.put(key,value);
	}
	  @Override
	public String toString() {
		return "Node:\n"
				+ "ID: "+ identifier + "\n"
				+ "Probabilities: "+ probabilities + "\n"
				+ "Dependencies: "+ dependencies + "\n \n";
	}
}