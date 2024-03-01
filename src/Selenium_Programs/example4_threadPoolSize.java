package Selenium_Programs;



public class example4_threadPoolSize
{
	//@Test(threadPoolSize = 2, invocationCount = 5)
	@Test
    public void TC1()
    {
       System.out.println("Thread Size:- "+Thread.currentThread().getId());
    }
	
	
	
}