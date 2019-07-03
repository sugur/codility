package Iterations;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class BinaryGapTest {

	private static int input;
	 private static int expectedOutput = 5;
	 
	@Before
	public void setUp() throws Exception {
		
		input = 1041;
		
	}

	@Test
	public void test() {
		
		Assert.assertEquals(expectedOutput, BinaryGap.solution(input));
	}

}
