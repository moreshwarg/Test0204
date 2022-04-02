package Program_37;

public class AssendingArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {0,20,55,5,20,30};
int t;
for(int i=0;i<a.length;i++)
{
	for(int j =i+1;j <a.length;j ++)
		if(a[i]>a[j ])
	{t=a[i];
	a[i]=a[j];
	a[j]=t;
}
System.out.println(a[i]);
	}
	}
}
