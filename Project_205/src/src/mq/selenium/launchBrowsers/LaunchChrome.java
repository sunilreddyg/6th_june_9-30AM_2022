package mq.selenium.launchBrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Download chromedriver.exe file
		 * 	=> Visit site https://www.selenium.dev/downloads/
		 * 	=> Scoll down until find Browser menu
		 *  => Click on + Button to see list of browser drivers
		 *  => Under chrome click on Documentation link
		 *  => download latest chromedriver w.r.t chrome browser version
		 *  => click on latest stable release version
		 *  => Select Operating system[Windows] and download zip format file
		 *  => After download unzip the file to backup folder
		 *  => After unzip we receive chromedriver.exe  executable file
		 *  => Create user environment variable for chromedriver before launch
		 */
		
		
		//setting runtime environment variable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		
		//Launching chrome automation browser
		ChromeDriver chrome=new ChromeDriver();
		
		//load webpage
		chrome.get("https://www.facebook.com/");
		
		//Return page title
		System.out.println(chrome.getTitle());
		
		//Close Browser
		chrome.close();
		
		
	}

}
