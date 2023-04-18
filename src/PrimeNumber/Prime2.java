package PrimeNumber;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a No=:");
		int n = scan.nextInt();
		
		if(isprime(n)) {
			System.out.println("is a prime no"+n);
		}
		else {
			System.out.println("is not a prime no"+n);
		}
		
		

	}
	public static boolean isprime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}

}
