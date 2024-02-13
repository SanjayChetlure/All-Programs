package Selenium4_Features;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v121.emulation.Emulation;


public class CDP1_MobileEmulatorTest_customSeleniumMethod
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//initialize devTool object
		DevTools dt = driver.getDevTools();   //
		
		//create a session with devtool 
		//it will Intiatiate selenium code & browser 
		//after that we can send command		
		dt.createSession();
		
		//send command to CDP-> CDP methods will invoke & get access to chrome devTool
		dt.send(Emulation.setDeviceMetricsOverride(375, 667, 65, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
	
	
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		Thread.sleep(3000);
		//click on navigation toggle 
		driver.findElement(By.xpath("//button[@class='navbar-toggler']")).click();
		
		Thread.sleep(2000);
		//click on library link
		driver.findElement(By.xpath("//a[text()='Library']")).click();
		
		
//		these are custom selenium commands
//		but some cases cutom selenium commands are not available 
//		in this case we can direct call cdp commands.
		
	}

}
