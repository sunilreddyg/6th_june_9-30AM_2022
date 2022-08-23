package selenium.webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownSelection_Commands 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		
		//Selecting Dropdown with option name
		WebElement DayDropdown=driver.findElement(By.xpath("//select[@title='Day']"));
		new Select(DayDropdown).selectByVisibleText("21");

		
		//Selecting Dropdown with Value Property
		WebElement MonthDropdown=driver.findElement(By.name("birthday_month"));
		new Select(MonthDropdown).selectByValue("11");
		
		
		//Selecting Dropdown with index Number
		WebElement YearDropdown=driver.findElement(By.name("birthday_year"));
		new Select(YearDropdown).selectByIndex(12);
		
		
		
		
		
	}

}
