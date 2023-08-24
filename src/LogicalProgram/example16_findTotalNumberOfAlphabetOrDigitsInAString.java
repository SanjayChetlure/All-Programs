package LogicalProgram;

import javax.swing.plaf.SliderUI;

public class example16_findTotalNumberOfAlphabetOrDigitsInAString 
{
	public static void main(String[] args)
	{
		String str="abc 12 @";
		
		int countLetter=0;
		int countDigit=0;
		int countWhiteSpace=0;
		int countSpclChar=0;
				
		for(int i=0; i<=str.length()-1; i++)
		{
			char s1 = str.charAt(i);    //' '
			
			if(Character.isLetter(s1))
			{
				countLetter++;
			}
			else if(Character.isDigit(s1))
			{
				countDigit++;
			}
			else if(Character.isWhitespace(s1))
			{
				countWhiteSpace++;
			}
			else
			{
				countSpclChar++;
			}
		}
		
		System.out.println("Letter Count: "+countLetter);
		System.out.println("Digit Count: "+countDigit);
		System.out.println("SPCL Char Count: "+countSpclChar);
		System.out.println("WhiteSpace Count: "+countWhiteSpace);				
	}
}
