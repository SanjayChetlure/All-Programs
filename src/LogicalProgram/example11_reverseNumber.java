package LogicalProgram;

public class example11_reverseNumber 
{
public static void main(String[] args)
{	
	int orgNum = 1234;
	String org = Integer.toString(orgNum);  //convert number to string

	String rev = "";    //4321
	//                             -1>=0
	for (int i = org.length() - 1; i >= 0; i--) 
	{
		rev = rev + org.charAt(i);  // 432 + 1 = 4321
	}
	
	int revNum = Integer.parseInt(rev);   // convert string to number
	System.out.println(revNum);			
}
}