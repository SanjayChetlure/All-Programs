package Selenium_Programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_ex2_usingRobotClass
{
	public static void main(String[] args) throws InterruptedException, AWTException {
			
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		Thread.sleep(5000);	
		String filepath="D:\\3rd Ferb 23\\Java\\Notes\\Lecture4_1stJavaProgram.pdf";
				
		driver.findElement(By.id("pickfiles")).click();
		
		Thread.sleep(3000);	
				
		Robot r=new Robot();
		StringSelection ss=new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
				
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
