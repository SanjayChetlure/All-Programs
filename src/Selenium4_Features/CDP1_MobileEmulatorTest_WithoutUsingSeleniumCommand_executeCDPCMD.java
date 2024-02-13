package Selenium4_Features;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class CDP1_MobileEmulatorTest_WithoutUsingSeleniumCommand_executeCDPCMD 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		DevTools dt = driver.getDevTools();   //
		dt.createSession();
		
		Map deviceMatrix=new HashMap();
		deviceMatrix.put("width", 600);
		deviceMatrix.put("height", 600);
		deviceMatrix.put("deviceScaleFactor", 60);
		deviceMatrix.put("mobile", true);
		
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMatrix);
	
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
