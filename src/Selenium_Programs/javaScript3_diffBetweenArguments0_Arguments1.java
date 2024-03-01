package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScript3_diffBetweenArguments0_Arguments1
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement UN1 = driver.findElement(By.cssSelector("#email"));
		WebElement UN2 = driver.findElement(By.cssSelector("#email"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].value='abc'", UN1,UN2);
		((JavascriptExecutor)driver).executeScript("arguments[1].value='abc'", UN1,UN2);
		
	}
	
	
	

}
