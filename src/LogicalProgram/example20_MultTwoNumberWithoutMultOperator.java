package LogicalProgram;

public class example20_MultTwoNumberWithoutMultOperator 
{
	public static void main(String[] args) 
	{		
		int num1=10;
		int num2=20;
		int sum=0;
		
		for(int i=1; i<=num1; i++)
		{
			sum=sum+num2;
		}
		
		System.out.println(sum);	
	}
}
