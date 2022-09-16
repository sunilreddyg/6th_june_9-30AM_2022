package ui_verificationCommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Verify_TextVisible_At_Webpage 
{

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Scenario:  Verify Email validation using blank
		 * 		Given site url is "http://outlook.com"
		 * 		And click on Sign in button
		 * 		When User Enter invalid email
		 * 		And click on next button
		 * 		Then verify Error message displayed "Enter a valid email address, phone number, or Skype name."
		 */
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		
		
		WebElement Signin_btn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		Signin_btn.click();
		Thread.sleep(3000);
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='i0116']"));
		Email.sendKeys("info.dsnr@gmail.com");
		
		WebElement Next_btn=driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		Next_btn.click();
		Thread.sleep(3000);
	
		String Exp_text="That Microsoft account doesn't exist. Enter a different account or get a new one.";
		
		
		//Identify webpage
		WebElement Page=driver.findElement(By.tagName("body"));
		String PageText=Page.getText();
		//System.out.println(PageText);
		
		if(PageText.contains(Exp_text))
		{
			System.out.println("Testpass, Text visible at webpage");
		}
		else
		{
			System.out.println("Testfail, Text not visible at webpage");
		}
		
		
		
	}
}
