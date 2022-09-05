package switch_commands.window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switchto_Second_window {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
	
		WebElement Meta=driver.findElement(By.linkText("Meta"));
		Meta.click();
		Thread.sleep(10000);
		
		//get All Dynamic WindowIds
		Set<String> AllwindowIds=driver.getWindowHandles();
		
		//Convert set of string values into iterators
		Iterator<String> itr=AllwindowIds.iterator();
		
		//Read Each iterator with Next keyword
		String Window1=itr.next();
		String Window2=itr.next();
		
		driver.switchTo().window(Window2);
		System.out.println("After Switch window title is "+driver.getTitle());
		
		
		//Switch to Main window
		driver.switchTo().window(Window1);
		System.out.println("main widnow title is --> "+driver.getTitle());
		
		//Note:--> Only use this when two windows are opened
		
		
	}

}
