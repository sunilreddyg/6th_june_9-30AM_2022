package framework.Datadriven.Notepad_File;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Write_Data_into_Notepad_File 
{

	public static void main(String[] args) throws Exception 
	{
		
		//Create Notepad file
		FileWriter fw=new FileWriter("src\\framework\\Datadriven\\Notepad_File\\Output.txt");
		System.out.println("Text output file created");
		
		//Creating object for BufferedWriter
		BufferedWriter writer=new BufferedWriter(fw);
		
		writer.write("------------Automation tests ----------");
		writer.newLine();
		
		writer.write("Testcase1:---->  Testpass");
		writer.newLine();
		
		
		writer.close();  //Dump file into notepad file
		
	}

}
