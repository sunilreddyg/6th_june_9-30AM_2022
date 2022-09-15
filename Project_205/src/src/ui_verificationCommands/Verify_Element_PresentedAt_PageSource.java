package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Element_PresentedAt_PageSource {

	public static void main(String[] args) 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		if(driver.getPageSource().contains("email@123"))
		{
			System.out.println("Element is Presented at source");
			driver.findElement(By.id("email")).sendKeys("Admin");
		}
		else
		{
			System.out.println("Element is Not presented At source");
		}
		
		
		//Handle Elemnet Presented At source using Try Catch 
		try {
			driver.findElement(By.id("pass11")).sendKeys("Hello");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Run Continued");
		

	}

}
