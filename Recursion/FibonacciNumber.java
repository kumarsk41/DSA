package dsa.recursion;

public class FibonacciNumber {
	 public static int fib(int n) {
		 if(n == 1) {
			 return 1;
		 }
		 if(n == 0) {
			 return 0;
		 }
		
		 n = fib(n-1)+fib(n-2);
	        
		 return n;
	    }
	
	
	public static void main(String[] args) {
		int n = 4;
		n = fib(n);
		System.out.println(n);
	}

}
