package selenium.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Multiple_Selection 
{

	public static void main(String[] args) throws Exception
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		WebElement SelectMenuLink=driver.findElement(By.xpath("//button[contains(.,'Select Menu')]"));
		SelectMenuLink.click();
		Thread.sleep(2000);
		
		WebElement Dropdown1=driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		boolean flag=new Select(Dropdown1).isMultiple();
		System.out.println("Dropdown multiple selection status is --> "+flag);
		
		//This method verify dropdown is a multiple or single option selection type
		WebElement Dropdown2=driver.findElement(By.xpath("//select[@id='exampleFormControlSelect2']"));
		boolean flag1=new Select(Dropdown2).isMultiple();
		System.out.println("Dropdown multiple selection status is --> "+flag1);
		
		
		if (flag1) 
		{
			
			Select CountrySelector=new Select(Dropdown2);
			CountrySelector.deselectAll();
			CountrySelector.selectByIndex(1);
			CountrySelector.selectByIndex(3);
			
			Thread.sleep(3000);
			CountrySelector.deselectByIndex(1);
		} else 
		{
			System.out.println("Dropdown is not a multiple selection type");
		}
		
		

	}

}
