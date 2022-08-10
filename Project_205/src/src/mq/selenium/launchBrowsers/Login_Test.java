package mq.selenium.launchBrowsers;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Test {

	public static void main(String[] args) 
	{
	
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
	}

}
