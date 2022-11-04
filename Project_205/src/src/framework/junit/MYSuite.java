package framework.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses
		({ 
			Before_And_After.class, 
			BeforeClass_And_AfterClass.class, 
			IgnoreMethod.class, 
			Junit_Assertions.class,
			Junit_WebDriver_Test.class, 
			Junit_With_Extent_Reports.class, 
			MyjunitTest.class
			
		})
public class MYSuite 
{

}
