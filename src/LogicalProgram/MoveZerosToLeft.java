package LogicalProgram;

public class MoveZerosToLeft {

	public static void main(String[] args) {
	
		int input[]= {1,4,0,2,0,5,0,8,0,3,6,0,7};
		int zeroCount=0;//for required array indexing
		
		for(int i=0;i<=input.length-1;i++)
		{
			if(input[i]==0)//1,1,2
			{
				zeroCount++;//counting number of zeros//5
			}
		}
				
		int required[]=new int[input.length];//as length of input array
		
		for(int num:input)//1,4
		{
			if(num!=0)//if value is non zero
			{
				required[zeroCount]=num; //req[]={1,4,2,5,8,3,6,7}
				//required[5]=num;
				zeroCount++;
			}
			
		}
		
		for(int i=0;i<=required.length-1;i++)// for loop to print required array
		{
			System.out.print(required[i]+" ");
		}
		
		
	}

}