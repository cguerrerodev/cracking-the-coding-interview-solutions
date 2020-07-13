package interviewquestions.chapter2.question33;

import static org.junit.Assert.*;

import org.junit.Test;

public class SetOfStacksTest {

	private SetOfStacks setOfStacks;
	
	@Test
	public void testPush() {
		
		setOfStacks = new SetOfStacks();
		
		for(int i = 0; i < 20; i++){
			setOfStacks.push(i);
		}

		for(int i = 19; i <= 0; i++){
			assertEquals(i, setOfStacks.pop());
		}
		
		
	}

	@Test
	public void testPop() {
		
		setOfStacks = new SetOfStacks();

		for(int i = 0; i < 20; i++){
			setOfStacks.push(i);
		}

		for(int i = 19; i <= 0; i++){
			assertEquals(i, setOfStacks.pop());
		}
		
	}

	@Test
	public void testPopOf() {

		setOfStacks = new SetOfStacks();
		
		for(int i = 0; i < 20; i++){
			setOfStacks.push(i);
		}

		assertEquals(15, setOfStacks.popOf(1));
		assertEquals(6, setOfStacks.popOf(3));
		assertEquals(10, setOfStacks.popOf(2));
	}

}
