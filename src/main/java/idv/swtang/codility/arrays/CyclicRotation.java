package idv.swtang.codility.arrays;

import java.util.Arrays;

public class CyclicRotation {
	
	public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        
        // Using the concept of "mod" (to make it cyclic)
        
		System.out.println("Your test case:"+ Arrays.toString(A)+ "K:" + K);
		
        int[] new_array = new int[A.length]; 
        
        for(int i=0; i< A.length; i++){
            int new_position = (i + K) % A.length;         
            new_array[new_position] = A[i]; 
            System.out.println("posotion"+i+"new_position" + new_position);
        }
        
        System.out.println("Returned value::"+  Arrays.toString(new_array));
        return new_array; 
    }

}
