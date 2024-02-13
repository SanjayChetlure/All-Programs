package Selenium_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWait_Ex2_ExplicitWait
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
				
//		driver.findElement(By.xpath("")).click();		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.alertIsPresent());
		
		
//		driver.findElement(By.xpath("")).click();		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		
		driver.findElement(By.xpath("")).sendKeys("Username");	
		driver.findElement(By.xpath("")).sendKeys("password");	
		WebElement loginBtn = driver.findElement(By.xpath(""));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
		loginBtn.click();
			
		
		driver.findElement(By.xpath("")).click();
		//driver.findElement(By.xpath("")).getText();		
	}
}
