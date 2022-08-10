package mq.selenium.launchBrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_FirefoxBrowser {

	public static void main(String[] args) {
		
		/*
		 * Navigation to download geckodriver.exe file
		 * 
		 * 		Step1:--> https://firefox-source-docs.mozilla.org/testing/geckodriver/Support.html
		 * 		Step2:--> Findout Installed firefox browser version
		 * 					Nav:--> Settings---> Help ---> About Firefox
		 * 		Step3:-->  Findout related geckodriver version w.r.t firefox
		 * 						browser and Selenium version
		 * 		Step4:-->  Click on geckodriver releases link
		 * 		Step5:-->  At geckodriver release page under Assets
		 * 					downlaod zip format file for windows w.r.t Hotspot size
		 * 		Step6:--> Once Downloaded unzip file to backup folder
		 * 		Step7:--> Set Environment variable before launch firefox browser..
		 */
		
		
		//Setting Runtime variable for geckodriver.exe file
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		
		//Launching firefoxbrowser
		FirefoxDriver firefox=new FirefoxDriver();
		
		//Loading webpage to firefox browser
		firefox.get("http://facebook.com");
		
		//Get title of the browser window
		System.out.println(firefox.getTitle());
		
		//Close automation browser window
		firefox.close();
	}

}
