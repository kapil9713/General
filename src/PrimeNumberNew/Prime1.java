package PrimeNumberNew;

public class Prime1 {

	public static void main(String[] args) {
		
		int num=5,i,flag=0;
		
		for(i=2;i<=num/2;i++) {
			if(num%i==0) {
				System.out.println("not prime");
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("prime");

	}

}
