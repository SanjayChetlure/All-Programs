package MultiThreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AttaylistTest
{
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(50);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		
		//Collections.sort(al);
		
		//Collections.sort(al, new MyComparator());
		
		Comparator<Integer> c= (n1,n2)-> (n1<n2)?-1: (n1>n2)? 1:0;
		Collections.sort(al,c);		
	}
}
