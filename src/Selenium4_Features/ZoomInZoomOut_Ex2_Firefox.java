package Selenium4_Features;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ZoomInZoomOut_Ex2_Firefox 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String zoomPer="document.body.style.MozTransform='scale(2)';";
		((JavascriptExecutor)driver).executeAsyncScript(zoomPer);		
	}
}
