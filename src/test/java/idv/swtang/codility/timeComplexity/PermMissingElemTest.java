package idv.swtang.codility.timeComplexity;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PermMissingElemTest {

	private static int[] input;

	 private static int expectedOutput = 4;
	 
	@Before
	public void setUp() throws Exception {
		input = new int [] {2,3,1,5};
	}

	@Test
	public void test() {
		Assert.assertEquals(expectedOutput, PermMissingElem.solution(input));
	}

}
