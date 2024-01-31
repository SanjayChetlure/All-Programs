package Selenium4_Features;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_BrowserMinimize
{
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		driver.manage().window().minimize();
		

	}
	
	

}
