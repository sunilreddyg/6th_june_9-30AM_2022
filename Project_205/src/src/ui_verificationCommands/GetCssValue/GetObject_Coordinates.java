package ui_verificationCommands.GetCssValue;


import java.awt.Toolkit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetObject_Coordinates {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		WebElement LoginButton=driver.findElement(By.xpath("//button[@name='login']"));
		
		//Get selected element x and y coordinates..
		int Objx=LoginButton.getLocation().getX();
		int Objy=LoginButton.getLocation().getY();
		
		System.out.println("Object X location is --> "+Objx);
		System.out.println("Object y location is --> "+Objy);
		
		//Get Browser window Dimensions
		int Obj_ScreenWidth=Toolkit.getDefaultToolkit().getScreenSize().width;
		System.out.println(Obj_ScreenWidth);
		
	
		if(Objx < Obj_ScreenWidth/2 )
			System.out.println("Object located left side of the page");
		else
			System.out.println("Object located right side of the page");
		
		
		//Verify Object is Visble at webpage using x and y coordinates
		if(Objx > 0)
		{
			System.out.println("Object is Visible at webpage");
		}
		else
		{
			System.out.println("Object is not visible at webpage");
		}
		
		
		
		
		
		

	}

}
