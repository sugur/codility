package idv.swtang.codility.countingelements;

import java.util.Arrays;

public class PermCheck {
	 
	
	public static int solution(int[] A) {
		 System.out.println("Your test case:"+ Arrays.toString(A));
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != (i + 1)) {
            	
            	  System.out.println("Returned value::"+ 0);
                return 0;
            }
        }
        System.out.println("Returned value::"+ 0);
        return 1;
    }

}
