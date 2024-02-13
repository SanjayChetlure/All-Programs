package Selenium4_Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Ex3_RelativeLocator2_below
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	//	driver.findElement(RelativeLocator.with(By.tagName("a")).below(By.xpath("//div[@class='_6ltj']"))).click();
		
		//it click element below specified xpath of same level
		
		
		driver.findElement(RelativeLocator.with(By.tagName("a")).below(By.xpath("//button[@name='login']"))).click();
		
	}

}
