package MultiThreading;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer>
{	
	public int compare(Integer n1, Integer n2)
	{
		return (n1<n2)?-1: (n1>n2)? 1:0;
	}
	
	//(n1,n2)-> (n1<n2)?-1: (n1>n2)? 1:0;
}