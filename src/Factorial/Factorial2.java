package Factorial;

public class Factorial2 {

	public static void main(String[] args) {
		
		System.out.println(Factorial(4));

	}
	public static int Factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
		return fact;
	}

}
