package ui_verificationCommands.GetCssValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetObejct_Sizes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		WebElement LoginButton=driver.findElement(By.xpath("//button[@name='login']"));
		
		//Get Object height and width
		int objheight=LoginButton.getSize().getHeight();
		int objwidth=LoginButton.getSize().getWidth();
		
		System.out.println(objheight+"     "+objwidth);
		
		//Checking object visiblity using height and width of the object
		if(objheight > 0)
			System.out.println("Object is visible at webpage");
		else
			System.out.println("Object is Not visible at webpage");
		
	}

}
