package Program_37;

public class Practice {
	
	public static void main (String [] arg){
		int a[]={10,11,20,3,4,5,};
	int	temp  ;
		for (int i= 0;i<a.length-1;i++)
		{
		for (int j= i+1;j<a.length-1;j++)
		{
		if (a[i]>a[j])
		{temp =a[i];
		a[i]=a[j];
		a[j]=temp;
		}
		}
		System.out.println(a[i]);

		}
	
	
	
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//public static void main (String [] arg){
//String a = "moreshwar gayke wsaaaajkss";
//int count = 0;
//for (int i=0 ;i<a.length()-1;i++)
//{
//	if (a.charAt(i)!='')
//	{
//		count ++;}
//	
//}
//System.out.println(count);
//	}
//
//
//
//
//







//int totallenght = a.length();
//int afterremoving = a.replace("a", "").length();
//int count =totallenght-afterremoving;
//System.out.println(count);
//















//String t= "";
//String[] s= a.split(" ");
//for (int i= 0; i< a.length()-1;i++)
//{
//	System.out.println(s[i]);
//t=t+ a.charAt(i);
//}
//a= t;
//System.out.println(a);


