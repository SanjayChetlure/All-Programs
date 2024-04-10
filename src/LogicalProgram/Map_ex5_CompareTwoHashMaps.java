package LogicalProgram;

import java.util.HashMap;

public class Map_ex5_CompareTwoHashMaps
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> mp1=new HashMap<>();
		mp1.put(101, "ramesh");
		mp1.put(102, "mahesh");
		mp1.put(103, "suresh");
				
		HashMap<Integer, String> mp2=new HashMap<>();
		mp2.put(101, "ramesh");
		mp2.put(102, "mahesh");
		mp2.put(103, "suresh");
		
		System.out.println(mp1.equals(mp2));		
	}
}
