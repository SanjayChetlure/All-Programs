package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScript2_EnterValueInTextbox
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
			
		WebElement UN = driver.findElement(By.cssSelector("#email"));
		((JavascriptExecutor)driver).executeScript("arguments[1].value='abc'", UN);
		
	}
}
