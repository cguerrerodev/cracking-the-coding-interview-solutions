package interviewquestions.chapter4.question1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GraphTest {

	Graph graph;
	
	@Before
	public void setUp() throws Exception {
		
		Node node0 = new Node("0");
		Node node1 = new Node("1");
		Node node2 = new Node("2");
		Node node3 = new Node("3");
		Node node4 = new Node("4");
		Node node5 = new Node("5");
		Node node6 = new Node("6");
		
		node0.setChildren(new Node[]{node1, node2, node4});
		node1.setChildren(new Node[]{node6});
		node2.setChildren(new Node[]{node3});
		node3.setChildren(new Node[]{node5});
		node4.setChildren(new Node[]{node5});
		
		graph = new Graph();
		graph.setNodes(new Node[]{node0, node1, node2, node3, node4, node5, node6});
		
	}

	@Test
	public void testIsThereARoute() {
		Assert.assertTrue(graph.isThereARoute(	(Node)graph.getNodes()[0], 
												(Node)graph.getNodes()[6])
							);		
	}

	@Test
	public void testIsThereARoute2() {
		Assert.assertFalse(graph.isThereARoute(	(Node)graph.getNodes()[6], 
												(Node)graph.getNodes()[5])
							);		
	}

	@Test
	public void testIsThereARoute3() {
		Assert.assertTrue(graph.isThereARoute(	(Node)graph.getNodes()[0], 
												(Node)graph.getNodes()[5])
							);		
	}
	
	
}
