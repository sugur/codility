package idv.swtang.codility.sorting;

import org.junit.Test;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class DistinctTest {

	static Distinct distinct = new Distinct();
	final int[] A = { 2, 1, 1, 2, 3, 1 };
	
	@Test
	public void testSolution() throws Exception { 
		//TODO: Test goes here...
		    Assert.assertEquals(3, distinct.solution(A));
		} 
}
