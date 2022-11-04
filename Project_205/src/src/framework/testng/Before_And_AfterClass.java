package framework.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Before_And_AfterClass 
{

  @BeforeClass //Invoke before execution of first @Test annotation
  public void beforeClass() 
  {
	  System.out.println("Class PreCondition");
  }

  @AfterClass  //Invoke after execution of last @Test annotation
  public void afterClass() 
  {
	  System.out.println("Class postCondition");
  }
  
  @Test
  public void tc001() 
  {
	  Reporter.log("Test1 Executed",true);
  }

}
