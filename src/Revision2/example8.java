package Revision2;

import java.util.LinkedHashMap;
import java.util.Set;

public class example8 
{
	//Find First non repetitive character from String?
	
	public static void main(String[] args) 
	{		
		String inp= "aaabcccdeeefggg";
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
			if(mp.get(key)==1)
			{
				System.out.println(key+"-"+mp.get(key));
				break;
			}		
		}	
	}
}
