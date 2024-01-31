package MultiThreading;
public class MyRunnable implements Runnable
{
	public void run() 
	{
		for (int i = 1; i <=10; i++)
		{
			System.out.println("child Thtread -1");
		}
		
		//c= (n1,n2)-> (n1<n2)?-1: (n1>n2)? 1:0
	}
}
