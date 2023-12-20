package Revision2;

public class demo 
{
	String name;
	
	demo(String s1)
	{
		name=s1;
		System.out.println("running regular constructor ");
	}
	
	demo(demo s)
	{
		name=s.name;
		System.out.println("running copy consytructor");
		
	}
	
	public void m1() 
	{
		System.out.println(name);
	}
	
	public static void main(String[] args) 
	{
		
		demo d=new demo("ramesh");
		d.m1();
		
		demo d1=new demo(d);
		d1.m1();
		
	}

}
