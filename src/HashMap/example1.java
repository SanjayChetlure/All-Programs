package HashMap;

import java.util.HashMap;
import java.util.Set;

public class example1
{
	public static void main(String[] args) 
	{		
		HashMap<Integer, String> mp=new HashMap<>();
		
		//1: put(k, v) --> to add data in hashmap		 
		mp.put(1, "rahul");
		mp.put(2, "ganesh");
		mp.put(3, "suresh");
		mp.put(4, "mahesh");
					
		//2: containsKey(k)  --> 		
		System.out.println(mp.containsKey(6));  //  false
		System.out.println(mp.containsKey(2));  //  true
				
		//3: get(key)   --> print value of specific key
		System.out.println(mp.get(3));
		
		//4: put --> update value of specific key
		mp.put(1, "RAHUL");		
		System.out.println(mp);
		
		mp.put(2, mp.get(2)+"abc");
		System.out.println(mp);
		
		
		//5: keySet()  --> get all keys from hashmap
		Set<Integer> allKeys = mp.keySet();
		
		for(Integer key:allKeys)
		{
			System.out.println(key);
		}
		
		//6: get all keys and values
		for(Integer key:allKeys)
		{
			System.out.println(key + ": "+mp.get(key));
		}		
	}
}
