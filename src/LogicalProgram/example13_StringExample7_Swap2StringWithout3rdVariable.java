package LogicalProgram;

public class example13_StringExample7_Swap2StringWithout3rdVariable
{
	public static void main(String[] args) 
	{
		
		String s1="abc";
		String s2="xyz";
		
		System.out.println("before swap s1: "+s1);
		System.out.println("before swap s2: "+s2);
		
		s1=s1+s2;      //abcxyz
		s2=s1.substring(0,(s1.length()-s2.length()));;
		s1=s1.substring(s2.length());
		
		System.out.println("after swap s1: "+s1);
		System.out.println("after swap s2: "+s2);
		
	}
}