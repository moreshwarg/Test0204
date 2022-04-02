package Program_37;

public class NumberOfOccurancesInString {
public static void main(String[] args) {
	String a = "my name is moreshwar aaaa gayke";
	int totalLenght= a.length();
	int totalLenghtAfterRemovingA=a.replace("a", "").length();
	int count=totalLenght-totalLenghtAfterRemovingA;
	System.out.println(count);
}
	
	
}
