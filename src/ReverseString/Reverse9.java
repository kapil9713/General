package ReverseString;

public class Reverse9 {

	public static void main(String[] args) {
		
		String str="Kapil";
		int length = str.length();
		String rev="";
		for(int i=length-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);



	}

}
