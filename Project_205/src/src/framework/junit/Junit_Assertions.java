package framework.junit;


import org.junit.Assert;
import org.junit.Test;

public class Junit_Assertions {

	@Test
	public void test_Assertions() 
	{
		Assert.assertEquals("MQ", "MQ");
	}
	
	@Test
	public void test_booleantype()
	{
		Assert.assertTrue(true);
	}

}
