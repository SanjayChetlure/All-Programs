package Revision2;

import java.util.HashMap;
import java.util.Set;

public class example5 
{
	//String s= "Iam Amit Hadge hadge and I had successfully successfully completed completed "
	// find Duplicate words ?
	
	public static void main(String[] args) 
	{
		String s= "Iam Amit Hadge hadge and I had successfully successfully completed completed";
		String[] ar = s.split(" ");
		
		HashMap<String, Integer> mp=new HashMap<>();
		
		for(int i=0; i<=ar.length-1; i++)
		{
			String s1 = ar[i];
			
			if(mp.containsKey(s1))
			{
				mp.put(s1, mp.get(s1)+1);
			}
			else
			{
				mp.put(s1, 1);   //Iam   , 1
			}			
		}
			
		Set<String> allKeys = mp.keySet();
		for(String key:allKeys)
		{
			if(mp.get(key)>1)
			{
			     System.out.println(key+"-"+mp.get(key));
			}
		}		
	}
}
