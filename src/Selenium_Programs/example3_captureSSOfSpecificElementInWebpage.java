package Selenium_Programs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class example3_captureSSOfSpecificElementInWebpage
{
    public static void main(String[] args) throws IOException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        
        //capture SS of 
        WebElement ele = driver.findElement(By.xpath("//img[@alt='Facebook']"));
       
       
       File src = ele.getScreenshotAs(OutputType.FILE);
       File dest=new File("C:\\Users\\sanja\\OneDrive\\Desktop\\Study\\28Th Jan Eve\\Screenshots\\sample.jpg");
       FileHandler.copy(src, dest);
       
    }
}