package ui_verificationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_pageTitle {

	public static void main(String[] args) {
		

		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
		
		if(driver.getTitle().equals("Instagram"))
		{
			System.out.println("Instagram Page Title Verified");
			WebElement Locations=driver.findElement(By.xpath("//*[text()='Locations']"));
			Locations.click();
			
			if(driver.getTitle().contains("Locations"))
				System.out.println("Locations Page title Verified");
			else
				System.out.println("Locations Page title mismatched");
		}
		else
		{
			System.out.println("Instagram Page title mismatched");
		}
		

	}

}
