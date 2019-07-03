package Iterations;

public class BinaryGap {
	
	
	   public static int solution(int n) {
		   
		   System.out.println("Your test case:"+ n);
	        int finalGap = 0;
	        
	        if (n == 1) {
	            return 0;
	        }
	       
	        char binaryRep[] = Integer.toBinaryString(n).toCharArray();
	        int tempGap=0; 
	        System.out.println("binary " + Integer.toBinaryString(n));
	        for (int x = 0; x < binaryRep.length; x++) {
	            if(binaryRep[x]=='0'){
	                tempGap++;
	                continue;
	            }else if(binaryRep[x]=='1'){
	                if(tempGap>finalGap)
	                finalGap=tempGap;
	                tempGap=0;
	            }
	            
	        }
	        
	        System.out.println("Returned value::"+ finalGap);
	        return finalGap;
	    }
	   
	   
	

}
