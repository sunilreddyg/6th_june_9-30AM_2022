package capture_Screens;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShot 
{

	public static void main(String[] args) throws IOException 
	{
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://naukri.com");
		driver.manage().window().maximize();
	
		//Capturing sceenshot and Convert Scree into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Creating new folder at selected location
		FileHandler.createDir(new File("D:\\Automation\\screens"));
		
		//copy screen into folder
		FileHandler.copy(src, new File("D:\\Automation\\screens\\Image.png"));
		
		
		/*
		 * Note:--> 
		 * 		PNG --> Portable Network graphic
		 * 				It is image extension
		 * 
		 * 		2. We Must add throw exception to method inorder
		 * 			to avoid filenotfound exception..
		 */

	}

}
