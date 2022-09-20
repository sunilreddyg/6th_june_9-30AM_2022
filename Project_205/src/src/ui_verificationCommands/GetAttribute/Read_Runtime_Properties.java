package ui_verificationCommands.GetAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_Runtime_Properties 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Scenario:--> Verifying Double Seat fares Disabled
		 * 				on roundtrip selection
		 * 
		 * 		Given site url is  http://makemytrip.com
		 * 		When User Select Roundtrip Radio button
		 * 		And verify roundtrip is selected
		 * 		Then Verify Double fares checkbox is disabled
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com");
		Thread.sleep(10000);
		
		WebElement Roundtrip=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		Roundtrip.click();
		
		
		String Rtrip_Class=Roundtrip.getAttribute("class");
		if(Rtrip_Class.contains("selected"))
		{
			System.out.println("Round trip is selected");
			Thread.sleep(10000);
			//Location
			 WebElement Loc_Double_Seat_Fares=driver.findElement(By.xpath("//ul[@class='specialFareNew']/li[6]"));
			 String Runtime_Class=Loc_Double_Seat_Fares.getAttribute("class");
			 
			 //Decision statement to verify object is Disabled
			 if(Runtime_Class.contains("isItemDisabled"))
			 {
				 System.out.println("Double seat fares is disabled");
			 }
			 else
			 {
				 System.out.println("Double seat fares is not disabled");
			 }
			 
		}
		else
		{
			System.out.println("Rondtrip is not selected");
		}
		

	}

}
