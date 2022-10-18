package pageobjects.With_PageFactory.Keywords;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common_Action_methods 
{
	WebDriver driver;
	
	public Common_Action_methods(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	/*
	 * keyword:--> Type Text into Entrybox
	 */
	public void TypeText(WebElement element,String Input)
	{
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.visibilityOf(element))
			.sendKeys(Input);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Click(WebElement element)
	{
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.visibilityOf(element))
			.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
