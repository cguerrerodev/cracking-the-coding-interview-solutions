package interviewquestions.chapter4.question44;

public class Tree {

	public static boolean isBalancedTree(Node node) {

		if(node == null) {
			throw new IllegalArgumentException("Null value not allowed"); 
		}
		
		if (node.getLeftNode() == null
				&& node.getRightNode() == null) {
			return true;
		}
			
		boolean isBalanced = true;
		
		if (node.getLeftNode() != null) {
			isBalanced = isBalancedTree(node.getLeftNode());
		}
		
		if(!isBalanced) {
			return false; 
		}
		
		if (node.getRightNode() != null) {
			isBalanced = isBalancedTree(node.getRightNode());
		}		
		
		if(!isBalanced) {
			return false; 
		}

		return Math.abs(getHeight(node.getLeftNode())
				-getHeight(node.getRightNode())) <= 1;
	
		
	}
	
	public static int getHeight (Node node){ 

		if (node == null) {
			return 0;
		}

		if (node.getLeftNode()!= null
			|| node.getRightNode()!= null) {
			
			int leftNode  = getHeight(node.getLeftNode());
			int rightNode = getHeight(node.getRightNode());
			
			return 1 + (leftNode > rightNode ? 
							leftNode
							:rightNode);
		}
		
		return 1;
	}
}
