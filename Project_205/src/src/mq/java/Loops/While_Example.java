package mq.java.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class While_Example {

	public static void main(String[] args) throws Exception 
	{
		
		//Print number 1 to 10
		int i=1;
		while(i <= 10)
		{
			System.out.println(i);
			i=i+1;
		}
		
		
		
		
		//WebDriverScript
		//manage explicit wait using while loop..
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		boolean ObjectStatus=false;
		int count=0;
		while(ObjectStatus==false)
		{
			Thread.sleep(5000);
			
			try {
				driver.findElement(By.id("email"));
				ObjectStatus=true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			count=count+1;
			if(count==10)
			{
				throw new Exception("Required Object not found at webpage, Verified 10 Times with 5 Seconds interval gap");
			}
			
		}
		
		System.out.println("Element Found at webpage");
		

	}

}
