package hashmap;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class HashMapTests {
	@Test
	public void should_insert_value_into_hashmap_and_retrieve_it()
	{
		//arrange
		HashMap<String, Integer> sut = new HashMap<>();
		
		//add
		sut.put("One", 1);
		
		//assert
		assertThat(sut.get("One"), is(1));
	}
	
	@Test
	public void should_insert_multiple_value_into_hashmap_and_retrieve_it()
	{
		//arrange
		HashMap<String, Integer> sut = new HashMap<>();
		
		//add
		sut.put("My First String", 1);
		sut.put("My Second String", 2);
		sut.put("My Third String", 3);
		sut.put("My Seventh String", 7);
		
		//assert
		assertThat(sut.get("My First String"), is(1));
		assertThat(sut.get("My Second String"), is(2));
		assertThat(sut.get("My Third String"), is(3));
		assertThat(sut.get("My Seventh String"), is(7));

	}	
	
	@Test
	public void should_remove_an_element_from_hashmap()
	{
		//arrange
		HashMap<String, Integer> sut = new HashMap<>();
		
		//add
		sut.put("My First String", 1);
		sut.remove("My First String");
		
		//assert
		assertNull(sut.get("My First String"));

	}	
	
	@Test
	public void should_insert_and_remove_into_hashmap_and_retrieve_it()
	{
		//arrange
		HashMap<String, Integer> sut = new HashMap<>();
		
		//add
		sut.put("My First String", 1);
		sut.put("My Second String", 2);
		sut.put("My Third String", 3);
		sut.put("My Seventh String", 7);
		
		sut.remove("My Seventh String");

		//assert
		assertThat(sut.get("My First String"), is(1));
		assertThat(sut.get("My Second String"), is(2));
		assertThat(sut.get("My Third String"), is(3));
		assertNull(sut.get("My Seventh String"));

	}	
}
