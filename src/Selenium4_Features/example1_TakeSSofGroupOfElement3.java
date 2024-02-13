package Selenium4_Features;

import java.io.File;
import java.io.IOException;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class example1_TakeSSofGroupOfElement3
{
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		driver.manage().window().maximize();
		
		WebElement form = driver.findElement(By.xpath("//form[@id='hs-login']"));
		File src = form.getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Study\\Notes\\Selenium\\Selenium 4 Features\\SS_Folder\\form.jpg");
		FileHandler.copy(src, dest);
		
		Predicate<URI> p=uri ->uri.
	
	}
}
