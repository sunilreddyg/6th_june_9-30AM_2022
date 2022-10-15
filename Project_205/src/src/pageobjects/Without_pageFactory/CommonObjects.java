package pageobjects.Without_pageFactory;

import org.openqa.selenium.By;

public class CommonObjects
{
	//InputData
	public static String Ip_hrm_url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static String Ip_uid="Admin";
	public static String Ip_password="admin123";
	
	//Objects
	public static By Login_uid=By.xpath("//input[@name='username']");
	public static By Login_pwd=By.xpath("//input[@name='password']");
	public static By Login_submit_button=By.xpath("//button[contains(.,'Login')]");
	public static By forgot_password=By.xpath("//p[contains(.,'Forgot your password?')]");
	
	//Menuitems
	public static By MenuTab_Admin=By.xpath("//span[contains(.,'Admin')]");
	
	//System user Page
	public static By System_user_Adduser=By.xpath("//button[contains(.,'Add')]");
	public static By Adduser_UserRole=By.xpath("(//div[@class='oxd-select-text-input'])[1]");
	public static By Adduser_userRole_Admin=By.xpath("//div[@role='option'][contains(.,'Admin')]");
	public static By Adduser_userRole_ESS=By.xpath("//div[@role='option'][contains(.,'ESS')]");
}
