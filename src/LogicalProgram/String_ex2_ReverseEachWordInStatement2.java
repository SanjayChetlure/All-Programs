package LogicalProgram;

public class String_ex2_ReverseEachWordInStatement2
{
	public static void main(String[] args) 
	{		
		String s1="my name is abc";    //ym eman  si cba
		
		
		String [] ar=s1.split(" ");  //{my(0) name(1) is(2) abc(3)}
		
		//           0<=3  
		for(int i=0; i<=ar.length-1; i++)      //0-3
		{				// 0
			String org = ar[i];  //my
			
			String rev= reverseString(org);
			System.out.print(rev+" ");   //ym eman si cba
		}
	}
	
	public static String reverseString(String org) 
	{
		String rev="";
		for(int j=org.length()-1; j>=0; j--) 
		{
			rev=rev+org.charAt(j);
		}
		return rev;
	}
}