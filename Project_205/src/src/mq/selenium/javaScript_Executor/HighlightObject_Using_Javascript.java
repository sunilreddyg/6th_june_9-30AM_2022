package javaScript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightObject_Using_Javascript {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
		
		//Enable javascript execution at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		Thread.sleep(4000);
		
		//Highlight Button With Outline
		WebElement CreateButton=driver.findElement(By.xpath("//a[contains(.,'Create New Account')]"));
		js.executeScript("arguments[0].style.outline='2px solid red'", CreateButton);
		
		
		//Setting background color to object..
		WebElement ForgotLink=driver.findElement(By.linkText("Forgotten password?"));
		js.executeScript("arguments[0].style.backgroundColor='yellow'", ForgotLink);
		
		
		
		
	}

}
