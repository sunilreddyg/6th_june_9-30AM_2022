package extent_Reports;

import java.util.HashMap;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Assign_Author_To_ExtentReports {

	public static void main(String[] args) {
		
		String Filepath="Reports\\Report7.html";
		ExtentReports logger=new ExtentReports(Filepath, true);
		System.out.println("Reporter file created");
		
			
			//Assigning auhor and category to extent test....
			ExtentTest test1=logger.startTest("Tc001_loginvalid")
					.assignAuthor("Sunil").assignCategory("Reg1");
					test1.log(LogStatus.INFO, "Tc001_Executed");
			logger.endTest(test1);
			
			ExtentTest test2=logger.startTest("Tc002_login_Invalid")
					.assignAuthor("Pepo").assignCategory("Reg2");
					test1.log(LogStatus.FAIL, "Tc002_Executed");
			logger.endTest(test2);
			
			
			Map<String, String> sysInfo = new HashMap<String, String>();
			sysInfo.put("Selenium Version", "3.14");
			sysInfo.put("Environment", "Windows");
			sysInfo.put("IP","192.1.1.1");
			logger.addSystemInfo(sysInfo);
			
		logger.flush();

	}

}
