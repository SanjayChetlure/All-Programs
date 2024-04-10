package LogicalProgram;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_ex2_sortArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList al1=new ArrayList<>();
		al1.add(100);
		al1.add(500);
		al1.add(60);
		al1.add(80);
		
		System.out.println(al1);
		Collections.sort(al1);			//sort ArrayList
		System.out.println(al1);
	}
}
