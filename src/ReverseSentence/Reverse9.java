package ReverseSentence;

public class Reverse9 {

	public static void main(String[] args) {
		
		String str = "Kapil Rathore Quiz Kart";
		String[] s = str.split(" ");
		String rev="";
		for(int i=s.length-1;i>=0;i--) {
			rev+=s[i]+ " ";
		}
		System.out.println(rev);
		
		
		

	}

}
