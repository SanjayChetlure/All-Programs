package Selenium4_Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Ex3_RelativeLocator4_toRightOf
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.xpath("//input[@class='gsc-input']"))).click();
		
	}

}
