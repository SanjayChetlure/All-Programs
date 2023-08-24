package LogicalProgram;

public class example13_StringExample4_printStatementInReverseOrder
{
	public static void main(String[] args) 
	{
		
		String s1="my name is abc";
				
		String [] ar=s1.split(" ");  //{my(0) name(1) is(2) abc(3)}
		
		System.out.println("------------");
		
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.print(ar[i]+" ");
		}
		
	}

}