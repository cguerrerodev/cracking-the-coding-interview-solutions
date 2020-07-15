package interviewquestions.chapter1.question2;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PermutationChecker {
	
	public static void main(String[] args) {
		if(checkPermutation(args[0], args[1])){
			System.out.println(args[1] + " is a permutation of " + args[0]);
		}else{
			System.out.println(args[1] + " is not a permutation of " + args[0]);
			
		}
	}

	public static boolean checkPermutation(String text1, String text2){
		
		if(text1.equals(text2)){
			return false;
		} 
		if(text1.length() != text2.length()){
			return false;
		}

		Map<Character, Integer> text1Map = getMapFromWord(text1);
		
		Map<Character, Integer> text2Map = getMapFromWord(text2);
		
		return checkLetters(text1Map, text2Map);
		
	}

	private static boolean checkLetters(Map<Character, Integer> text1Map, Map<Character, Integer> text2Map) {
		Set<Entry<Character, Integer>> text1MapSet = text1Map.entrySet();
		
		for (Entry<Character, Integer> entry : text1MapSet) {
			Integer nLeters = text1Map.get(entry.getKey());
			if (!nLeters.equals(text2Map.get(entry.getKey()))){
				return false;
			}
		}
		
		return true;
	}

	private static Map<Character, Integer> getMapFromWord(String text1) {
		Map<Character, Integer> text1Map = new Hashtable<Character, Integer>();
		
		for (int i = 0; i<text1.length(); i++ ){
			
			Character letter = new Character(text1.charAt(i));
			Integer nLetters = text1Map.get(letter); 
			
			if(nLetters==null){
				text1Map.put(letter, 1);
			}else{
				text1Map.put(letter, nLetters + 1);
			}
			
		}
		return text1Map;
	}
	

}
