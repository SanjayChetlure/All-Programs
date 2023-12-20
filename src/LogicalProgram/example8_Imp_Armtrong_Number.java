package LogicalProgram;

public class example8_Imp_Armtrong_Number
{
	public static void main(String[] args)
	{
		int OrgNum = 122;  //  1 + 125 + 27 = 153
					
		int sum = 0;    //	153
		
				// 153       1>0         153/10 = 15/10 = 1
		for (int i = OrgNum;  i > 0;  i = i / 10)
		{
			int rem = i % 10;   // 1 % 10 = 1
			sum = sum + (rem * rem * rem);   //152 + 1 =153
		}
		
		
		if (OrgNum == sum)  
		{
			System.out.println("given number " + OrgNum + " is an armstrong number");
		} 
		else 
		{
			System.out.println("given number " + OrgNum + " is not an armstrong number");
		}
		
		
		
//		int rem = OrgNum%10;  // 153%10= 3
//		System.out.println(rem);
//
//		OrgNum=OrgNum/10;  //153/10 =15
//		System.out.println(OrgNum);	
	}
	
	
	// find Armtrong_Number from 1 to 1000	
}