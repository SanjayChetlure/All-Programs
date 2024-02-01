package LogicalProgram;

import java.util.Arrays;

public class example21_AnagramString 
{
	public static void main(String[] args) {
		
		String s1="listen";
		String s2="silent";
				
		//1: verify length of both string
		if (s1.length()!=s2.length()) 
		{
			System.out.println("Not anagram: String with diff length");
		}
		else 
		{
			
			//3: convert to lower case -> char array
			char [] ar1=s1.toLowerCase().toCharArray();
			char [] ar2=s2.toLowerCase().toCharArray();
			
			//4: sort both array
			Arrays.sort(ar1);
			Arrays.sort(ar2);
			
			//5: verify both aaray are equal?
			if(Arrays.equals(ar1, ar2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not anagram");
			}
		}		
	}
}
