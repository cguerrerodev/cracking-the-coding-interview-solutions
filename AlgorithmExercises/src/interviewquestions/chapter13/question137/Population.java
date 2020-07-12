package interviewquestions.chapter13.question137;

import java.util.List;

public class Population {
	
	public static int getPopulation(List<Country> countries, String continent) {
		

		return countries.stream()
					.filter(country -> country.getContinent().equals(continent))
					.map(country -> country.getPopulation())
					.reduce(0,Integer::sum);		
		 
	}
	
}
