package ui_verificationCommands.GetCssValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Coordinates 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		
		
		int Window_x=driver.manage().window().getSize().getWidth();
		System.out.println(Window_x);
		
		int Custom_WindowSize=Window_x/2;
		System.out.println(Custom_WindowSize);
		
		WebElement loginButton=driver.findElement(By.xpath("//a[@title='Jobseeker Login']"));
		int Login_Coorindates=loginButton.getLocation().getX();
		System.out.println(Login_Coorindates);
		
		if(Login_Coorindates > Custom_WindowSize)
		{
			System.out.println("Object Presented at right side of the page");
		}
		else
		{
			System.out.println("Object Not available at right side of the page");
		}

	}

}
