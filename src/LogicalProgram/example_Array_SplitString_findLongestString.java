package LogicalProgram;

public class example_Array_SplitString_findLongestString
{
	public static void main(String[] args) 
	{
		String str="ac@1xyz5fd*1";
		String ar[]=new String[str.length()];
		
		String s2="";
		int count=0;
		for(int i=0; i<=str.length()-1; i++)
		{
			char s1=str.charAt(i);
			if(Character.isAlphabetic(s1))
			{
				s2=s2+s1;
			}
			else
			{
				ar[count]=s2;
				s2="";
				count++;
			}
		}
		
		String s3=ar[0];
		for(int i=0; i<=ar.length-2; i++)
		{
			if(s3.length()<ar[i+1].length())
			{
				s3=ar[i+1];
			}
		}
	}
}
