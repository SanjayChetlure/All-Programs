package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class FindColourOfWebelement 
{
	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://blazedemo.com/");
		
		String expClr="#006dcc";
		
		WebElement ele = driver.findElement(By.cssSelector(".btn.btn-primary"));
		
		String clr =ele.getCssValue("background-color");
		
		System.out.println(clr);
		
		
		String actHexClr = Color.fromString(clr).asHex();
		System.out.println(actHexClr);
		
		if (expClr.equals(actHexClr)) 
		{
			System.out.println("clr match");
		} 
		else
		{
			System.out.println("clr not match");
		}	
	}
}
