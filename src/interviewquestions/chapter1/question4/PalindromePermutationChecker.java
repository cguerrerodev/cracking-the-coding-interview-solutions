package interviewquestions.chapter1.question4;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class PalindromePermutationChecker {

	public static void main(String[] args) {
		
		System.out.println(checkPalindromePermutation(args[0]));

	}

	public static boolean checkPalindromePermutation(String word){
		
		Map<Character, Integer> mapWord = new Hashtable<Character, Integer>();

		int nLetters = 0;
		
		for (int i = 0; i < word.length(); i++) {
			
			Character letter = word.charAt(i);
			
			
			if(letter != ' '){
				
				nLetters++;
				Integer nLetterRepetitions=mapWord.get(letter);
				
				if(nLetterRepetitions == null){
					nLetterRepetitions = 1;
				}else{
					nLetterRepetitions = nLetterRepetitions.intValue() + 1;
				}
			
				mapWord.put(letter, nLetterRepetitions);
				
			}	
			
		}
		
		boolean isWordLengthOdd = nLetters % 2 > 0;
		boolean isThereAnyOddRepetition = false;
		
		for (Entry<Character, Integer> mapEntry : mapWord.entrySet()) {
			
			if (isWordLengthOdd){
				if(isThereAnyOddRepetition){
					if(mapEntry.getValue().intValue() % 2 > 0){
						return false;
					}
				}
			}
			
			isThereAnyOddRepetition 
				= isThereAnyOddRepetition || mapEntry.getValue().intValue() % 2 > 0;
								
		}
		
		if(isWordLengthOdd && !isThereAnyOddRepetition){
			return false;
		}

		if(!isWordLengthOdd && isThereAnyOddRepetition){
			return false;
		}
		
		return true;
	}
	
}
