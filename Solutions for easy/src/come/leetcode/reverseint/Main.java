package come.leetcode.reverseint;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println(reverse(456));
		
	}
	
	 public static int reverse(int x) {
		long result =0;

		
	        while(x != 0) {
	            int digit = x % 10;
	        
	            x /= 10;
	            
	          long  longResult = result * 10 + digit;
	          
	          result = (int)longResult;
	          
	          if(longResult !=result) {
	        	  return 0;
	        	  
	          }
	        }
	       return (int) result;
	    }

}
