package framework.Datadriven.Notepad_File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_Data_From_Notepad_File 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Target File location
		FileReader fr=new FileReader("src\\framework\\Datadriven\\Notepad_File\\input.txt");
		System.out.println("File located");
		
		//Create object for Buffered Reader [Old format]
		BufferedReader reader=new BufferedReader(fr);
	
		String Headers=reader.readLine();
		System.out.println(Headers);
		
		String Line1=reader.readLine();
		String Arr[]=Line1.split(",");
		System.out.println(Arr[0]+"    "+Arr[1]);
		

		//Read all lines of data from notpad file
		String Rline;
		while((Rline=reader.readLine())!=null)
		{
				String Line[]=Rline.split(",");
				System.out.println(Line[0]+"  "+Line[1]);
		}
		
	}

}
