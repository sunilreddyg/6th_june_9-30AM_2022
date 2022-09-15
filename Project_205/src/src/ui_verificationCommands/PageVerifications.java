package ui_verificationCommands;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageVerifications {

	public static void main(String[] args) {
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Get current window page titlte
		String PageTitle=driver.getTitle();
		System.out.println("Current Page Title is --> "+PageTitle);
		
		
		//Get Current Window Url
		String Pageurl=driver.getCurrentUrl();
		System.out.println("Current Page Url is --->"+Pageurl);
		
		
		//Get Current Window Dynamic ID
		String WIndowID=driver.getWindowHandle();
		System.out.println("Window ID is --> "+WIndowID);
		
		//Get pagesource
		String Pagesource=driver.getPageSource();
		System.out.println(Pagesource);
		
		
	}

}
