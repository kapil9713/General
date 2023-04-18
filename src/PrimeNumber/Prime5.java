package PrimeNumber;

import java.util.Scanner;

public class Prime5 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = scan.nextInt();
		
		if(isprime(n)) {
			System.out.println("Prime Number:");
		}
		else {
			System.out.println("Not A Prime Number:");
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


