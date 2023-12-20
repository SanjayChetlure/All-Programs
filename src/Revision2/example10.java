package Revision2;

public class example10 
{
	//String str = "nap20hfk10gf3hh17" ;
	//Output = 50
	
	public static void main(String[] args)
	{
		
		String str = "nap20hfk10gf3hh17";
		int sum=0;
		for(int i=0; i<=str.length()-1; i++)
		{
			char s1=str.charAt(i);
						
			if(Character.isDigit(s1))
			{
				sum=sum+ Integer.parseInt(String.valueOf(s1));
			}		
		}
		
		System.out.println(sum);
		
	}

}
