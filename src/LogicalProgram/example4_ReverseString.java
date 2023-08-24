package LogicalProgram;

public class example4_ReverseString 
{
	public static void main(String[] args)
	{
		
		String org="abcd";           //oup -> dcba
		String rev="";     //dcba
		
		//    3                   -1>=0
		for(int i=org.length()-1; i>=0; i--)
		{
			rev=rev+org.charAt(i);     //dcb + a  = dcba
		}
		
		System.out.println(org);
		System.out.println(rev);
	}

}
