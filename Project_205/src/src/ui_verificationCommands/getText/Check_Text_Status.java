package ui_verificationCommands.getText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Check_Text_Status 
{

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		
		if(driver!=null)
		{
			
			String Exp_text="Free Outlook email and calendar";
			
			WebElement text=driver.findElement(By.xpath("(//h2[contains(.,'Free Outlook email and calendar')])[2]"));
			String act_text=text.getText();
			
		
			if(!act_text.isEmpty())
			{
				   if(Exp_text.equals(act_text))
					   System.out.println("Text presented at webpage");
				   else
					   System.out.println("Text not presented at webpage");
			}
			else
			{
				System.out.println("Text location is Empty");
			}
			
			
		}
		
		

	}

}
