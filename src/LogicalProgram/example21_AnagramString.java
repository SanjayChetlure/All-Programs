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
			//2: convert to lower case
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			
			//3: convert to char array
			char [] ar1=s1.toCharArray();
			char [] ar2=s2.toCharArray();
			
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
