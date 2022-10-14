package extent_Reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Create_Report_Under_Tests {

	public static void main(String[] args) 
	{
		//Genarate html file
		String filepath="reports\\report4.html";
		ExtentReports reporter=new ExtentReports(filepath,true);
		
				//Creating New Test at html file
				ExtentTest test1=reporter.startTest("Tc001_valid_login");
				
						test1.log(LogStatus.INFO, "Browser launched");
						test1.log(LogStatus.SKIP, "Wrong Url Presented");
						test1.log(LogStatus.INFO, "Username Entered");
						test1.log(LogStatus.INFO, "Password Entered");
						test1.log(LogStatus.INFO, "Click on signin button");
						test1.log(LogStatus.PASS, "Login successfull");
						test1.log(LogStatus.INFO, "Testpass, expected Result found");
				reporter.endTest(test1);

	
		reporter.flush();   //Save and genarate report

		

	}

}
