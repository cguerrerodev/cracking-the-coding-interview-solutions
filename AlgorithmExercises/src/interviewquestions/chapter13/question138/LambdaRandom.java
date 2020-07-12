package interviewquestions.chapter13.question138;

import java.util.List;
import java.util.Random;

public class LambdaRandom {

	public static List< Integer> getRandomSubset ( List< Integer> list) {
		
		int[] rangeArray= new Random().ints(2, 0, list.size()).sorted().toArray();
		list.subList(rangeArray[0], rangeArray[1]).stream().forEach(System.out::println);
		return list.subList(rangeArray[0], rangeArray[1]);
		
	}
	
}
