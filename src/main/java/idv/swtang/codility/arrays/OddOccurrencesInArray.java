package idv.swtang.codility.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class OddOccurrencesInArray {
	

	public  static int solution(int[] N) {
	
		System.out.println("Your test case:"+ Arrays.toString(N));
		HashSet<Integer> set = new HashSet<Integer>(N.length/2);
		
		for(int i = 0; i < N.length; i++) {
			if (set.contains(N[i])) {
				set.remove(N[i]);
			} else {
				set.add(N[i]);
			}
		}
		
		 System.out.println("Returned value::"+ (int) set.toArray(new Integer[0])[0]);
		 
		return (int) set.toArray(new Integer[0])[0];
	}
}
