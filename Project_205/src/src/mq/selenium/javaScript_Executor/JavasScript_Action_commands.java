package javaScript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavasScript_Action_commands 
{

	public static void main(String[] args) 
	{
		WebDriver driver=WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//Enable Javascript executor at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Identifying object with id property and Send Input value to textbox
		js.executeScript("document.getElementById('email').value='Darshan'");
		

		//IDentifying object with xpath property and send input value ot textbox
		WebElement Password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		js.executeScript("arguments[0].value='Admin@123'", Password);
		
		
		//Identifying obejct with xpath
		WebElement LoginButton=driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click()", LoginButton);
		
		
	}

}
