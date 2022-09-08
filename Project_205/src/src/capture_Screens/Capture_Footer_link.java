package capture_Screens;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Capture_Footer_link 
{

	public static void main(String[] args) throws Exception {
	
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
		
		WebElement FooterArea=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/footer[1]/div[1]/div[1]"));
		File src=FooterArea.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D:\\Automation\\screens\\Image2.png"));
		
		
		
	}

}
