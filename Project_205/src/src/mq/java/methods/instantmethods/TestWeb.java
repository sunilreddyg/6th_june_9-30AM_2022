package mq.java.methods.instantmethods;

public class TestWeb 
{
	
	public void OpenChrome() 
	{
		System.out.println("Chrome is Opened");
	}
	
	public void NavigateToFB() 
	{
		System.out.println("Facebook Page loaded");
	}
	
	public void EnterLoginDetails() 
	{
		System.out.println("Login Details entered");
	}
	
	
	public void Verifylogin() 
	{
		System.out.println("Facebook Page loaded");
	}
	
	public void CloseBrowser()
	{
		System.out.println("Browser is Closed");
	}
	
	public void Testwith_Valid_Login_Details()
	{
		OpenChrome();
		NavigateToFB();
		EnterLoginDetails();
		Verifylogin();
	}
	
}
