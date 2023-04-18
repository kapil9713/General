package PrimeNumberNew;

public class Prime2 {

	public static void main(String[] args) {
	
		int num=6, i, flag=0;
		
		for(i=2;i<=num/2;i++) {
			if(num%2==0) {
				System.out.println("Not a Prime No");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Prime No");
		}
		

	}

}
