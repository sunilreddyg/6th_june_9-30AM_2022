package ui_verificationCommands.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetOptions 
{

	public static void main(String[] args) {
		
		/*
		 * Faq:--> How to Count Numbers of options
		 * 			available in Dropdown
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		
		WebElement Month_DD=driver.findElement(By.xpath("//select[@id='month']"));

		//Get All Options Under Dropdown
		int Count=new Select(Month_DD).getOptions().size();
		
		//Testcase:--> Verify Month dropdown contains expected Option count
		//Expected:--> Expected Count is 12
		
		if(Count==12)
			System.out.println("Testpass");
		else
			System.out.println("Testfail");
	}

}
