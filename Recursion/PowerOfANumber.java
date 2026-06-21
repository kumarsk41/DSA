package dsa.recursion;

public class PowerOfANumber {
	
	static double pow(double n,int x) {
		if(x == 0) {
			return 1;
		}
		if(x<0) {
			return 1/pow(n,-x);
		}
		
		double product = n * pow(n,x-1);
		System.out.println(product);
		
		return product;
	}
	
	public static void main(String[] args) {
		double n = 2;
		int x = -10;
		n = pow(n,x);
		System.out.println(n);
	}

}
