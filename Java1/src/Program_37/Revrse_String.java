package Program_37;

public class Revrse_String {

	public static void main(String[] args) {
String a = "MORESHWAR hkklkibhbjn";
String t= "";
for(int i=(a.length()-1);i>0;i--)
	 {
	   t=t+a.charAt(i);
	  }
	   a=t;
	
      System.out.println(a);
     
	}
   }

