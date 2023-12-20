package Revision2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Set;

public class example4 
{
	//Dheerajkumar and output should be - d-1,h-1,e-2,a-2, j-1,m-1.
	
	public static void main(String[] args) 
	{
		String inp= "Dheerajkumar";
		LinkedHashMap<Character, Integer> mp=new LinkedHashMap<>();
		
		for(int i=0; i<=inp.length()-1; i++)
		{
			char s1 = inp.charAt(i);
			if(mp.containsKey(s1))
			{
				mp.put(s1, mp.get(s1)+1);
			}
			else
			{
				mp.put(s1, 1);
			}			
		}
		
	
		Set<Character> allKeys = mp.keySet();
		
		for(Character key:allKeys)
		{
			System.out.println(key+"-"+mp.get(key));
		}		
	}
}
