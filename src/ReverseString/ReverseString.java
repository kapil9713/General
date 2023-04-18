package ReverseString;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="Pari";
		int length=str.length();
		String rev="";
		for(int i=length-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		

	}

}
