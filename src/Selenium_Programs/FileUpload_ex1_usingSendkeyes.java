package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_ex1_usingSendkeyes
{
	public static void main(String[] args) throws InterruptedException {
			
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		Thread.sleep(5000);	
		String filepath="D:\\3rd Ferb 23\\Java\\DefaultConstructor.png";
		driver.findElement(By.id("uploadfile_0")).sendKeys(filepath);
		
	}

}
