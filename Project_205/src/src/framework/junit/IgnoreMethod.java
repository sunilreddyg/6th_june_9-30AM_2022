package framework.junit;


import org.junit.Ignore;
import org.junit.Test;

public class IgnoreMethod 
{
	

	@Test //Invoke method to run
	public void test1() 
	{
		System.out.println("Test1 executed");
	}
	
	@Ignore //ignore method to run
	public void test2() 
	{
		System.out.println("Test1 executed");
	}

}
