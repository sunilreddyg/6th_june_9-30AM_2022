package mq.java.variables.initiations;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Repository 
{
	WebDriver driver=null;
	
	public void LaunchChromeBrowser()
	{
		 driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
	}
	
	public void launchbrowser(String browsername)
	{
		if(browsername.equals("chrome"))
		{
			 driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		}
		else if(browsername.equals("firefox"))
		{
			driver=WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		}
	}
	
	public void LoadWebpage(String url)
	{
		driver.get(url);
	}
	
	public void SetupBrowser(String url)
	{
		LaunchChromeBrowser();
		LoadWebpage(url);
	}
	
	public WebDriver GetDriver()
	{
		return driver;
	}
	
	
	public void Capturescreen(String imagename)
	{
		//Get Current System Date and Time
		Date d=new Date();
		System.out.println(d.toString());
		
		//Create simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-EEE-dd hh-mm-ss");
		//Convert date using simple date format
		String time=sdf.format(d);
		System.out.println(time);
		
		
		try {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.createDir(new File("D:\\Automation\\screens"));
			FileHandler.copy(src, new File("D:\\Automation\\screens\\Image2"+time+imagename+".png"));
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
