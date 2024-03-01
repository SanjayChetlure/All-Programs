package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScript1_clickOnWebelement
{
	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement ele = driver.findElement(By.cssSelector("[id^='u_0_5']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", ele);
		
	}
	
	
	

}
