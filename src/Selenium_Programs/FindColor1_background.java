package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class FindColor1_background
{
	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yatra.com/");
		
		WebElement ele = driver.findElement(By.cssSelector("[value='Check Your Refund']"));
		String clr =ele.getCssValue("background");
		System.out.println(clr);
		
		String hexClr = Color.fromString(clr).asHex();
		System.out.println(hexClr);
		
		
		
		//use colour checker website
		
	}
	
	
	

}
