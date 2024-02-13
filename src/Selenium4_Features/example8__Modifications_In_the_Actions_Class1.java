package Selenium4_Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example8__Modifications_In_the_Actions_Class1 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("");
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath(""));
				
		act.moveToElement(ele).click().perform();
		//Replaced with
		act.click(ele).perform();
		
		
		act.moveToElement(ele).doubleClick().perform();
		//Replaced with
		act.doubleClick(ele).perform();
		
		
		act.moveToElement(ele).contextClick().perform();
		//Replaced with
		act.contextClick(ele).perform();
		
		
		act.moveToElement(ele).clickAndHold().perform();
		//Replaced with
		act.clickAndHold(ele).perform();
			
	}
}
