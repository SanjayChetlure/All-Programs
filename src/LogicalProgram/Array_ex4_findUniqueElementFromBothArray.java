package LogicalProgram;

public class Array_ex4_findUniqueElementFromBothArray
{
	public static void main(String[] args)
	{
		
		int [] ar1= {10,20, 30,40, 100};
		int [] ar2= {10,20, 70,80, 100};
				
		//           4<=4
		for(int i=0; i<=4; i++)
		{  //     100 != 100
			if(ar1[i]!=ar2[i])
			{                       // 40   80    
				System.out.println(ar1[i]+" "+ar2[i]);
			}	
		}	
	}
}
