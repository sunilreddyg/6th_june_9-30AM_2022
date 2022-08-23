package selenium.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DropdownSelection_With_ClickMethod {

	public static void main(String[] args) {
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		WebElement DayDropdown=driver.findElement(By.name("birthday_day"));
		DayDropdown.findElement(By.xpath("//option[@value='14']")).click();
		
		
		 WebElement MonthDropdown = driver.findElement(By.id("month"));
		 MonthDropdown.findElement(By.xpath("//option[. = 'Sep']")).click();

		 
		 WebElement Year_dropdown=driver.findElement(By.xpath("//option[contains(.,'1997')]"));
		 Year_dropdown.click();
	}

}
