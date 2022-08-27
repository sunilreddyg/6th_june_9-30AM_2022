package robot_window_interface;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_file {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement Upload_And_DownloadLink=driver.findElement(By.xpath("//button[contains(.,'Upload & Download')]"));
		Upload_And_DownloadLink.click();
		Thread.sleep(5000);
		
		WebElement Upload_btn=driver.findElement(By.xpath("//input[@id='uploadFile']"));
		new Actions(driver).click(Upload_btn).perform();
		Thread.sleep(3000);
		
		String path="D:\\Sample_Resume\\3year_EXP\\MyResume.docx";
		
		//Copy String and add to clipboard
		StringSelection spath=new StringSelection(path);
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(spath, spath);
		
		
		Robot robot=new Robot();
		robot.setAutoDelay(2000);
		
		
		//Press Control+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		//Release control Key
		robot.keyRelease(KeyEvent.VK_CONTROL);
	}

}
