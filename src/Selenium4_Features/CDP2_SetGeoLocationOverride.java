package Selenium4_Features;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;


public class CDP2_SetGeoLocationOverride
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		DevTools dt = driver.getDevTools();
		dt.createSession();
		
		Map<String, Object> mapCoOrdinates=new HashMap<String, Object>();
		mapCoOrdinates.put("latitude", 51);
		mapCoOrdinates.put("longitude", 50);
		mapCoOrdinates.put("accuracy", 100);       //1 meter 
		driver.executeCdpCommand("Emulation.setGeolocationOverride", mapCoOrdinates);
		
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("netflix",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).click();
	
		Thread.sleep(3000);
		
		String text = driver.findElement(By.xpath("//h1[@class='default-ltr-cache-jpuyb8 e9eyrqp8']")).getText();
		System.out.println(text);
	
	}
}
