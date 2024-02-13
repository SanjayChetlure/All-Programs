package Selenium4_Features;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v120.network.Network;
import org.openqa.selenium.devtools.v120.network.model.Request;
import org.openqa.selenium.devtools.v120.network.model.Response;



public class CDP3_getNetworkLogs
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		DevTools dt = driver.getDevTools();
		dt.createSession();
		
		//Enbale network connection -> chrome devtool can give to traffic to client/selenium
		dt.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
	
		//to know request information -> what is request is sending   --> 
		//call -> requesWillBeSent
		dt.addListener(Network.requestWillBeSent(), request->
		{
			Request req = request.getRequest();
			//System.out.println(req.getUrl());
			//System.out.println(req.getHeaders());
		});
		
		
		System.out.println("---------");
		
		//this event is Fired when HTTP response is available.
		dt.addListener(Network.responseReceived(), response->
		{
			Response resp = response.getResponse();
		
			if(resp.getStatus().toString().startsWith("4"))
			{
				System.out.println(resp.getUrl()+" is failed with SC:- "+resp.getStatus());
			}			
		} );
		
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()=' Virtual Library ']")).click();
		
	}
}


