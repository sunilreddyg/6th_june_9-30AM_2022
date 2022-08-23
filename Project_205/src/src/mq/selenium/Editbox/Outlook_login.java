package selenium.webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Outlook_login {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();

		driver.findElement(By.xpath("//input[@id='i0116']"))
		.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='i0118']"))
		.sendKeys("Hello"+Keys.ENTER);
		
		
	}

}
