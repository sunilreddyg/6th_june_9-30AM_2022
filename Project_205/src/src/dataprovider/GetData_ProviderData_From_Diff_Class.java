package framework.testng.dataprovider;

import org.testng.annotations.Test;

public class GetData_ProviderData_From_Diff_Class 
{
	
	@Test(dataProvider="StudentDetails",dataProviderClass=InputData.class)
	public void GetDetails(String studentname,String qualification,String email)
	{
		System.out.println(studentname+"  "+qualification+"   "+email);
	}

}
