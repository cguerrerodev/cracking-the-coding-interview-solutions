package interviewquestions.chapter4.question43;

public class Node {
	
	private int element;
	private Node rightChild;
	private Node leftChild;
	
	public Node(int element){
		this.element = element;
	}
	
	public int getElement() {
		return element;
	}
	public void setElement(int element) {
		this.element = element;
	}
	public Node getRightChild() {
		return rightChild;
	}
	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
	public Node getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}
	
	
}
