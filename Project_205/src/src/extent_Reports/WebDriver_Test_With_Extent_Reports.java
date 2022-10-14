package extent_Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver_Test_With_Extent_Reports {

	public static void main(String[] args) throws Exception 
	{
		//Creating html file
		String filepath="reports\\report5.html";
		ExtentReports reporter=new ExtentReports(filepath,true);
		
				ExtentTest test1=reporter.startTest("Tc001_valid_login");
				
						WebDriverManager.chromedriver().setup();
						WebDriver driver=new ChromeDriver();
						test1.log(LogStatus.INFO, "Browser launched");
						
						driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
						test1.log(LogStatus.INFO, "site url loaded");
						Thread.sleep(3000);
						
						driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
						test1.log(LogStatus.INFO, "Username Entered");
						
						driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
						test1.log(LogStatus.INFO, "Password Entered");
						
						driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
						test1.log(LogStatus.INFO, "Click on signin button");
						Thread.sleep(3000);
						
						WebElement ProfileImage=driver.findElement(By.xpath("//img[@src='/web/index.php/pim/viewPhoto/empNumber/7']"));
						if(ProfileImage.isDisplayed())
						{
							test1.log(LogStatus.PASS, "Login successfull");
						}
						else
						{
							test1.log(LogStatus.FAIL, "Login successfull");
						}
						
				
				reporter.endTest(test1);

	
		reporter.flush();   //Save and genarate report
		

	}

}
