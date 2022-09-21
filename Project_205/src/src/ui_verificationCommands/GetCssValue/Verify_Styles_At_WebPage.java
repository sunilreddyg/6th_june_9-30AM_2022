package ui_verificationCommands.GetCssValue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Styles_At_WebPage {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://instagram.com");
		Thread.sleep(2000);
		
		WebElement Signup_link=driver.findElement(By.xpath("//a[@data-testid='sign-up-link']"));
		//Get BackGround Color
		String TextColor_in_RGBA=Signup_link.getCssValue("color");
		System.out.println("Text Color in RGBA Format --> "+TextColor_in_RGBA);
		
		
		String Exp_color_in_Hex="#0095f6";
		
		//From Selenium 4 we can convert Color Codes
		Color Original=Color.fromString(TextColor_in_RGBA);
		String Original_hex_color=Original.asHex();
		
		
		if(Original_hex_color.equals(Exp_color_in_Hex))
			System.out.println("Color displayed as expected");
		else
			System.out.println("Wrong color displayed at Link");

		
		/*
		 * Visit this website to check color validations...
		 * https://www.selenium.dev/documentation/webdriver/additional_features/colors/
		 */
	}

}
