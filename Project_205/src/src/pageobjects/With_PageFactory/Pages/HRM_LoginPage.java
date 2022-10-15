package pageobjects.With_PageFactory.Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HRM_LoginPage
{

	public HRM_LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	public WebElement  Username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement  Password;
	
	@FindBy(xpath = "//button[contains(.,'Login')]")
	public WebElement  login_submit;
	
	@FindBy(xpath = "//p[contains(.,'Forgot your password?')]")
	public WebElement  forgotYourPassword;
	


}