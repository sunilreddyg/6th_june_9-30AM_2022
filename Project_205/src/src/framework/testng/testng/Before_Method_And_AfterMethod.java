package framework.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Before_Method_And_AfterMethod 
{

  
  @BeforeMethod //Invoke Every @Test annotated method before
  public void beforeMethod() 
  {
	  System.out.println("method PreCondition");
  }

  @AfterMethod //Invoke every @Test annotated method after
  public void afterMethod()
  {
	  System.out.println("method PostCondition"+"\n");
  }
  
  @Test
  public void tc001() 
  {
	  Reporter.log("Test1 Executed",true);
  }
  
  @Test(enabled=false)
  public void tc002() 
  {
	  Reporter.log("Test2 Executed",true);
  }
  
  @Test
  public void tc003() 
  {
	  Reporter.log("Test3 Executed",true);
  }

}
