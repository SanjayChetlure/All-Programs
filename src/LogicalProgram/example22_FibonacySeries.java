package LogicalProgram;

public class example22_FibonacySeries
{
	public static void main(String[] args) 
	{
		
		int count=10;
		int num1=0;   //1
		int num2=1;
		int num3;
		
		System.out.println(num1);
		System.out.println(num2);
		
		for (int i = 2; i <=count; i++) 
		{
			num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}
		
		
		
		
	}

}
