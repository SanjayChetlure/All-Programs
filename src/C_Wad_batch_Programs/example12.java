package C_Wad_batch_Programs;

import java.util.HashMap;
import java.util.Set;

public class example12 
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> mp=new HashMap<>();
		
		//1: add data key, value
		mp.put(1, "rahul");
		mp.put(2, "ramesh");
		mp.put(3, "suresh");
		
		//update value of particular key
		mp.put(1, "RAHUL");
		
		System.out.println(mp);
		
		
		//2: verify key present of not
		System.out.println(mp.containsKey(5));
		
		//3: get value of specific key
		System.out.println(mp.get(1));   //RAHUL
		System.out.println(mp.get(2));   //ramesh
		
		
		//4: get all key
           Set<Integer> allKeys = mp.keySet();
           for(Integer key:allKeys)
           {
        	   System.out.println(key);
           }
           
		
		//5: print all keys & values
           for(Integer key:allKeys)
           {
        	   System.out.println(key+"-"+mp.get(key));
           }
		
		
		
		
	}

}
