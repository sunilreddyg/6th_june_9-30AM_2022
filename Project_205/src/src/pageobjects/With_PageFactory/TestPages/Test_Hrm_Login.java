package pageobjects.With_PageFactory.TestPages;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.With_PageFactory.Pages.HRM_LoginPage;

public class Test_Hrm_Login {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		HRM_LoginPage login=new HRM_LoginPage(driver);
		login.Username.sendKeys("Admin");
		login.Password.sendKeys("admin123");
		login.login_submit.click();
	}

}
