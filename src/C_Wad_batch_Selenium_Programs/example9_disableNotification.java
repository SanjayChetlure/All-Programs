package C_Wad_batch_Selenium_Programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class example9_disableNotification 
{
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(op);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
	}
}