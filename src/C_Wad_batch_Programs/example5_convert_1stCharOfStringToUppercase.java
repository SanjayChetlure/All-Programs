package C_Wad_batch_Programs;

public class example5_convert_1stCharOfStringToUppercase 
{
	public static void main(String[] args) 
	{
		String s1="velocity";
		
		s1=s1.substring(0,1).toUpperCase()+s1.substring(1);
		System.out.println(s1);
			
	}
}
