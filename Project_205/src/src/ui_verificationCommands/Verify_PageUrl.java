package ui_verificationCommands;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_PageUrl 
{

	public static void main(String[] args) 
	{
		
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
		
		//Decision to verify Secured Protocal available for Current page
		if(driver.getCurrentUrl().contains("https://"))
		{
			System.out.println("Page is Secured");
		}
		else
		{
			System.out.println("Page is Not Secured");
		}

	}

}
