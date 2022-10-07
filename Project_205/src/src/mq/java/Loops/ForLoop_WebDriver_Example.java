package mq.java.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForLoop_WebDriver_Example 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		String Footerlinks[][]= 
					{
							{"Sign Up","Sign up for Facebook | Facebook"},
							{"Log in","Log in to Facebook"},
							{"Messenger","Messenger"},
							{"Facebook Lite","Facebook Lite APK for Android"},
							{"Watch","Facebook Watch | Facebook"},
					};
		
		
		for (int i = 4; i < Footerlinks.length; i++) 
		{
			String[] Eachrow = Footerlinks[i];
			driver.findElement(By.linkText(Eachrow[0])).click();
			Thread.sleep(2000);
			
			if(driver.getTitle().equals(Eachrow[1]))
			{
				System.out.println(Eachrow[0]+" ---->>    Title Presented");
			}
			else
			{
				System.out.println(Eachrow[0]+" ----->>    Title Not Presented");
			}
			
			//navigate back to previous page
			driver.navigate().back();
			
		}
		

	}

}
