package ui_verificationCommands.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_First_Selected_Option {

	public static void main(String[] args) 
	{
		
		
		/*
		 * FAQ:--> How to verify Required option
		 * 		   selected at dropdown..
		 */
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		
		//Capture Selected Dropdown Option Name
		WebElement Month_DD=driver.findElement(By.xpath("//select[@id='month']"));
		String OptionName=new Select(Month_DD).getFirstSelectedOption().getText();
		if(OptionName.equals("Sep"))
		{
			System.out.println("Required Option is Selected");
		}
		else
		{
			System.out.println("Required option is not selected");
		}
		
		
	}

}
