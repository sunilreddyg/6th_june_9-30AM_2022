package framework.junit;

import java.time.Duration;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit_With_Extent_Reports 
{

	static WebDriver driver;
	static ExtentReports reporter;
	static WebDriverWait wait;
	static String filepath="D:\\25_July_2022_11AM\\Project_205\\reports\\Junit.html";
	static ExtentTest test;
	String url="http://facebook.com";
	
	public @Rule TestName mytest=new TestName();
	
	@Before
	public void PreCondition() throws Exception
	{
		//Getting Current Constructed @Test method name
		test=reporter.startTest(mytest.getMethodName());
		driver.get(url);
	}
	
	
	@After
	public void PostCondition()
	{
		reporter.endTest(test);
	}
	

	@BeforeClass
	public static void Setup()  throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		reporter=new ExtentReports(filepath, true);
	}
	
	@AfterClass
	public static void TearDown()
	{
		driver.close();
		reporter.flush();
	}
	
	
	@Test
	public void Tc001_Login_invalid()
	{
		Assert.assertEquals("MQ", "BQ");
	}
	
	
	@Test
	public void Tc001_Login_Blank()
	{
		Assert.assertEquals("MQ", "MQ");
	}
	
	

}
