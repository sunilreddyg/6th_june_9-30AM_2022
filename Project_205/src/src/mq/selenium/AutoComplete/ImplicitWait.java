package selenium.webdriver.AutoComplete;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		//Timeout to manage until object load at Htmlsource
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		
		
	}

}
