package C_Wad_batch_Selenium_Programs;

import org.testng.annotations.Test;

public class example4_threadPoolSize
{
	@Test(threadPoolSize = 2, invocationCount = 5)
    public void TC1()
    {
       System.out.println("Thread Size:- "+Thread.currentThread().getId());
    }
}