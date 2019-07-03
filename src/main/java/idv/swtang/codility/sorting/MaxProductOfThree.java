package idv.swtang.codility.sorting;


import java.util.Arrays;


public class MaxProductOfThree {
	
	 public int solution(int[] A) {
		 
		 Arrays.sort(A);
			System.out.println(Arrays.toString(A));
			int max1 = A[A.length-1] *A[A.length-2] *A[A.length-3];
			int max2 = A[A.length-1] *A[0] *A[1];
			
			System.out.println(" max1"+max1+"max2"+max2);
			return max1>max2?max1:max2;
	    }


}
