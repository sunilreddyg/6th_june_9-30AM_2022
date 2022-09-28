package browser_options.Chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_options_Set_Window_Size 
{

	public static void main(String[] args) 
	{
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=300,500");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://naukri.com");
		
		

	}

}
