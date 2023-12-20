package LogicalProgram;

public class example16_findTotalNumberOfAlphabetOrDigitsInAString 
{
	public static void main(String[] args)
	{
		String str="abc 12 @";
		
		int countLetter=0;
		int countDigit=0;
		int countWhiteSpace=0;
		int countSpclChar=0;
				
		//           4<=
		for(int i=0; i<=str.length()-1; i++)
		{
			char s1 = str.charAt(i);    // ' '
			
			if(Character.isLetter(s1))   //' '  --> false
			{
				countLetter++;     //3
			}
			else if(Character.isDigit(s1))  //' '  --> false
			{
				countDigit++;    //2
			}
			else if(Character.isWhitespace(s1)) // ' '   --> true
			{
				countWhiteSpace++;    //2
			}
			else
			{
				countSpclChar++;  //1
			}
		}
		
		System.out.println("Letter Count: "+countLetter);
		System.out.println("Digit Count: "+countDigit);
		System.out.println("SPCL Char Count: "+countSpclChar);
		System.out.println("WhiteSpace Count: "+countWhiteSpace);				
	}
}
