package waitcommands;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitFor_Visible {

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		
		
		
		
	
		//VisibilityofElementLocated(By)
		try {
			
			By Username=By.xpath("//input[@name='username']");
			new WebDriverWait(driver, Duration.ofSeconds(10))
			.until(ExpectedConditions.visibilityOfElementLocated(Username));
			System.out.println("Object is Visible");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Visibilityof(WebElement)
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@type='password']"))));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//ElementTobeClickable
		try {
			By LoginButton=By.xpath("//button[@type='submit']");
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.elementToBeClickable(LoginButton)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
