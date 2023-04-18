package PrimeNumber;

public class Prime1 {

	public static void main(String[] args) {
		
		
		getprime(10);
		

	}
	public static boolean isprime(int num) {
		
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
			
		}
		return true;
	}
		public static boolean getprime(int num) {
			for(int i=2;i<=num;i++) {
				if(isprime(i))
					System.out.println(i+" ");
		}
			return false;
	}
		

}
