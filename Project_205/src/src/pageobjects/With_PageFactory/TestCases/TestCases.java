package pageobjects.With_PageFactory.TestCases;

import org.openqa.selenium.WebDriver;

import pageobjects.With_PageFactory.Keywords.Common_Action_methods;
import pageobjects.With_PageFactory.Pages.Adduser_Admin;
import pageobjects.With_PageFactory.Pages.HRM_LoginPage;
import pageobjects.With_PageFactory.Pages.MenuTabs;
import pageobjects.With_PageFactory.Pages.SystemUsers;

public class TestCases 
{
	WebDriver driver;
	HRM_LoginPage login;
	MenuTabs tabs;
	SystemUsers userspage;
	Adduser_Admin newuser;
	Common_Action_methods keywords;
	
	public TestCases(WebDriver driver) 
	{
		this.driver=driver;
		login=new HRM_LoginPage(driver);
		tabs=new MenuTabs(driver);
		userspage=new SystemUsers(driver);
		newuser=new Adduser_Admin(driver);
		keywords=new Common_Action_methods(driver);
		
	}
	
	
	public void AddNewuser_Under_Admin()
	{
		login.HrmLogin("Admin", "admin123");
		tabs.admin.click();
		userspage.ClickAddButton();
		newuser.TypeUsername("Sunil");
		newuser.TypePassword("Admin@123");
		if(newuser.Confirm_Password.isDisplayed())
		{
			newuser.RetypePassword("admin@123");
		}
	}
	
	public void AddNewuser_Admin_InvalidData()
	{
		keywords.TypeText(login.Username, "Admin");
		keywords.TypeText(login.Password, "admin123");
		keywords.Click(login.login_submit);
		keywords.Click(tabs.admin);
		keywords.Click(userspage.add);
		keywords.TypeText(newuser.Username, "sunil");
		
		
	}


}
