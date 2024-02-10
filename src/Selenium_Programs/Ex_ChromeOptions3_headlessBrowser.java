package Selenium_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ex_ChromeOptions3_headlessBrowser
{
	public static void main(String[] args) {
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		
		driver.quit();	
	}
}
