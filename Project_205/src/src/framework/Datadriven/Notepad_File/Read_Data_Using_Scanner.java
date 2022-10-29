package framework.Datadriven.Notepad_File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read_Data_Using_Scanner {

	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("src\\framework\\Datadriven\\Notepad_File\\input.txt");
		Scanner sc=new Scanner(fr);
		System.out.println("File located");
		
		
	
		String line=sc.next();
		String Rline[]=line.split(",");
		System.out.println(Rline[0]+"  "+Rline[1]);
		
		
		
		//Create object for Scanner
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter your username");
		String UID=sc1.nextLine();
		System.out.println(UID);
		
		System.out.println("Enter Start Number");
		int Snum=sc1.nextInt();
		System.out.println("Enter End Number");
		int Enum=sc1.nextInt();
		
		for (int i = Snum; i <= Enum; i++) 
		{
			System.out.println(i);
		}

	}

}
