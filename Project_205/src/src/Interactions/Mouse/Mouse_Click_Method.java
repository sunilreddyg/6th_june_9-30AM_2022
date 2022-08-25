package selenium.webdriver.Interactions.Mouse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Click_Method {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement Upload_And_DownloadLink=driver.findElement(By.xpath("//button[contains(.,'Upload & Download')]"));
		Upload_And_DownloadLink.click();
		Thread.sleep(5000);
		
		WebElement Upload_btn=driver.findElement(By.xpath("//input[@id='uploadFile']"));
		new Actions(driver).click(Upload_btn).perform();
		
		
		
	}

}
