package framework.testng.Suite_Parameter;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common_library.CommonReusable_Actions;

public class Run__With_Resuable_Actions extends CommonReusable_Actions
{
	
	@Test
	@Parameters({"MyBrowser","Myurl"})
	public void SetupBrowser(String Browser,String URL)
	{
		LaunchBrowser(Browser);
		load_webpage(URL);
		set_explicitwait_time(30);
	}

}
