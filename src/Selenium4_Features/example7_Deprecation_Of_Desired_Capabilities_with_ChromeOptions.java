package Selenium4_Features;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class example7_Deprecation_Of_Desired_Capabilities_with_ChromeOptions 
{

	public static void main(String[] args) {
		
		//DesiredCapabilities ds=new DesiredCapabilities();
		//replaced with
		ChromeOptions co=new ChromeOptions();
		
	}
}
