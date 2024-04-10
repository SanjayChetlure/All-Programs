package LogicalProgram;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Map_ex4_MakeHashMapSynchronized
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> mp=new HashMap<>();
		
		mp.put(101, "ramesh");
		mp.put(102, "mahesh");
		mp.put(103, "suresh");
		
		Collections.synchronizedMap(mp);
	}
}
