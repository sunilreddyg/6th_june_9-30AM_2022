package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Frame_Using_Navigation_Method {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.redbus.in/bus-tickets/");
	    driver.manage().window().maximize();
	    
	    //navigate to frame using frame url
	    driver.navigate().to("https://www.redbus.in/login?offerType=Support&defaultSlide=home&isOnlyMobile=false");
	    Thread.sleep(4000);
	    
	    //Identifying Mobile Number object
	    driver.findElement(By.xpath("//input[@id='mobileNoInp']")).sendKeys("9030248855");
	
	    
	    
	    Thread.sleep(4000);
	    //Navigate to previous page
	    driver.navigate().back();
	}

}
