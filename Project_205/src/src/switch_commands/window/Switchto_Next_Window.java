package switch_commands.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switchto_Next_Window {

	public static void main(String[] args) throws Exception {
		

		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
		//String Current Page Window ID
		String MainWindow=driver.getWindowHandle();
		
	
		WebElement Meta=driver.findElement(By.linkText("Meta"));
		Meta.click();
		Thread.sleep(5000);
		
		
		//Get All Window ID's
		Set<String> AllWindowIds=driver.getWindowHandles();
		for (String EachWindowID : AllWindowIds)
		{
			driver.switchTo().window(EachWindowID);
		}
		
		//Note:--> Assumption is when loop completed by default
		//Window controls available at second  window
		
		//Note:--> Only use this when two windows are opened
		
		//Switch to Mainwindow
		driver.switchTo().window(MainWindow);
		System.out.println("Mainwindow title is --> "+driver.getTitle());
	}

}
