package selenium.webdriver.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWith_links 
{

	public static void main(String[] args) throws Exception
	{
	
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Locations")).click();
		driver.findElement(By.linkText("India")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Somajiguda")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("PVR Cinema")).click();
		
		
	}

}
