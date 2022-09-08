package capture_Screens;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShot_with_timeStamp {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Get Current System Date and Time
		Date d=new Date();
		System.out.println(d.toString());
		
		//Create simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-EEE-dd hh-mm-ss");
		//Convert date using simple date format
		String time=sdf.format(d);
		System.out.println(time);
		
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D:\\Automation\\screens\\Image2"+time+".png"));
		
		
		
		
	}

}
