package mq.java.Condition_Statemetns;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elseif_Statements {

	public static void main(String[] args) throws Exception 
	{
	
		//Multiple decisions take place here
		
		String browser="ie";
		
		if (browser.equals("chrome")) 
		{
			System.out.println("Open Chrome browser");
		}
		else if (browser.equals("firefox")) 
		{
			System.out.println("Open Firefox Browser");
		}
		else if (browser.equals("ie")) 
		{
			System.out.println("Ie browser opened");
		}
		else 
		{
			System.out.println("No Browser matching");
		}
		
	
		//Test with multiple browsers
		
		String browsername="firefox";
		WebDriver driver=null;
		if(browsername.equals("chrome"))
		{
			 driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		}
		else if(browsername.equals("firefox"))
		{
			driver=WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		}
		
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.close();

	}

}
