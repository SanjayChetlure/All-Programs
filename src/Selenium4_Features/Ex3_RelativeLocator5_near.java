package Selenium4_Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Ex3_RelativeLocator5_near
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(RelativeLocator.with(By.xpath("")).near(By.xpath("//a[text()='Places']"))).click();
		
		//it will find element near (left,right,above,below) of specified element
		
		
		
	}

}
