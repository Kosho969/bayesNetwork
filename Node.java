import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Node{
    String identifier;
    Map probabilities ; 
    ArrayList<String> dependencies ;

    public Node(String id) {
        this.identifier = id;
        this.probabilities = new HashMap();
        this.dependencies = new ArrayList<String>(); 
    }
    

	public Node(String id, ArrayList<String> dependencies) {
        this.identifier = id;
        this.probabilities = new HashMap();
        this.dependencies = dependencies; 
    }

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public Map getProbabilities() {
		return probabilities;
	}

	public ArrayList<String> getDependencies() {
		return dependencies;
	}

	public void addDependency (String dependency){
		this.dependencies.add(dependency);
	}
	
	public void addProbability (String key, float value){
		this.probabilities.put(key,value);
	}
	  @Override
	public String toString() {
		return "Node [identifier=" + identifier + ", probabilities="
				+ probabilities + ", dependencies=" + dependencies + "]";
	}
}