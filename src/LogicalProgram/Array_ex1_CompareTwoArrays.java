package LogicalProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;


public class Array_ex1_CompareTwoArrays
{
	public static void main(String[] args) 
	{
		int ar1 []= {10,30,40,50};
		int ar2 []= {10,30,40,50};
		
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		System.out.println(Arrays.equals(ar1, ar2));
	}
}
