package waitcommands;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitFor_Alert {

	public static void main(String[] args) throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		
		
		WebElement Nav_alert=driver.findElement(By.xpath("//a[@id='v-pills-messages-tab']"));
		Nav_alert.click();
		
		
		WebElement Alert_link=driver.findElement(By.xpath("//button[contains(.,'Alerts')]"));
		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.visibilityOf(Alert_link)).click();
		
		
		WebElement Alert_button=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		new WebDriverWait(driver, Duration.ofSeconds(20))
		.until(ExpectedConditions.visibilityOf(Alert_button)).click();
		
		
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.alertIsPresent()).accept();
			System.out.println("Alert is Closed");
			
		} catch (Exception e) {
			System.out.println("Alert not presented");
		}
		
		
	}

}
