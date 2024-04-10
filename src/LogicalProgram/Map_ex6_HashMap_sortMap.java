package LogicalProgram;

import java.util.HashMap;
import java.util.TreeMap;

public class Map_ex6_HashMap_sortMap
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> mp=new HashMap<>();
		mp.put(105, "ramesh");
		mp.put(100, "mahesh");
		mp.put(1, "suresh");
		System.out.println(mp);
		
		TreeMap tm=new TreeMap<>(mp);
		System.out.println(tm);
	}
}
