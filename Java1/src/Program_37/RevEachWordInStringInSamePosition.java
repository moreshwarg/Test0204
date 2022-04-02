package Program_37;

public class RevEachWordInStringInSamePosition {
public static void main(String[] args) {
	String str = "Moreshwar walmik gayke"; //original String
	String words[]= str.split(" ");  // splitting the word
	String reverseString="";
	for(String w:words) //Moreshwar
	{
	 String revrseWord="";
	 for(int i=w.length()-1;i>=0;i--)//rawhseroM
	 {
		 revrseWord=revrseWord+w.charAt(i); 
	 }
	 reverseString=reverseString+revrseWord+" ";//rawhseroM kimlaw ekyag 

	}
System.out.println(reverseString);// printing statement
}
}
   