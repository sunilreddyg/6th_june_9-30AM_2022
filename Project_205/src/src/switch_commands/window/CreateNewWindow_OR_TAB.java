package switch_commands.window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewWindow_OR_TAB {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		
		//Create New tab and Load new page to browser window
		WebDriver meta=driver.switchTo().newWindow(WindowType.TAB);
		meta.get("https://about.facebook.com/");
		Thread.sleep(5000);
		System.out.println(meta.getTitle());
		
		
		//Create New Extenal window
		WebDriver about=driver.switchTo().newWindow(WindowType.WINDOW);
		about.get("https://about.instagram.com/");
		Thread.sleep(5000);
		System.out.println(about.getTitle());
		
		
		

	}

}
