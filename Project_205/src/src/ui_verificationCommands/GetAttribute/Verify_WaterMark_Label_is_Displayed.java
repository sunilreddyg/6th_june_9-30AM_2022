package ui_verificationCommands.GetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_WaterMark_Label_is_Displayed {

	public static void main(String[] args) {
	
		/*
		 * Testcase:-->
		 * 		Verify watermark label is displayed for 
		 * 		facebook login 
		 * 
		 * 		=> Verify Email water mark label is dislayed "Email address of phone number"
		 * 		=> Verify password water mark label is displayed "Password".
		 * 	
		 * 
		 * */

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");

		WebElement Email=driver.findElement(By.id("email"));
		String Email_Value=Email.getAttribute("placeholder");
		if(!Email_Value.isEmpty())
		{
			if(Email_Value.equals("Email address or phone number"))
				System.out.println("Valid Watermark label displayed for email");
			else
				System.out.println("Invalid Watermark label is displayed for email");
		}
		else
		{
			System.out.println("placeholder property not presented");
		}
		
	
	}

}
