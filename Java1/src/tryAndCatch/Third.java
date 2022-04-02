package tryAndCatch;

public class Third {
	public static void main(String[] args) {
		System.out.println("start");
		int a=54;
		int b =11;
		int c=0;
		int d[]= {10,20,33,34,32};
		
  try   // exception code
		
		{
		System.out.println("hi");
       c=a/b;
			System.out.println(d[7]);
		}
	catch(ArithmeticException ge)
   { 
		System.out.println("catch block");	
}
  finally

		{
		System.out.println("finally");	
		}
  // normal flow next line
System.out.println("alternative code");
  }
  // no exception
	//try - finally-next line
	
	//with exception handling
	//try- catch - Finally-next line
	
	//with exception without handling
	// try -finally
}
  
  
  
