package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest 
{
	
	@Given("navigate to facebook page")
	public void navigate_to_facebook_page() 
	{
	   System.out.println("Facebook iS opened");
	}
	@When("user enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password() 
	{
	    System.out.println("Email and Password entered");
	}
	@When("click on login button")
	public void click_on_login_button() 
	{
	   System.out.println("login button clicked");
	}
	@Then("Error message displayed")
	public void error_message_displayed() 
	{
	    System.out.println("Error message is displayed");
	}


}
