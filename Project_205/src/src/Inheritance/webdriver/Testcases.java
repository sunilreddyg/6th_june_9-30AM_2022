package oops.Inheritance.webdriver;


public class Testcases extends Common_Reusable_Actions
{
	String url="http://facebook.com";
	String username="//input[@id='email']";
	String password="//input[@id='pass']";
	
	
	public void setupbrowser()
	{
		LaunchBrowser("chrome");
		load_webpage(url);
		System.out.println(driver.getTitle());
	}
	
	public void userlogin()
	{
		Type_text(username, "Admin");
		Type_text(password, "Adam");
	}
	
	public void endbrowser()
	{
		close_browser();
	}
	
	public static void main(String[] args) 
	{
		Testcases obj=new Testcases();
		obj.setupbrowser();
		obj.userlogin();
		obj.close_browser();
	}

}
