package Selenium4_Features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.By;

public class Ex3_RelativeLocator3_toLeftOf
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("//input[@class='gsc-search-button']"))).sendKeys("abc");
		
		//it click element toLeft of specified xpath
	}

}
