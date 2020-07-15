package interviewquestions.chapter3.question2;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackMinTest {

	private StackMin sm = new StackMin();
	
	@Test
	public void testPush() {
		
		sm.push(3);
		sm.push(6);
		sm.push(5);
		sm.push(4);
		sm.push(2);
		
		assertEquals(2, sm.pop());
		assertEquals(4, sm.pop());
		assertEquals(5, sm.pop());
		assertEquals(6, sm.pop());
		assertEquals(3, sm.pop());
		
	}

	@Test
	public void testPop() {
		sm.push(3);
		sm.push(6);
		sm.push(5);
		sm.push(4);
		sm.push(2);
		
		assertEquals(2, sm.pop());
		assertEquals(4, sm.pop());
		assertEquals(5, sm.pop());
		assertEquals(6, sm.pop());
		assertEquals(3, sm.pop());
	}

	@Test
	public void testGetMin() {
		sm.push(3);
		sm.push(6);
		sm.push(1);
		sm.push(4);
		sm.push(2);
		
		assertEquals(1, sm.getMin());

	}

}
