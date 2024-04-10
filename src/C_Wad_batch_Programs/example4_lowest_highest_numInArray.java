package C_Wad_batch_Programs;

import java.util.Arrays;

public class example4_lowest_highest_numInArray
{

	public static void main(String[] args)
	{
		
		int [] ar= {10,20,50,50,40,40,40};
		
		Arrays.sort(ar);    //10,20,40,40,40,50,50
		
		System.out.println(ar[0]);
		System.out.println(ar[ar.length-1]);
			
	}
}
