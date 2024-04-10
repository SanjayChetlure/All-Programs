package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowElement_Ex1
{
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("chrome://settings/appearance");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
//		driver.findElement(By.tagName("settings-ui")).getShadowRoot()
//		.findElement(By.cssSelector("[id='main']")).getShadowRoot()
//		.findElement(By.cssSelector(".cr-centered-card-container")).getShadowRoot()
//		.findElement(By.cssSelector("[section='appearance']")).getShadowRoot()
//		.findElement(By.tagName("settings-appearance-page")).getShadowRoot()
//		.findElement(By.cssSelector("[section='appearance']")).getShadowRoot()
//		.findElement(By.cssSelector("[label='Show home button']")).getShadowRoot()
//		.findElement(By.cssSelector("[label='Show bookmarks bar']")).getShadowRoot()
//		.findElement(By.cssSelector("[role='button']")).getShadowRoot()
//		.findElement(By.cssSelector("#knob")).click();
		
		
		driver.findElement(By.tagName("settings-ui")).getShadowRoot()
		.findElement(By.cssSelector("#main")).getShadowRoot()
		.findElement(By.tagName("settings-basic-page")).getShadowRoot()
		.findElement(By.tagName("settings-section")).getShadowRoot()
		.findElement(By.tagName("settings-appearance-page")).getShadowRoot()
		.findElement(By.cssSelector("#pages")).getShadowRoot()
		.findElement(By.cssSelector(".first")).getShadowRoot()
		.findElement(By.xpath("//div[contains(text(),'Theme')]")).click();
		
	}

}
