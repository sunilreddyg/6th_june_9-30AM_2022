package mq.selenium.launchBrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManager_SetUp {

	public static void main(String[] args)
	{
		
		//use below syntax in  WebDrivermanager 4 version 
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://facebook.com");
	}

}
