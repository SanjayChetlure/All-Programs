package Selenium4_Features;
import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v121.emulation.Emulation;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CDP2_SetGeoLocationOverride3
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		DevTools dt = driver.getDevTools();
		dt.createSession();
		
		dt.send(Emulation.setGeolocationOverride(Optional.of(52.5043), Optional.of(13.4501), Optional.of(0)));
		
		driver.get("https://mylocation.org/");
			
	}
}
