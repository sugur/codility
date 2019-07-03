package Arrays;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class OddOccurrencesInArrayTest {

	private static int[] input;
	 private static int expectedOutput = 6;
	 
	@Before
	public void setUp() throws Exception {
		input = new int [] {1,2,3,4,5,5,4,3,2,1,6} ;
		
		 
	}

	@Test
	public void test() {
		
		Assert.assertEquals(expectedOutput, OddOccurrencesInArray.solution(input));
	}

}
