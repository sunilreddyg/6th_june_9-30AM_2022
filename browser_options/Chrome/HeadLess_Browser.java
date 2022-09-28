package browser_options.Chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLess_Browser {

	public static void main(String[] args) 
	{
		
		ChromeOptions options=new ChromeOptions();
		//options.setHeadless(true);
		options.addArguments("--headless");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		System.out.println("Browser Is Opened");
		
		driver.get("http://instagram.com");
		System.out.println("page Loaded");
		
		System.out.println("window Title Presented --> "+driver.getTitle());
		
		driver.close();
		System.out.println("browser is closed");
		
		
	}

}
