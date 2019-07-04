package idv.swtang.codility.timeComplexity;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class FrogJmpTest {

	private static int inputX;
	private static int inputY;
	private static int inputD;
	 private static int expectedOutput = 3;
	 
	@Before
	public void setUp() throws Exception {
		inputX = 10;
		inputY =85;
		inputD = 30;
		
	}

	@Test
	public void test() {
		Assert.assertEquals(expectedOutput, FrogJmp.solution(inputX, inputY, inputD));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(expectedOutput, FrogJmp.solution2(inputX, inputY, inputD));
	}

}
