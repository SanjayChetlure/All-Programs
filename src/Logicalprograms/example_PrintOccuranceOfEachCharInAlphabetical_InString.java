package Logicalprograms;

import java.util.Set;
import java.util.TreeMap;

public class example_PrintOccuranceOfEachCharInAlphabetical_InString 
{
	
	public static void main(String[] args)
	{
		
		String inp1="working in desynova is awasome";
		m1(inp1);
				
	}
	
	
	public static void m1(String org) 
	{
		TreeMap<Character, Integer> trMap=new TreeMap<>();
		
		for(int i=0; i<=org.length()-1; i++)
		{
			char key = org.charAt(i);
			if(trMap.containsKey(key))
			{
				trMap.put(key, trMap.get(key)+ 1);
			}
			else
			{
				trMap.put(key, 1);
			}			
		}
		
		Set<Character> allkeys = trMap.keySet();
		for(Character key:allkeys)
		{
			System.out.println(key+" : "+trMap.get(key));
		}		
	}
}
