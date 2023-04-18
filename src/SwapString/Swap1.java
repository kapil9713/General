package SwapString;

public class Swap1 {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="World";
		a=a+b;                  //a= Hello World
		b=a.substring(0,a.length()-b.length());  //Hello
		a=a.substring(b.length());
		System.out.println("a="+a);
		System.out.println("b="+b);
		

	}

}
