import java.util.Scanner;
import java.io.*;

public class Echo
{
	String fileName;
	Scanner scan; 

	public Echo(String f) throws IOException
	{
		fileName = f;
		scan = new Scanner(new FileReader(fileName));
	}

	public void readLines()
	{
		while(scan.hasNext())
		{
			processLine(scan.nextLine());
		}
		scan.close();
	}

	public void processLine(String line)
	{ 
		System.out.println(line);
	}
}