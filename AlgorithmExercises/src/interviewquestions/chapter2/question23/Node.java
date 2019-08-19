package interviewquestions.chapter2.question23;

public class Node {

	private int value;
	private Node next = null;
	
	public Node(int value){
		this.value = value;
	}

	public void appendToTail(int newNumber){
		
		Node currentNode = this; 
		while (currentNode.next != null){
			currentNode = currentNode.next; 
		}
		currentNode.next = new Node(newNumber);
	}
	
	public void removeDuplicates(){
		Node node = this; 
		
		while (node.next != null){
			
			Node nodeToCompareWith = node;
			
			while(nodeToCompareWith.next != null){
				
				if(node.value == nodeToCompareWith.next.value){
					nodeToCompareWith.next = nodeToCompareWith.next.next;
				} 
				
				nodeToCompareWith = nodeToCompareWith.next;
			}
			
			node = node.next;
		}
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}
		
	
	
}
