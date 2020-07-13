package interviewquestions.chapter4.question41;

import java.util.HashSet;
import java.util.Set;

public class Graph {
	
	private Node[] nodes;

	public Node[] getNodes() {
		return nodes;
	}

	public void setNodes(Node[] nodes) {
		this.nodes = nodes;
	}
	
	public boolean isThereARoute(Node a, Node b){
	
		Set<Node> checkedNodes = new HashSet<Node>();
		
		return checkNode (a, b, checkedNodes);
		
	}
	
	private boolean checkNode(Node a,Node b, Set<Node> checkedNodes){

		if( checkedNodes.contains(a)){
			return false;
		}
		
		if (a == b){
			return true;
		}
		
		if (a.getChildren() != null){
			for (int i = 0; i < a.getChildren().length; i++){
				if (checkNode (a.getChildren()[i], b, checkedNodes)){
					return true;
				}
			}
		}
		
		checkedNodes.add(a);
		
		return false;
	}
	
}
