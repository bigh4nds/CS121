//Christopher Finn (23657096)
import java.util.StringTokenizer;
	
public class Piglatin
{
	private String[] clines= new String[50];//Array of converted lines
	private int count=0;//Line count
	
	public Piglatin()
	{
		
	}

	//Tokenizes the line and converts the line, word by word, to piglatin
	public void pigConvert(String t)
	{
		String str="";
		String cstr="";
		char fl=' ';
		StringTokenizer st = new StringTokenizer(t);
		clines[count]="";
		while (st.hasMoreTokens()) 
		{
			str=(st.nextToken());
			fl=str.charAt(0);
			cstr=str.substring(1,str.length());
			clines[count]+=cstr+fl+"ay"+" ";			
		}
		count++;
	}
	
	//Prints the converted lines
	public void pigReport()
	{
		for(int i=0; i<count; i++)
		{
			System.out.println(clines[i]);
		}
	}
}
