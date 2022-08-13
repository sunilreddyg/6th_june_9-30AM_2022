package selenium.webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Syntax_Example {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
	
		driver.findElement(By.name("firstname")).sendKeys("Darshan");
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("Krishna");
		
		driver.findElement(By.name("firstname")).sendKeys(Keys.TAB+"Arjun");
		
		
		
		driver.findElement(By.id("day")).sendKeys("23");
		
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
	}

}
