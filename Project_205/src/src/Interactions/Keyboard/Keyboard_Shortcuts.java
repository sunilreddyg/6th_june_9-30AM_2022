package selenium.webdriver.Interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_Shortcuts 
{
	
	public static void main(String[] args) 
	{
		
		WebDriver driver=WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		driver.get("https://www.skyscanner.co.in/");
		driver.manage().window().maximize();
		
		
		WebElement FromEB=driver.findElement(By.name("fsc-origin-search"));
		new Actions(driver).click(FromEB).sendKeys(Keys.BACK_SPACE)
		.pause(2000).sendKeys("PUNE")
		.pause(2000).sendKeys(Keys.ARROW_DOWN)
		.pause(1000).click().perform();
		
		
		
	}

}
