package framework.Datadriven.CsvFile;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

public class Read_Csv_values_Using_List 
{

	public static void main(String[] args) throws IOException {
	
		//Target File location
		FileReader fr=new FileReader("src\\framework\\Datadriven\\CsvFile\\input.csv");
		System.out.println("File located");
		
		//Create object for csvreader
		CSVReader reader=new CSVReader(fr);
		
		List<String[]> list=reader.readAll();
		
		for (String[] EachRecord : list) 
		{
			System.out.println(EachRecord[0]+"   "+EachRecord[1]);
		}
		
		

	}

}
