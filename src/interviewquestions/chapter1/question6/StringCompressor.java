package interviewquestions.chapter1;

public class StringCompressor {
	
	public static void main(String[] args) {

		System.out.println(compress(args[0]));
	}

	public static String compress(String word){
		
		if(word.length() <= 2){
			return word;
		}
		
		char character = 0;
		StringBuilder compressedWord = new StringBuilder(word.length());
		int repetitions = 0;
		int i = 0;
		
		do{

			character = word.charAt(i);
			repetitions++;
			
			if (word.length() == i+1 
					|| character != word.charAt(i + 1)){
				
				compressedWord.append(character);
				compressedWord.append(repetitions);

				if (compressedWord.length() == word.length()){
					return word;
				}
								
				repetitions = 0;
				
			}
			
			i++;

		}while (i < word.length());

		return compressedWord.toString();
	}
}
