package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5 
{
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("");
		
	}
	
	
	

}
