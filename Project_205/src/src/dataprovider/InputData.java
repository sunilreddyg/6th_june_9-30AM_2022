package framework.testng.dataprovider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class InputData 
{
	
  @Test(dataProvider = "dp",enabled=false)
  public void Test(String UID,String mobile) 
  {
	  System.out.println(UID+"   "+mobile);
  }
  
  
  @Test(dataProvider="info")
  public void Getuserinfo(String Productname,String Config,double price)
  {
	  System.out.println(Productname+"   "+Config+"    "+price);
  }
  
  

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] { "Asha","9030248855" },
      new Object[] { "Avinash","521245415" },
      new Object[] { "Avinash","903028855" },
      new Object[] { "sam","952642152" },
    };
  }
  
  
  @DataProvider
  public Object[][] info() 
  {
    return new Object[][] 
    {
      new Object[] { "Iphone","64GB",43000.00 },
      new Object[] { "Samsung","128GB",35000.00 },
      new Object[] { "Vivo","64GB",25000.00 },
      new Object[] { "Oneplus","256GB",30000.00 },
    };
  }
  
  
  @DataProvider
  public String[][] StudentDetails()
  {
	  String data[][]=
		  {
				  {"Raju","ECE","raju@gmail.com"},
				  {"abhi","BSC",null},
				  {"Peter","MBA",null},
		  };
	  return data;
  }
  
  
  
  
  
  
}
