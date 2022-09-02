package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTo_Frame_Using_FrameID_OR_Name {

	public static void main(String[] args) 
	{
		
		WebDriver driver=WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		driver.get("https://www.cleartrip.com/account/trips");
		driver.manage().window().maximize();
		
		//Switching to frame using framid/name property
		driver.switchTo().frame("modal_window");
		
		
		//Identifying frame under object
		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		Email.clear();
		Email.sendKeys("info.dsnr@gmail.com");
		
		//Identifying frame under object
		WebElement TripID=driver.findElement(By.xpath("//input[@id='tripidSecond']"));
		TripID.clear();
		TripID.sendKeys("687676");
		
		
		//Get controls back to Mainpage
		driver.switchTo().defaultContent();
		
		
		//identifying object under webpage
		WebElement Home=driver.findElement(By.xpath("//a[@href='http://www.cleartrip.com/']"));
		Home.click();
		
		
	}

}
