package pageobjects.With_PageFactory.TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.With_PageFactory.Pages.Adduser_Admin;
import pageobjects.With_PageFactory.Pages.HRM_LoginPage;
import pageobjects.With_PageFactory.Pages.MenuTabs;
import pageobjects.With_PageFactory.Pages.SystemUsers;

public class Add_User {

	public static void main(String[] args) throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		HRM_LoginPage login=new HRM_LoginPage(driver);
		login.Username.sendKeys("Admin");
		login.Password.sendKeys("admin123");
		login.login_submit.click();
		
		MenuTabs tabs=new MenuTabs(driver);
		tabs.admin.click();
		
		SystemUsers systemuser=new SystemUsers(driver);
		systemuser.ClickAddButton();
		
		Adduser_Admin add=new Adduser_Admin(driver);
		add.TypeUsername("Sunil");
		add.TypePassword("admin");
		add.RetypePassword("admin");
		
		
	}

}
