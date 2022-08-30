package javaScript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript_Select_Dropdown_Option {

	public static void main(String[] args) {
		
		WebDriver driver=WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		
		

		//Enable Javascript executor at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Set Value to Dropdown option
		WebElement Day=driver.findElement(By.xpath("//select[@id='day']"));
		js.executeScript("arguments[0].value='18'", Day);
		
		//Select Dropdown Option using index number
		WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
		js.executeScript("arguments[0].selectedIndex='4'", Month);
	}

}
