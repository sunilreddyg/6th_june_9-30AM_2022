package pageobjects.With_PageFactory.TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.With_PageFactory.TestCases.TestCases;
import pageobjects.Without_pageFactory.TestCase1;

public class Run_TestCases {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
		TestCases tc001=new TestCases(driver);
		tc001.AddNewuser_Admin_InvalidData();
		
		

	}

}
