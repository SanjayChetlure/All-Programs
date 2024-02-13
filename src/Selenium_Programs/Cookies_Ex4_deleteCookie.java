package Selenium_Programs;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies_Ex4_deleteCookie
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();				
		driver.get("https://tutorialsninja.com/demo/");
		
		System.out.println("-----Before delete any Coockie------");
		Set<Cookie> allCookies = driver.manage().getCookies();
		allCookies.forEach(i->System.out.println(i));
		
		
		ArrayList<Cookie> al=new ArrayList(allCookies);
		
		
		System.out.println("------After deleting specific coockie-----");
		driver.manage().deleteCookie(al.get(0));
		
		
		Set<Cookie> allCookies1 = driver.manage().getCookies();
		allCookies1.forEach(i->System.out.println(i));
		
		driver.quit();
	}
}
