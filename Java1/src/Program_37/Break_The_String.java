package Program_37;


public class Break_The_String {

	public static void main(String[] args) {

		String b="MY NAME IS GANESH";
         System.out.println(b);
		System.out.println("after the split string");
		
		String[] s = b.split(" ");
		for (int i=0; i<b.length();i++)
		{
			System.out.println(s[i]);
		}
		  
	  }
}