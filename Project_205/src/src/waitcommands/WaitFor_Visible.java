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

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		try {
			By Loc_Username=By.xpath("//input[@aria-label='Phone number, username, or email']");
			wait.until(ExpectedConditions.visibilityOfElementLocated(Loc_Username)).sendKeys("Darshan");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
