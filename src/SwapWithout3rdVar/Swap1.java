package SwapWithout3rdVar;

public class Swap1 {

	public static void main(String[] args) {
		
		int x=5;
		int y=10;
		x=x+y;    //x=15
		y=x-y;   // y=5
		x=x-y;
		System.out.println("x="+x);
		System.out.println("y="+y);
				
		

	}

}
