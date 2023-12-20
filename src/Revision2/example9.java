package Revision2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class example9 
{
	//Reverse only numeric value of string.
	
	public static void main(String[] args)
	{
		 String input = "I am 28yrs old";
		    Matcher m = Pattern.compile("\\d+").matcher(input);
		    		    
		    while(m.find()) 
		        input = input.replace(m.group(), new StringBuilder(m.group()).reverse());
		    
		    System.out.println(input);	
	}
}
