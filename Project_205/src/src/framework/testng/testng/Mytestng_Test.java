package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mytestng_Test 
{
	
  @Test //Invoke method tor run without object creation
  public void tc001() 
  {
	  Reporter.log("Tc001 Executed",true);
  }
  
  @Test 
  public void tc002() 
  {
	  Reporter.log("Tc002 Executed",true);
  }
  
  
  @Test 
  public void tc003() 
  {
	  Reporter.log("Tc003 Executed",true);
  }
  
}
