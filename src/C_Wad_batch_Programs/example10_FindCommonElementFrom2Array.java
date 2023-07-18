package C_Wad_batch_Programs;

public class example10_FindCommonElementFrom2Array
{
	public static void main(String[] args)
	{
		
		int [] ar1= {10,40,30,40};
		int [] ar2= {10,60,30,20};
		
		
		for(int i=0; i<=ar1.length-1; i++)
		{
			for(int j=0; j<=ar2.length-1; j++)
			{
				if(ar1[i]==ar2[j])
				{
					System.out.println(ar1[i]);
				}
			}	
		}	
	}
}
