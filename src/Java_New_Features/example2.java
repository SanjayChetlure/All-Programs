package Java_New_Features;

import com.google.common.base.Predicate;

public class example2
{
	//verify given num is Even or not
	
	public static void main(String[] args) 
	{
		Predicate<Integer> p=i-> i%2==0;
		System.out.println("Given num 4 is:- "+p.test(4));
		
	}

}
