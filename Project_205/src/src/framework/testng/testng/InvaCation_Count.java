package framework.testng;

import org.testng.annotations.Test;

public class InvaCation_Count

{
	
  @Test(invocationCount=10)
  public void test() 
  {
	  System.out.println("Test Executed");
  }
  
  
}
