package Revision2;

public class example7 
{
	//Reverse the string using Recursion?
	
	
	public static void reverse(String s1) 
	{	
		if (s1.length() <= 1)
           System.out.println(s1);
        else
        {
            System.out.print(s1.charAt(s1.length()-1));
            reverse(s1.substring(0,s1.length()-1));
        }	
	}
	
	
	
	public static void main(String[] args) 
	{
		
		reverse("ganesh");
		
	}
}
