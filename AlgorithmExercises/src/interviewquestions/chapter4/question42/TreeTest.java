package interviewquestions.chapter4.question42;

import org.junit.Test;

public class TreeTest {

	int[] array = {0,1,2,3,4,5,6,7,8,9};
		
	@Test
	public void test() {
	
		printNode(new Tree(array).getRootNode(), 0);
	}
	
	private void printNode(Node node, int margen){
		
		StringBuilder margenSpace = new StringBuilder("");
		for(int i = 0; i < margen; i++){
			margenSpace.append(" ");
		}
		
		System.out.println(margenSpace.toString() + node.getElement());

		if (node.getLeftChild() != null || node.getRightChild() != null){
			
			if (node.getLeftChild() != null){
				printNode(node.getLeftChild(),margen + 4);
			}
			if (node.getRightChild() != null){
				printNode(node.getRightChild(),margen + 4);
			}
		
		}
	}

}
