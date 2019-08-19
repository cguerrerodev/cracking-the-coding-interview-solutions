package interviewquestions.chapter2.question21;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NodeTest {

	@Test
	public void testAppendToTail() {
		
		Node node = new Node(0);

		for (int i = 1; i < 5; i++){
			node.appendToTail(i);
		}
				
		for (int i = 0; i < 5; i++){
			assertEquals(i, node.getValue());
			node = node.getNext();
		}		
		
	}

	@Test
	public void testRemoveDuplicates() {
		
		Node node = new Node(0);
		node.appendToTail(1);
		node.appendToTail(2);
		node.appendToTail(0);
		node.appendToTail(3);
		node.appendToTail(2);
		node.appendToTail(4);
		node.appendToTail(4);
		node.appendToTail(5);
		
		node.removeDuplicates();
		
		for (int i = 0; i <= 5; i++){
			
			System.out.println(i + " , " + node.getValue());
			assertEquals(i, node.getValue());
			node = node.getNext();
		}		
		
	}
}
