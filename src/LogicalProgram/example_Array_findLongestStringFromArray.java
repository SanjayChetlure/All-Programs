package LogicalProgram;

public class example_Array_findLongestStringFromArray 
{
	public static void main(String[] args) 
	{
		
		String [] ar= {"abc","cndned","askl","lkndlkdndn","fuyuyuyuyuf"};
		
		String str=ar[0];
		for (int i = 0; i < ar.length-1; i++) 
		{
			if(str.length()<ar[i+1].length())
			{
				str=ar[i+1];
			}
		}		
		System.out.println(str);
	}
}
