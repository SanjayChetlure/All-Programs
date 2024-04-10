package C_Wad_batch_Programs;

import java.util.LinkedHashSet;

public class example2_RemoveduplicateNumberInArray
{

	public static void main(String[] args)
	{
		
		
		int [] ar= {10,20,50,50,40,40,40};
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		
		for (int num1 : ar) 
		{ 
			if (lhs.add(num1) == false) 
			{ 
				System.out.println(num1);	    //50 
			}
		}

		
		
//		for (int i=0; i<=ar.length-1; i++) 
//		{ 
//			for (int j =i+1 ; j <=ar.length-1; j++)
//			{ 
//				if (ar[i]==ar[j]) 
//				{ 
//					System.out.println(ar[j]);
//					break;
//				}
//			}
//		}	
		
//		HashMap<Integer, Integer> mp=new HashMap<>();
//		for(int num1:ar)
//			if(mp.containsKey(num1))
//			{
//				mp.put(num1, mp.get(num1)+1);
//			}
//			else
//			{
//				mp.put(num1, 1);
//			}
//		
//		Set<Integer> allKeys = mp.keySet();
//		for(Integer key:allKeys)
//		{
//			if(mp.get(key)>1)
//			{
//				System.out.println(key+"-"+mp.get(key));
//			}
//		}
	
	
		
		
		
	}
}
