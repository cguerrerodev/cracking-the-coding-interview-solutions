package interviewquestions.chapter1.question5;

public class EditChecker {

	public static void main(String[] args) {
		
		String[] words = {"ple", "pale", "bale", "bake"};
		StringBuilder message = null;
		
		for (String word : words) {

			message = new StringBuilder(args[0]);
			message.append(" , ");
			message.append(word);
			message.append(" -> ");
			message.append(isOneEditAway(args[0],word));
			System.out.println(message);
			
		}
		
		

	}

	public static boolean isOneEditAway(String word1, String word2){
		
		if(word1.equals(word2)){
			return true;
		}
		
		if(word1.length() > word2.length() + 1){
			return false;
		}
		
		if(word1.length() < word2.length() - 1){
			return false;
		}

	
		return compareWords(word1, word2);
	}

	private static boolean compareWords(String word1, String word2) {
		boolean isThereAChange = false;

		for(int i = 0, j=0; i<word1.length(); ){
		
			if (word1.charAt(i) != word2.charAt(j)){
		
				if(isThereAChange){
					return false;
				}else{
					isThereAChange = true;
				}
				
				if(word1.length() > word2.length()){
					i++;
				}else if(word1.length() < word2.length()){
					j++;
				}else{
					i++;
					j++;					
				}

			}else{
				i++;
				j++;
			}
			
		}
			
		return isThereAChange;
	}
}
