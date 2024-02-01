package LogicalProgram;

import java.util.ArrayList;
import java.util.TreeSet;

public class example_Array_find2ndHighestNumberFromArray 
{
	public static void main(String[] args) 
	{
		int ar []= {10,30,40,50,50,60,60};
		TreeSet<Integer> lhs=new TreeSet<>();
		for(int num:ar)
		{
			lhs.add(num);
		}
		
		ArrayList<Integer> al=new ArrayList<>(lhs);
		System.out.println(al.get(al.size()-2));	
	}
}
