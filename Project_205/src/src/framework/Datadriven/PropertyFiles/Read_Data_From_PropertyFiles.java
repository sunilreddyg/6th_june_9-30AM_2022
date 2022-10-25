package framework.Datadriven.PropertyFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_Data_From_PropertyFiles {

	public static void main(String[] args) throws IOException 
	{
		
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.manage().window().maximize();
		
		
		//Locate ProperFile
		FileInputStream fi=new FileInputStream("src\\framework\\Datadriven\\PropertyFiles\\input.properties");
		System.out.println("File located");
		
		//Create object for property files
		Properties obj=new Properties();
		obj.load(fi);
		
		driver.get(obj.getProperty("application_url"));
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys(obj.getProperty("username"));
		
	}

}
