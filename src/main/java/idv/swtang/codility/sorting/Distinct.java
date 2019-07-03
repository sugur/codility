package idv.swtang.codility.sorting;

import java.util.HashSet;


import java.util.Set;
public class Distinct {

	 public int solution(int[] A) {
	        final Set<Integer> set = new HashSet<Integer>();
	        for (int a : A) {
	            set.add(a);
	            System.out.println(a);
	        }

	        return set.size();
	    }

}
