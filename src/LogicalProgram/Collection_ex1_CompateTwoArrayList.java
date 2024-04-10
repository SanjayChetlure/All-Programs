package LogicalProgram;

import java.util.ArrayList;

public class Collection_ex1_CompateTwoArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList al1=new ArrayList<>();
		al1.add(10);
		al1.add(50);
		al1.add(60);
		al1.add(80);
		
		ArrayList al2=new ArrayList<>();
		al2.add(10);
		al2.add(50);
		al2.add(60);
		al2.add(8);
		
		System.out.println(al1.equals(al2));
		
	}

}
