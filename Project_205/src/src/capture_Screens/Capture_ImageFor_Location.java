package capture_Screens;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Capture_ImageFor_Location {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
		//Identifying Sign in form at webpage
		WebElement Form=driver.findElement(By.xpath("//div[@class='gr27e  ']"));

		File Src=Form.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(Src, new File("D:\\Automation\\screens\\Image2.png"));
		
		
		
	}

}
