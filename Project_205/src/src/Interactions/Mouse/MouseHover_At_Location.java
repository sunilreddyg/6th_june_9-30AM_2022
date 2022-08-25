package selenium.webdriver.Interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover_At_Location {

	public static void main(String[] args) 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		
		WebElement Jobs=driver.findElement(By.xpath("//div[@class='mTxt'][contains(.,'Jobs')]"));
		new Actions(driver).moveToElement(Jobs).perform();
		
		
		

	}

}
