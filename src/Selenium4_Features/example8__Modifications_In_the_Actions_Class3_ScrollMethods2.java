package Selenium4_Features;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example8__Modifications_In_the_Actions_Class3_ScrollMethods2
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		
		//scroll down by 200 pixcel
		act.scrollByAmount(0, 200).perform();;
		
		Thread.sleep(2000);
		
		//scroll up by -100 pixcel
		act.scrollByAmount(0, -100).perform();;	
	}
}
