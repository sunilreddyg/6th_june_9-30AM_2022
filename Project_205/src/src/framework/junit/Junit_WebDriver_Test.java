package framework.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit_WebDriver_Test 
{
	  private WebDriver driver;
	 
	  @Before
	  public void setUp() 
	  {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().setSize(new Dimension(800, 558)); 
	  }
	  
	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	  
	  @Test
	  public void LoginTest()
	  {
	  	driver.get("https://www.outlook.com/");
	  	Assert.assertEquals("Facebook – log in or sign up", driver.getTitle());
	    driver.findElement(By.id("email")).sendKeys("ffghgfh");
	    driver.findElement(By.id("pass")).sendKeys("fhfghgf");
	    driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();

	  }


}
