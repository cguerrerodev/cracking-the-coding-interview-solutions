package interviewquestions.chapter1.question15;

public class StringRotation{

	
	public static boolean isRotation(String s1, String s2) {
		
		
		if (s1.length() != s2.length()) {
			return false;
		}
		
		int firstCharIndex =s2.indexOf(s1.charAt(0));
		
		while(firstCharIndex > -1) {
		
			int i = compareStrings(s1, s2, firstCharIndex); 
			
			if(i == s1.length()) {
				return true;
			}else {
				firstCharIndex = s2.indexOf(s1.charAt(0), ++firstCharIndex );
			}
					
		}
		
		return false;
	}

	private static int compareStrings(String s1, String s2, int firstCharIndex) {
		
		int i2 = firstCharIndex;
		int i = 0;
		
		while (i < s1.length()) {
			
			if(s1.charAt(i) != s2.charAt(i2)) {
				
				break;
			}
			
			i2++;
			
			if (i2 == s2.length()) {
				i2 = 0;
			}
			
			i++;
		}
		return i;
	}
}
