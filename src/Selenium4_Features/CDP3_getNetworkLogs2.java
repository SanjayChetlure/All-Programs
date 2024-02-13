package Selenium4_Features;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v119.fetch.Fetch;


public class CDP3_getNetworkLogs2
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		DevTools dt = driver.getDevTools();
		dt.createSession();
		
		//start listning for all the enables calls
		//Targeting specific request
		//provide what pattern of request we want to receive (.css , .jpg , grtAuthorName)-> need to mention reg exp
		dt.send(Fetch.enable(Optional.empty(), Optional.empty()));
		
		//listen event to happen   -> listen until event is fired
		dt.addListener(Fetch.requestPaused(), request->
		{
			if (request.getRequest().getUrl().contains("shetty"))
			{
				String newURL=request.getRequest().getUrl().replace("=shetty", "=BadGuy");	
				System.out.println(newURL);
				System.out.println("Hi");
				
				dt.send(Fetch.continueRequest(request.getRequestId(), Optional.of(newURL), Optional.of(request.getRequest().getMethod()), Optional.empty(), Optional.empty(), Optional.empty()));
			}
			else
			{
				dt.send(Fetch.continueRequest(request.getRequestId(), Optional.of(request.getRequest().getUrl()), Optional.of(request.getRequest().getMethod()), Optional.empty(), Optional.empty(), Optional.empty()));
			}
				
		});
		
		System.out.println("-----Enter URL-----");
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		Thread.sleep(2000);
		
		//click on "library" link
		System.out.println("click on library link-------");
		driver.findElement(By.xpath("//a[text()='Library']")).click();
		
		Thread.sleep(2000);
		
		String result = driver.findElement(By.xpath("//p")).getText();
		System.out.println(result);
	
	}
}


