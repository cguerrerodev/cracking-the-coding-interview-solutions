package interviewquestions.chapter1.question9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringRotationTest {

	@Test
	void test() {
		Assertions.assertTrue(StringRotation.isRotation("waterbottle", "erbottlewat"));
	}

	@Test
	void test2() {
		Assertions.assertFalse(StringRotation.isRotation("waterbottlee", "erbottlewat"));
	}

	@Test
	void test3() {
		Assertions.assertFalse(StringRotation.isRotation("waterbottle", "erbottllwat"));
	}
}
