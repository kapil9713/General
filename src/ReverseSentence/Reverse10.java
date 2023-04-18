package ReverseSentence;

public class Reverse10 {

	public static void main(String[] args) {
		
		String str="Kapil Rathore";
		String[] s = str.split(" ");
		String sen="";
		for(int i=s.length-1;i>=0;i--) {
			sen+=s[i]+" ";
		}
		System.out.println(sen);
		
		

	}

}
