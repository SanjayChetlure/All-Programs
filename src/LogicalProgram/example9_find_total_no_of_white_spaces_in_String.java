package LogicalProgram;

public class example9_find_total_no_of_white_spaces_in_String 
{
	public static void main(String[] args) {

	
		String str = "a b   c d";
		int count = 0;  

		//               3<=8
		for (int i = 0; i <= str.length() - 1; i++)
		{    //                  3
			char s1 = str.charAt(i);   // ' '
			//  ' '  == ' '
			if (s1 == ' ')    // 
			{
				count++;     //2
			}
		}

		System.out.println("no of spaces in given string: " + count);

		
		//System.out.println(str.replace(" ", ""));
		
	}
}