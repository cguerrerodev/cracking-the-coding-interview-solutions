package interviewquestions.chapter4.question1;

public class Node {
	
	
	
	public Node(String name) {
		super();
		this.name = name;
	}
	private String name;
	Node[] children;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Node[] getChildren() {
		return children;
	}
	public void setChildren(Node[] children) {
		this.children = children;
	}
	
	

}
