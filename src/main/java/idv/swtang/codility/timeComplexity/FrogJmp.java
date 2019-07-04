package idv.swtang.codility.timeComplexity;

public class FrogJmp {
	
	
	public static int solution(int X, int Y, int D) {
		
		   System.out.println("Your test case: X:"+X + "Y:"+Y+"D:"+D);
		int steps = (Y - X) / D;
		int extras = (Y - X) % D > 0 ? 1 : 0;
		
		 System.out.println("Returned value::"+ (steps + extras));
		return steps + extras;
	}
	
	
	public static int solution2(int X, int Y, int D) {
		
		   System.out.println("Your test case: X:"+X + "Y:"+Y+"D:"+D);
		
		   int result = (int) Math.ceil( (Y-X) / (double)D );
		
		  // System.out.print(" Math.ceil( (Y-X)" +  Math.ceil( (Y-X)) );
		 System.out.println("Returned value:"+ (result));
		return result;
	}
	
	

}
