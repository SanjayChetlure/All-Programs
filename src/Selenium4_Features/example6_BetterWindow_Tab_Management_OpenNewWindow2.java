package Selenium4_Features;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_BetterWindow_Tab_Management_OpenNewWindow2
{
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("before switching:- "+driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com/");
		System.out.println("after switching:- "+driver.getTitle());
//
//		
//		 Set<String> allIDS = driver.getWindowHandles();
//		 ArrayList<String> al=new ArrayList<>(allIDS);
//		
//		Thread.sleep(2000);
//		
//		driver.close();
//		driver.switchTo().window(al.get(0));
//		System.out.println("after closing new TAB:- "+driver.getTitle());
		
	}
	
	

}
