package Selenium4_Features;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class example1_TakeSSofSpecificElementApproach1
{
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		driver.manage().window().maximize();
		
		WebElement UN = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement PWD = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@id='loginBtn']"));	
				
		UN.sendKeys("abc");
		PWD.sendKeys("xyz");
		
		captureSS(UN, "Username");
		captureSS(PWD, "Password");
		captureSS(LoginBtn, "LoginBtn");
	}
	
	public static void captureSS(WebElement ele, String filePath) throws IOException 
	{
		File src = ele.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Study\\Notes\\Selenium\\Selenium 4 Features\\SS_Folder\\"+filePath+".jpg");
		FileHandler.copy(src, dest);
	}

}
