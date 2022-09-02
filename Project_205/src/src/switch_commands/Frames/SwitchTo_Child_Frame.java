package switch_commands.Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTo_Child_Frame {

	public static void main(String[] args) throws Exception {
		
		//setting runtime environment variable
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();     //Launching browser method
		driver.get("https://www.redbus.in/bus-tickets/");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Help=driver.findElement(By.xpath("//a[@href='https://www.redbus.in/info/redcare']"));
	    Help.click();
	    Thread.sleep(4000);
	    
	    
	    WebElement MainFrame=driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
	    driver.switchTo().frame(MainFrame);
	    System.out.println("Now Controls at Main Frame ");
	    
	    //Swtich to child frame
	    WebElement GmailFrame=driver.findElement(By.xpath("//iframe[@title='Sign in with Google Button']"));
	    driver.switchTo().frame(GmailFrame);
	    System.out.println("Now Controls at Gmail Frame");
	    
	    WebElement Gmail_link=driver.findElement(By.xpath("(//span[contains(.,'Sign in with Google')])[1]"));
	    Gmail_link.click();
	    
	    
	    //Get controls Back to Main Frame
	    driver.switchTo().parentFrame();
	    
	    //Get Controls Back to Mainpage
	    driver.switchTo().defaultContent();
	    
	    
	    
	    
	    
	    
	    

	}

}
