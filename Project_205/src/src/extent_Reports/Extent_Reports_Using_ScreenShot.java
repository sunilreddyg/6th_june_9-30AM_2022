package extent_Reports;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extent_Reports_Using_ScreenShot {

	public static void main(String[] args) throws Exception 
	{
		
		
			
		
		
		//Create Extent Report
		String Filepath="Reports\\Report6.html";
		ExtentReports logger=new ExtentReports(Filepath, true);
		System.out.println("Reporter file created");
		
		
		
			ExtentTest test1=logger.startTest("Tc001_loginvalid");
			
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("http://facebook.com");
			
				//Capture screen using webdriver scripting
				String screen1_path="D:\\25_July_2022_11AM\\Project_205\\screens\\Screen1.png";
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(src, new File(screen1_path));
				
				//Attach screen to extent report file.
				test1.log(LogStatus.PASS, "Fb Screen is captured",test1.addScreenCapture(screen1_path));
			
			//Flush all runtime test reports to HTML file
			logger.endTest(test1);
			
		
		//flush all reports to file..		
		logger.flush();

	}

}
