//Christopher Finn (23657096)
import java.io.IOException;
import java.util.*;

public class PairFreq extends Echo
{
	private int[][] score= new int[26][26];
	private String[][] pair= new String[26][26];
	
	public PairFreq(String l) throws IOException
	{
		super(l);
	}
	
	public void processLine(String line)
	{
		String str="";
		StringTokenizer st = new StringTokenizer(line);
		while (st.hasMoreTokens()) 
		{
			str=(st.nextToken());
			str=str.toLowerCase();
			freqCheck(str);
		}
	}
	
	public void pairGenerator()
	{
		String alphabet="abcdefghijklmnopqrstuvwxyz";
		for(int i=0; i<26; i++)
		{
			for(int k=0; k<26; k++)
			{
				pair[i][k]=""+alphabet.charAt(i)+alphabet.charAt(k);
			}
		}
	}
	
	public void freqCheck(String str)
	{
		for(int i=0; i<26; i++)
		{
			for(int k=0; k<26; k++)
			{
				for(int q=0; q<str.length()-1; q++)
				{
					String temp=str.substring(q,q+2);
					if(temp.equals(pair[i][k]))
					{
						score[i][k]++;
					}
				}
				
			}
		}
	}
	
	public void reportScore()
	{
		for(int i=0; i<26; i++)
		{
			for(int k=0; k<26; k++)
			{
				System.out.println(score[i][k]);
			}
		}
	}

}
