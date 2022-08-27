package selenium.webdriver.Interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyDown_And_KeyUp_Action 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://jqueryui.com/resources/demos/selectable/default.html");
		driver.manage().window().maximize();
		
		//Press Control Down key
		new Actions(driver).keyDown(Keys.CONTROL).perform();
		
		driver.findElement(By.xpath("//li[contains(.,'Item 1')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[contains(.,'Item 3')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[contains(.,'Item 5')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[contains(.,'Item 7')]")).click();
		
		//Release Down Keys
		new Actions(driver).keyUp(Keys.CONTROL).perform();
		

	}

}
