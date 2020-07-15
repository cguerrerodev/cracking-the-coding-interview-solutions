package interviewquestions.chapter1.question3;

import org.junit.Assert;
import org.junit.Test;

public class StringHelperTest {

	@Test
	public void testReplaceCharactersStringInt() throws Exception {
		Assert.assertEquals("Mr%20John%20Smith",StringHelper.replaceCharacters("Mr John Smith    ",13));
	}
	
}
