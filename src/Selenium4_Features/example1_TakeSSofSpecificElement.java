package Selenium4_Features;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class example1_TakeSSofSpecificElement
{
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		
		
		File src = logo.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Study\\Notes\\Selenium\\Selenium 4 Features\\SS_Folder\\logo.jpg");
		FileHandler.copy(src, dest);
	
	}
}
