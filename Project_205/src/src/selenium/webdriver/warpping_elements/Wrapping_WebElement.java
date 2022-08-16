package warpping_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wrapping_WebElement {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
		Thread.sleep(100);
		WebElement Register=driver.findElement(By.linkText("Sign up"));
		Register.click();
		
		//Wrapping page element into reference variable
		WebElement Email_or_mobile=driver.findElement(By.name("emailOrPhone"));
		Email_or_mobile.sendKeys("9030248855");
		
		//Wrapping Location into reference variable
		By Fullname=By.xpath("//input[@name='fullName']");
		driver.findElement(Fullname).sendKeys("Aakash");
		
	}

}
