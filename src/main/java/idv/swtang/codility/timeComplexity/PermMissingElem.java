package idv.swtang.codility.timeComplexity;

import java.util.Arrays;

public class PermMissingElem {
	
	
	 public static int solution(int[] A) {

		   System.out.println("Your test case:"+ Arrays.toString(A));
	        long N = A.length + 1;
	        long total = N * (N + 1) / 2;

	        System.out.println("total: "+ total +" N: "+ N);
	        for (int i : A) {

	            total -= i;
	        }

	        System.out.println("Returned value::"+ (int)total);
	        return (int)total;
	        
	       
	    }

}
