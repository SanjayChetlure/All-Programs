package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Ex1_clickUsingJavascript
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='Create new account']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", ele);
		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("document.getElementById('gbqfb').click();");
		
		Thread.sleep(5000);
		
		driver.close();
		
	}
	

}
