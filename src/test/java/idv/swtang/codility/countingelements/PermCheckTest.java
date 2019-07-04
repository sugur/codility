package idv.swtang.codility.countingelements;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PermCheckTest {

	private static int[] input;

	 private static int expectedOutput = 0;
	@Before
	public void setUp() throws Exception {
		
		input = new int[] { 5, 1, 3, 2 };
	}

	@Test
	public void test() {
		Assert.assertEquals(expectedOutput, PermCheck.solution(input));
	}

}
