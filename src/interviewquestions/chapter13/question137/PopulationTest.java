package interviewquestions.chapter13.question137;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PopulationTest {

	@Test
	void testGetPopulation() {
		
		List<Country> countries = new ArrayList<Country>();
		
		Country country = new Country();
		country.setContinent("Europe");
		country.setPopulation(35);
		countries.add(country);

		country = new Country();
		country.setContinent("Europe");
		country.setPopulation(40);
		countries.add(country);

		country = new Country();
		country.setContinent("America");
		country.setPopulation(300);
		countries.add(country);

		country = new Country();
		country.setContinent("America");
		country.setPopulation(45);
		countries.add(country);
		
		Assert.assertEquals(345, Population.getPopulation(countries, "America"));
	}

}
