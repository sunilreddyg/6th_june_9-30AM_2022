package waitcommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_Title 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		
		
		try {
			
			new WebDriverWait(driver, Duration.ofSeconds(10))
			.until(ExpectedConditions.titleIs("Instagram"));
			System.out.println("Instagram Title is Presented");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		WebElement Locations=driver.findElement(By.linkText("Locations"));
		Locations.click();
		
		boolean flag=false;
		try {
			
			flag=new WebDriverWait(driver, Duration.ofSeconds(40))
			.until(ExpectedConditions.titleContains("Locations"));
			System.out.println("Location page title is verified");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(flag==true)
			System.out.println("Title is Presented");
		else
			System.out.println("Title is not presented");
		

	}

}
