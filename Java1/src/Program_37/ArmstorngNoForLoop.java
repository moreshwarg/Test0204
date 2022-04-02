package Program_37;

public class ArmstorngNoForLoop {

	public static void main(String[] args) {
int num=407,number,rem,total=0;
number=num;
for( ; number!=0;) {
rem=	number%10;
total=total+rem*rem*rem;
number=number/10;
}
if(total==num) {
	System.out.println(num+" IS AN ARMSTRONG NUMBER");
}
else
	System.out.println(num+" IS NOT AN ARMSTRONG NUMBER");

}
}