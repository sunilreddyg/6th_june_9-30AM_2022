package selenium.webdriver.AutoComplete;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selecting_Options_From_AutoComplete_Editbox {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(.,'From')]")).click();
		Thread.sleep(2000);
		WebElement FromEB=driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']"));
		FromEB.sendKeys("Mumbai");
		Thread.sleep(2000);
		
		WebElement FromCity=driver.findElement(By.xpath("(//div[contains(.,'Mumbai, India Chhatrapati Shivaji International Airport')])[16]"));
		FromCity.click();

	}

}
