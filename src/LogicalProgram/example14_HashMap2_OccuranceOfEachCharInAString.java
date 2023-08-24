package LogicalProgram;

import java.util.HashMap;
import java.util.Set;

public class example14_HashMap2_OccuranceOfEachCharInAString 
{
	public static void main(String[] args)
	{
		String str="abcab";
		
		HashMap<Character, Integer> mp=new HashMap();
		
		//           4<=4
		for(int i=0; i<=str.length()-1; i++)
		{          //            4
			char s1 = str.charAt(i);     //b
			
			if(mp.containsKey(s1))
			{
				mp.put(s1, mp.get(s1)+1);
			}
			else
			{
				mp.put(s1, 1);    //c, 1
			}
		}
		
		
		Set<Character> allKeys = mp.keySet();
		
		//Occurance of each character
//		for(Character key:allKeys)
//		{
//			System.out.println(key+"-"+mp.get(key));
//		}
		
		
		//print only duplicate chars
		for(Character key:allKeys)
		{
			if(mp.get(key)>1)
			{
				System.out.println(key+"-"+mp.get(key));
			}
		}	
	}
}
