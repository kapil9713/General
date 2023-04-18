package PrimeNumberNew;

public class Prime4 {

	public static void main(String[] args) {
		
		int num=5,i,flag=0;
		for(i=2;i<num/2;i++) {
			if(num%2==0) {
				System.out.println("Not a Prime No");
				flag=1;
			}
		}
		if(num%2==0) {
			System.out.println("Prime No");
		}
		
		
		
		
		

	}

}
