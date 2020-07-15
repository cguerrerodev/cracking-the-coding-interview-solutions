package interviewquestions.chapter13.question8;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class LambdaRandomTest {

	@Test
	void test() {
		
		List<Integer> list = Arrays.asList(0,1,2,3,4,5);
		List<Integer> randomSubst = LambdaRandom.getRandomSubset(list);
		Assert.assertTrue(Collections.indexOfSubList(list, randomSubst) > -1);
		
		
	}

	@Test
	void test2() {
		
		List<Integer> list = Arrays.asList(78,66,45,109,8,57);
		List<Integer> randomSubst = LambdaRandom.getRandomSubset(list);
		Assert.assertTrue(Collections.indexOfSubList(list, randomSubst) > -1);
		
		
	}	
	
}
