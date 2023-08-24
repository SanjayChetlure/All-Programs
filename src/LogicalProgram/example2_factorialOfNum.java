package LogicalProgram;

public class example2_factorialOfNum 
{
	public static void main(String[] args) 
	{
		
		int num=4;   // 4*3*2*1 = 24
		int fact=1;    //24
		
		//    4        0>=1    0
		for(int i=num; i>=1; i--)
		{
			fact=fact*i;   //24*1=24
		}
		
		
		System.out.println(fact);
		
		
		
		
	}

}
