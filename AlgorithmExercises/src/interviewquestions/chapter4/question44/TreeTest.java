package interviewquestions.chapter4.question44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TreeTest {

	@Test
	void testIsBalancedTree() {
		Node node = new Node(5);
		
		node.setLeftNode(new Node(2));
		node.setRightNode(new Node(8));
		
		node.getLeftNode().setLeftNode(new Node(1));
		node.getLeftNode().setRightNode(new Node(4));
		node.getRightNode().setLeftNode(new Node(7));
		node.getRightNode().setRightNode(new Node(9));

		node.getLeftNode().getLeftNode().setLeftNode(new Node(0));
		node.getLeftNode().getRightNode().setLeftNode(new Node(3));
		node.getRightNode().getLeftNode().setLeftNode(new Node(6));
		
		assertTrue(Tree.isBalancedTree(node));
		
		
	}

	@Test
	void testIsBalancedTree2() {
		Node node = new Node(5);
		
		node.setLeftNode(new Node(2));
		node.setRightNode(new Node(8));
		
		node.getLeftNode().setLeftNode(new Node(1));
		node.getLeftNode().setRightNode(new Node(4));
		node.getRightNode().setLeftNode(new Node(7));
		node.getRightNode().setRightNode(new Node(9));

		node.getLeftNode().getLeftNode().setLeftNode(new Node(0));
		node.getLeftNode().getRightNode().setLeftNode(new Node(3));
		node.getRightNode().getLeftNode().setLeftNode(new Node(6));
		
		node.getRightNode().getLeftNode().getLeftNode().setLeftNode(new Node(20));
		node.getRightNode().getLeftNode().getLeftNode().getLeftNode().setLeftNode(new Node(21));
		
		assertFalse(Tree.isBalancedTree(node));
		
		
	}	
	
	@Test
	void testGetHeight() {
		Node node = new Node(2);
		
		node.setLeftNode(new Node(2));
		node.setRightNode(new Node(8));
		
		node.getLeftNode().setLeftNode(new Node(1));
		node.getLeftNode().setRightNode(new Node(4));
		node.getRightNode().setLeftNode(new Node(7));
		node.getRightNode().setRightNode(new Node(9));

		node.getLeftNode().getLeftNode().setLeftNode(new Node(0));
		node.getLeftNode().getRightNode().setLeftNode(new Node(3));
		node.getRightNode().getLeftNode().setLeftNode(new Node(6));
		
		assertEquals(4, Tree.getHeight(node));
		
	}
	
	@Test
	void testGetHeight2() {
		Node node = new Node(2);
		
		node.setLeftNode(new Node(2));
		node.setRightNode(new Node(8));
		
		node.getLeftNode().setLeftNode(new Node(1));
		node.getLeftNode().setRightNode(new Node(4));
		node.getRightNode().setLeftNode(new Node(7));
		node.getRightNode().setRightNode(new Node(9));

		node.getLeftNode().getLeftNode().setLeftNode(new Node(0));
		node.getLeftNode().getRightNode().setLeftNode(new Node(3));
		node.getRightNode().getLeftNode().setLeftNode(new Node(6));
		
		node.getRightNode().getLeftNode().getLeftNode().setLeftNode(new Node(20));
		node.getRightNode().getLeftNode().getLeftNode().getLeftNode().setLeftNode(new Node(21));
		
		
		assertEquals(6, Tree.getHeight(node));
		
	}	

}
