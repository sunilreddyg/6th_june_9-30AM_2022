package framework.testng.dataprovider;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel_to_DP 
{
	String Filepath="D:\\25_July_2022_11AM\\Project_205\\TestData\\InputData.xlsx";
	String sheetname="Sheet1";
	XSSFWorkbook book;
	XSSFSheet sht;
	
	@DataProvider
	public String[][] GetData() throws Exception
	{
		FileInputStream fi=new FileInputStream(Filepath);
		book=new XSSFWorkbook(fi);
		sht=book.getSheet(sheetname);
		
		int Rcount=sht.getLastRowNum();
		int CellCount=sht.getRow(0).getLastCellNum();
		
		String data[][]=new String[Rcount+1][CellCount];
		for (int i = 0; i <= Rcount ; i++) 
		{
				for (int j = 0; j < CellCount; j++) 
				{
					 data[i][j]=sht.getRow(i).getCell(j).getStringCellValue();
				}
		}
		 return data;
	}
	
	
	@Test(dataProvider="GetData")
	public void GetUserData(String Name,String Age,String location)
	{
		
	}

}
