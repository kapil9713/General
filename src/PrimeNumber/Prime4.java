package PrimeNumber;

import java.util.Scanner;

public class Prime4 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter a No:");
		int n = scan.nextInt();
		
		
		if(isprime(n)) {
			System.out.println("Prime Number=:"+n);
		}
		else {
			System.out.println("Not Prime Number=:"+n);
		}
		
		
	}
	public static boolean isprime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) 
				return false;
				
			
			
		}
		return true;
		
	}
}

