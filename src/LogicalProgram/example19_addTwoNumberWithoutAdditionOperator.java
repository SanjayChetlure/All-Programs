package LogicalProgram;

public class example19_addTwoNumberWithoutAdditionOperator 
{
	public static void main(String[] args) 
	{
		
		System.out.println(add(6, 5));		
	}
	
	
	public static int add(int a, int b) 
	{
		for(int i=1; i<=a; i++)
		{
			b++;	
		}		
		return b;
	}
}
