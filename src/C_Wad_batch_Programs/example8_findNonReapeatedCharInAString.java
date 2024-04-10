package C_Wad_batch_Programs;

import java.util.HashMap;
import java.util.Set;

public class example8_findNonReapeatedCharInAString
{

	public static void main(String[] args)
	{
		
		String str="abcdaba";
		
		HashMap<Character, Integer> mp=new HashMap<>();
		
		for(int i=0; i<=str.length()-1; i++)
		{
			char s1 = str.charAt(i);   //a
		
			if(mp.containsKey(s1))   
			{
				mp.put(s1, mp.get(s1)+1);   //a, 3
			}
			else
			{
				mp.put(s1, 1);    //d,1
			}
		}	
		
		Set<Character> allKeys = mp.keySet();
		
		//unique key
		for(char key:allKeys)
		{
			if(mp.get(key)==1)
			{
				System.out.println(key+"-"+mp.get(key));
			}
		}
		
		System.out.println("--------------");
		
		//unique key
		for(char key:allKeys)
		{
			if(mp.get(key)>1)
			{
				System.out.println(key+"-"+mp.get(key));
			}
		}
		
		
	}	
}
