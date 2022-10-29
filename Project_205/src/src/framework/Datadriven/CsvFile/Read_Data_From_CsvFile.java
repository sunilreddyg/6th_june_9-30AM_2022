package framework.Datadriven.CsvFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class Read_Data_From_CsvFile {

	public static void main(String[] args) throws IOException 
	{
		
		
		//Target File location
		FileReader fr=new FileReader("src\\framework\\Datadriven\\CsvFile\\input.csv");
		System.out.println("File located");
		
		//Create object for csvreader
		CSVReader reader=new CSVReader(fr);
		
		//Read First Record
		String Record1[]=reader.readNext();
		System.out.println(Record1[0]+"    "+Record1[1]);
		
		//Read Second Record
		String Record2[]=reader.readNext();
		System.out.println(Record2[0]+"    "+Record2[1]);
		
		//Using While loop Read all values
		String Records[];
		while((Records=reader.readNext())!=null)
		{
			System.out.println(Records[0]+"   "+Records[1]);
		}
		

	}

}
