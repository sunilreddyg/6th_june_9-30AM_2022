package pageobjects.With_PageFactory.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FB_Signup 
{

	@FindBy(xpath="//a[contains(.,'Create New Account')]") 
	public WebElement CreateAccountButton;
	
	@FindBy(name="firstname") 
	public WebElement Firstname;
	
	@FindBy(xpath = "//input[@aria-label='Surname']")
	public WebElement Surname;
	
	@FindBy(xpath = "//input[@aria-label='Mobile number or email address']")
	public WebElement Email;
	
	
	public void CreateAccount(String First_name,String Sur_name,String ip_email)
	{
		Firstname.sendKeys(First_name);
		Surname.sendKeys(Sur_name);
		Email.sendKeys(ip_email);
	}

}
