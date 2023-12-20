package LogicalProgram;

public class example18_removeSpacesFromString
{
	public static void main(String[] args)
	{	
		String str = "a b   c d";
		System.out.println(str);
		
		str=str.replace(" ", "");
		System.out.println(str);		
	}
}