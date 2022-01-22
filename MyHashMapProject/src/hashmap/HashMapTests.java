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
		assertThat(sut.get("One"), is("One"));
	}
}
