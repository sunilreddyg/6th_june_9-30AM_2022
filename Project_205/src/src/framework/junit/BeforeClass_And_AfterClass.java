package framework.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClass_And_AfterClass 
{

	@BeforeClass  //Invoke before execution of first @Test annotation
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Class PreCondition");
	}

	@AfterClass  //Invoke after last @Test annotation
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Class Postcondition");
	}

	@Test
	public void test1() 
	{
		System.out.println("Test1 Executed");
	}
	
	@Test
	public void test2() 
	{
		System.out.println("Test2 Executed");
	}

}
