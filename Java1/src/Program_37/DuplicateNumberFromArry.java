package Program_37;

public class DuplicateNumberFromArry {

	public static void main(String[] args) {
int a[]= {1,2,5,6,1};
System.out.println("Duplicate Number From Arry");
for(int i=1;i<a.length;i++)
{
	for(int j=1+i;j<a.length;j++) {
		
		if(a[i]==a[j]) {
			System.out.println(a[i]);

		}
	}

}

	
	
	}
}