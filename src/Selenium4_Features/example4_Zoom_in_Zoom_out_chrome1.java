package Selenium4_Features;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_Zoom_in_Zoom_out_chrome1 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String zoomPer="document.body.style.zoom='150%';";
		((JavascriptExecutor)driver).executeAsyncScript(zoomPer);
		
	}
}
