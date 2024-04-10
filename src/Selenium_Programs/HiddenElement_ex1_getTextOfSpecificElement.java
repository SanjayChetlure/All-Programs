package Selenium_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement_ex1_getTextOfSpecificElement 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		List<WebElement> allElements = driver.findElements(By.xpath("//div[@id='nav-xshop-container']//a"));
		int count=0;
		
		for(WebElement s1:allElements)
		{	count++;
			 String text = (String) ((JavascriptExecutor) driver).executeScript( "return arguments[0].innerHTML", s1);
			System.out.println(count+": "+text);
			
		}		
	}
}
