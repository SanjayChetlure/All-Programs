package Selenium4_Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Ex3_RelativeLocator1_above
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	
		//driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.xpath("//input[@type='password']"))).sendKeys("abc");
				
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.xpath("//input[@name='pass']"))).sendKeys("abc");
	}
}
