package LogicalProgram;

import java.util.HashMap;
import java.util.Set;

public class Example14_HashMap1_methods
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> mp=new HashMap<>();
		
		//1: put(k,v) -> to add key & value in hashmap
		mp.put(101, "ramesh");
		mp.put(102, "mahesh");
		mp.put(103, "suresh");
		System.out.println(mp);
		
		//2: put(k,v) -> update value of already existing key
		mp.put(101, "RAMESH");
		System.out.println(mp);
		
		//3: containsKey(key) -> to verify specific key present or not
		System.out.println(mp.containsKey(104));
		
		//4: get(key) -> get value of specific key
		System.out.println(mp.get(102));
		
		System.out.println("-----");
		
		//5: keyset() -> to get all keys from hashmap
		Set<Integer> allKeys = mp.keySet();
		for(Integer key:allKeys)
		{
			System.out.println(key);
		}
		
		//6: get all keys & values
		for(Integer key:allKeys)
		{
			System.out.println(key+"-"+mp.get(key));
		}	
	
	}
}
