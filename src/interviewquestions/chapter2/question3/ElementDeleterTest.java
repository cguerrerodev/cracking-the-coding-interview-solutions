package interviewquestions.chapter2.question3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ElementDeleterTest {

	@Test
	public void testDeleteMiddleNode() {
		Node node = new Node('a');
		node.appendToTail('b');
		node.appendToTail('c');
		node.appendToTail('d');
		node.appendToTail('e');
		node.appendToTail('f');
		
		ElementDeleter.deleteMiddleNode(node, 'c');

		assertEquals('a', node.getValue());
		node = node.getNext();
		assertEquals('b', node.getValue());
		node = node.getNext();
		assertEquals('d', node.getValue());
		node = node.getNext();
		assertEquals('e', node.getValue());
		node = node.getNext();
		assertEquals('f', node.getValue());

	}

}
