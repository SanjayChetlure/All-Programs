package C_Wad_batch_Programs;

public class example11_CheckIfEementOfStringIsNumber 
{
	public static void main(String[] args) 
	{
		String str="abc@123";
		
		for(int i=0; i<=str.length()-1; i++)
		{
			char s1 = str.charAt(i);
			
			if (Character.isLetter(s1)) 
			{
				System.out.println(s1 +"- letter");
			} 
			else if (Character.isDigit(s1))
			{
				System.out.println(s1+"- digit");
			}
			else if(Character.isWhitespace(s1))
			{
				System.out.println(s1+" - whitespace");
			}
			else
			{
				System.out.println(s1+" - special character;");
			}
		}
	}
}
