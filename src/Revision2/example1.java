package Revision2;

import java.util.HashMap;

public class example1 
{
	//inp:- abacbba
	//oup:- a1b1a2c1b2b3a3
	
	public static void main(String[] args) 
	{
		String inp= "abacbba";
		String oup="";    //a1b1a2
		HashMap<Character, Integer> mp=new HashMap<>();
		
		//           2<=6
		for(int i=0; i<=inp.length()-1; i++)
		{          //            2
			char s1 = inp.charAt(i);     //a
			
			if(mp.containsKey(s1))    // true
			{
				mp.put(s1, mp.get(s1)+1);    //a, 1+1=2
			}
			else
			{
				mp.put(s1, 1);    // b, 1
			}
			
			oup=oup+s1+mp.get(s1);    // a1b1 + a + 2  = a1b1a2
		}
		
		System.out.println(oup);	
	}
}
