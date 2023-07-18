package C_Wad_batch_Programs;

public class example1_StringPallindrome 
{
	public static void main(String[] args)
	{
		
		String org="madam";     //dcba
		String rev="";
		
		for(int i=org.length()-1; i>=0; i--)
		{
			rev=rev+org.charAt(i);
		}
		
			
		if(org.equals(rev))
		{
			System.out.println("given string is pallindrome");
		}
		else
		{
			System.out.println("given string is not a pallindrome");
		}
		
	}

}
