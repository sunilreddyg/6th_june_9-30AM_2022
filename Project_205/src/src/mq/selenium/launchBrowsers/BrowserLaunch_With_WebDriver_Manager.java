package mq.selenium.launchBrowsers;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch_With_WebDriver_Manager
{

	public static void main(String[] args) 
	{
		
		/*
		 * Download Webdriver Manager:-->
		 *   =>https://jar-download.com/artifact-search/webdrivermanager
		 *   =>Download Webdriver 5 Version
		 *   => It is a zipformat file unzip file to backup
		 *      folder and configure all jar files to  project..
		 */
		
		//This feature only works in webdrier manager 5 version
		
		WebDriver driver1=WebDriverManager.chromedriver().create();
		driver1.get("http://facebook.com");
		
		
		WebDriver driver2=WebDriverManager.firefoxdriver().create();
		driver2.get("http://instagram.com");
		
		
		WebDriver driver3=WebDriverManager.iedriver().create();
		driver3.get("http://google.com");
		
		
		
	}

}
