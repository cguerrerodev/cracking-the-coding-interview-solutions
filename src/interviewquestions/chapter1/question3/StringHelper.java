package interviewquestions.chapter1.question3;


public class StringHelper {
	
	
	public static void main(String[] args) throws NumberFormatException, Exception {
		
		System.out.println(replaceCharacters(args[0].toCharArray(), 
				Integer.parseInt(args[1])));
	}
	
	public static char[] replaceCharacters(char[] word, int size) throws Exception{

		if (word == null || word.length < 1){
			throw new Exception("Empty word");
		}
		
		int lastCharacterIndex = findLastCharacter(word);

		insertNewCharacters(word, lastCharacterIndex);
				
		return word;
	}

	protected static int insertNewCharacters(char[] word, int lastCharacterIndex) {
		//Move letters ahead every time it finds a space 
		for (int i = lastCharacterIndex; i >= 0 ; i--) {
			if(word[i] == ' '){
				for (int j = lastCharacterIndex; j > i  ; j--){
					word[j + 2] = word[j];
				}
				word[i+2] = '0';
				word[i+1] = '2';
				word[i]   = '%';
				lastCharacterIndex += 2;
			}
		}
		return lastCharacterIndex;
	}

	private static int findLastCharacter(char[] word) {
		//Go through all the array to see where is the end of the words		
		int lastCharacterIndex=-1;
		for (int i = word.length - 1; i >= 0 ; i--) {
			if(word[i] != ' '){
				lastCharacterIndex = i;
				break;
			}
		}
		return lastCharacterIndex;
	}	
	
	
	
	
	public static char[] replaceCharacters(String word, int size) throws Exception{
		
		if (word != null || word.length() < 1){
			throw new Exception("Empty word");
		}
				
		char result[] = new char[size];

		for (int i = 0, resultIndex = 0; i < word.length(); i++, resultIndex++){
			if (word.charAt(i) == ' '){
				result[resultIndex] = '%';
				resultIndex++;
				result[resultIndex] = '2';
				resultIndex++;
				result[resultIndex] = '0';
			}else{
				result[resultIndex] = word.charAt(i);
			}
		}
		
		return result;
	}

}
