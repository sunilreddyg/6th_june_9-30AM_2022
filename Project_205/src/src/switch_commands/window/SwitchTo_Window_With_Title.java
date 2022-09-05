package switch_commands.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTo_Window_With_Title {

	public static void main(String[] args) throws Exception {
		

		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
		WebElement Meta=driver.findElement(By.linkText("Meta"));
		Meta.click();
		Thread.sleep(3000);
		
		WebElement About=driver.findElement(By.linkText("About"));
		About.click();
		Thread.sleep(3000);
		
		
		//Get All Window ID's
		Set<String> AllWindowIds=driver.getWindowHandles();
		for (String EachWindowID : AllWindowIds)
		{
			String pageTitle=driver.switchTo().window(EachWindowID).getTitle();
			if(pageTitle.contains("About"))
			{
				break; 
			}
		}

		System.out.println(driver.getTitle());
		

	}

}
