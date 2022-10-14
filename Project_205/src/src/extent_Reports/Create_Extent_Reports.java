package extent_Reports;

import com.relevantcodes.extentreports.ExtentReports;

public class Create_Extent_Reports {

	public static void main(String[] args)
	{
		
		
		String filepath="reports\\report.html";
		ExtentReports reporter=new ExtentReports(filepath, true);
		
		
		reporter.flush();   //Save and genarate report

	}

}
