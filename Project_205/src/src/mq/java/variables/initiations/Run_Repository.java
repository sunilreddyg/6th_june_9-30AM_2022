package mq.java.variables.initiations;

import org.openqa.selenium.WebDriver;

public class Run_Repository 
{

	public static void main(String[] args) 
	{
		
		Repository obj=new Repository();
		obj.SetupBrowser("http://facebook.com");
		obj.Capturescreen("FbHomepage");
		
		WebDriver driver=null;
		driver=obj.GetDriver();
		
		System.out.println(driver.getTitle());
		
		
	}

}
