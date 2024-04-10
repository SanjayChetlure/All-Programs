package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement_ex2_clickOnSpecificElement
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Fashion']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", ele);	
	}
}
