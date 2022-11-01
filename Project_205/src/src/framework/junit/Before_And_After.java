package framework.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Before_And_After {

	@Before //Invoke every @Test annotation before
	public void setUp() throws Exception 
	{
		System.out.println("Test PreCondition");
	}

	@After  //Invoke every @Test annotation after
	public void tearDown() throws Exception 
	{
		System.out.println("Test PostCondition");
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
	
	@Test
	public void test3() 
	{
		System.out.println("Test3 Executed");
	}

}
