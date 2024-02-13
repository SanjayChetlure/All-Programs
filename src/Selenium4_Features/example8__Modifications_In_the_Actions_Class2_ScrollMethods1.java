package Selenium4_Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example8__Modifications_In_the_Actions_Class2_ScrollMethods1
{
	public static void main(String[] args) throws InterruptedException
	{
//		System.setProperties("browser name","browser");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		Thread.sleep(2000);		
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='Help']"));
		act.scrollToElement(ele).perform();	
	}
}
