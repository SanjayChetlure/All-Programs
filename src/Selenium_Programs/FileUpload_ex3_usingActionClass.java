package Selenium_Programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload_ex3_usingActionClass
{
	public static void main(String[] args) throws InterruptedException, AWTException {
			
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		Thread.sleep(5000);	
		String filepath="C:\\Users\\sanja\\OneDrive\\Lecture4_1stJavaProgram.pdf";
		
		
		driver.findElement(By.id("pickfiles")).click();
		
		Thread.sleep(3000);	
			
		Actions act= new Actions(driver);
		
		act.sendKeys(filepath).sendKeys(Keys.ENTER).build().perform();
		
	}

}
