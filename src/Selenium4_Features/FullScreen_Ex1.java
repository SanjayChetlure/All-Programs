package Selenium4_Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreen_Ex1
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		
		//enter UN
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		
		
		//enter PWD
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("xyz");
		
		driver.manage().window().maximize();
		
		
		
						
	}
}
