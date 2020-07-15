package interviewquestions.chapter4.question2;

public class Tree {

	private Node rootNode;

	public Tree(int[] elements){
		
		if (elements != null){
			rootNode = createTree(0, elements.length - 1, elements);
		}
	}
	
	private Node createTree(int initialIndex, int finalIndex,int[] elements){
		
		int nElements = finalIndex - initialIndex + 1; 
		
		if (nElements > 0){
		
			int index = (nElements / 2) + initialIndex;
			Node node = new Node(elements[index]);
					
			node.setLeftChild(createTree(initialIndex, index-1, elements));
			node.setRightChild(createTree(index+1, finalIndex, elements));

			return node;
			
		}	
			
		return null;
	}
	
	public Node getRootNode() {
		return rootNode;
	}

	public void setRootNode(Node rootNode) {
		this.rootNode = rootNode;
	}
	
	
}
