package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToFrame_Using_WebElement_Reference 
{
	public static void main(String[] args) 
	{
		WebDriver driver=WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		driver.get("https://www.cleartrip.com/account/trips");
		driver.manage().window().maximize();
		
		
		//Switch to Frame using WebElemnt reference
		WebElement Frame1=driver.findElement(By.xpath("//iframe[@src='/signinstatic/tripidlogin.shtml?popup=no&guest=true']"));
		driver.switchTo().frame(Frame1);
		
		
		//Identifying frame under object
		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		Email.clear();
		Email.sendKeys("info.dsnr@gmail.com");
		
		//Identifying frame under object
		WebElement TripID=driver.findElement(By.xpath("//input[@id='tripidSecond']"));
		TripID.clear();
		TripID.sendKeys("687676");
		
		
		
				
		
		
		
		
	}
}
