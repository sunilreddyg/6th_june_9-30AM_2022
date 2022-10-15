package pageobjects.Without_pageFactory;

import org.openqa.selenium.WebDriver;

public class TestCase1 
{
	TestBase base;
	WebDriver driver=null;
	
	public TestCase1()
	{
		base=new TestBase();
		base.SetupChrome();
		base.Account_login();
		driver=base.driver;
	}
	
	
	public void Addnewuser_to_Admin()
	{
		driver.findElement(CommonObjects.MenuTab_Admin).click();
		driver.findElement(CommonObjects.System_user_Adduser).click();
		base.static_time(1000);
		driver.findElement(CommonObjects.Adduser_UserRole).click();
		base.static_time(1000);
		driver.findElement(CommonObjects.Adduser_userRole_Admin).click();
		
	}

}
