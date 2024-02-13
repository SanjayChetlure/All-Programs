package Selenium4_Features;
import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v121.emulation.Emulation;


public class CDP2_SetGeoLocationOverride2
{
	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		DevTools dt = driver.getDevTools();
		dt.createSession();
		
		dt.send(Emulation.setGeolocationOverride(Optional.of(52.5043), Optional.of(13.4501), Optional.of(1)));
		
		driver.get("https://mylocation.org/");
		
	
	}
}
