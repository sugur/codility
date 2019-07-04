package idv.swtang.codility.arrays;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import idv.swtang.codility.arrays.CyclicRotation;


public class CyclicRotationTest {

	private static int[] input;
	private static int inoutTime;
	 private static int[] expectedOutput = new int [] {9, 7, 6, 3, 8};
	 
	@Before
	public void setUp() throws Exception {
		
		input = new int [] {3, 8, 9, 7, 6} ;
		inoutTime = 3 ;
	}

	@Test
	public void test() {
		
		assertArrayEquals(expectedOutput, CyclicRotation.solution(input, inoutTime));
	}

}
