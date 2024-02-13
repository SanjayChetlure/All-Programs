package Selenium_Programs;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_Ex6_addCookie
{
	public static void main(String[] args) 
	{
		
		ChromeDriver driver=new ChromeDriver();				
		driver.get("https://tutorialsninja.com/demo/");
		
		Cookie c=new Cookie("", "");
		driver.manage().addCookie(c);
		
		driver.quit();
		
	}
}
