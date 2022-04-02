package tryAndCatch;

public class Second {
	public static void main(String[] args) {
		System.out.println("start");
		int a=54;
		int b= 0;
		int c=0;
		int d[]= {10,20,33,34,32};
		
		try // exception code
		
		{
			c=a/b;
			System.out.println("hi");
			System.out.println(d[6]);
			
		}
		catch(ArithmeticException e)
		{
		System.out.println("b is 0");	
		}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("arry index is not present");
			}
	catch (Exception e)
	{
	System.out.println("common handling");
	e.printStackTrace();
	}
		
	System.out.println("c = " + c);
	}	

}
