package selenium.webdriver.DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker_Month_And_Year {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html");
		driver.manage().window().maximize();
		
	
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(1000);
		
		new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")))
		.selectByVisibleText("Jul");
		Thread.sleep(2000);
		
		new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")))
		.selectByVisibleText("2020");
		Thread.sleep(2000);
		
		
		driver.findElement(By.linkText("21")).click();
		
		
		
	}

}
