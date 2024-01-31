package Java_New_Features;

import java.util.function.Function;

public class example1 
{
//	public static int squarOffnum(int num) 
//	{
//		return num*num;
//	}
//	
//	public static void main(String[] args) 
//	{
//		System.out.println("square of num 4:- "+squarOffnum(4));
//		System.out.println("square of num 5:- "+squarOffnum(5));
//	}
	
	public static void main(String[] args) 
	{
		Function<Integer, Integer> f=i->i*i;
		System.out.println("square of num 4:-"+f.apply(4));
		System.out.println("square of num 5:-"+f.apply(5));		
	}

}
