package interviewquestions.chapter2.question3;

public class ElementDeleter {

	public static void deleteMiddleNode(Node headNode, char value){
		
		if (headNode == null){
			return;
		}
		
		if(headNode.getValue() == value){
			return;
		}
		
		Node node = headNode;
		
		while(node.getNext() != null){
			if(node.getNext().getValue() == value 
					&& node.getNext().getNext() != null){
				node.setNext(node.getNext().getNext()); 
			}
			node = node.getNext();
		}
		
		return;
	}
	
}
