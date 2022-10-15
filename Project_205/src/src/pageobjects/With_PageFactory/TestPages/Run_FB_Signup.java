package pageobjects.With_PageFactory.TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.With_PageFactory.Pages.FB_Signup;

public class Run_FB_Signup {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Inorder to identify @Findby objects we must access through pageFactory Class only
		FB_Signup Signup=PageFactory.initElements(driver, FB_Signup.class);
		Signup.CreateAccountButton.click();
		Thread.sleep(2000);
		Signup.CreateAccount("Pavani", "Kumari", "pavani@gmail.com");
	}

}
