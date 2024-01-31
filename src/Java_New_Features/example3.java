package Java_New_Features;

public class example3
{
	//   ->  gives
	
	//eg1:-
//	public void name()
//	{
//		System.out.println("Hi");
//	}
	
	()->{System.out.println("Hi"); }
	
	
	//eg2:-
//	public static void add(int a, int b) 
//	{
//		System.out.println(a+b);
//	}
	
(a, b) -> System.out.println(a+b);

//eg3:- 
//public int name(int n) 
//{
//	return n*n;
//}
(int n) ->  {return n*n; }    //with { } need to call return keyword
(int n) ->  n*n;
(n) ->  n*n;
n ->  n*n;        // for 1 para  -> () optional 

//eg4:-  find length of string
//public int name(String s1) 
//{
//	return s1.length();
//}

(s1)-> s1.length();
s1-> s1.length();


--------------------------------------------

How to call lambda exp? 
FI -> functional interface :- wont may be mute

word
old

Runnable -> run()
comparable -> compareTo()
CompareTo  -> compare()
ActionListner -> actionPerformed()
callable   -> call()
all are functional interface
Note:- common point is all are interfaces which contains only 1 methods

An Interface contains Single abstract methods(SAM) are known as functional interfaces
but It can contains any no of default & static methods
public Interf
{
	public abstract m5();
	void m2()     
	{
		
	}	
	public static void name()
	{
		
	}
}

use of functional interfaces?
-> to call(invoke) lambda exp FI are imp	




-----------Feature 3: Default method & Static method--------------










}
