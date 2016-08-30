//Christopher Finn (23657096)
import java.io.*;
import java.util.*;

public class Scrabble extends Echo
{
	private String filename;
	private int size;
	private int[] score={1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
	private String alphabet="abcdefghijklmnopqrstuvwxyz";
	private int highestScore=0;
	private String highestWord="";
	
	public Scrabble(String f, int s) throws IOException
	{
		super(f);
		size=s;
	}
	
	public void processLine(String line)
	{
		String str="";
		StringTokenizer st = new StringTokenizer(line,  ",.?! {}[];:");
		while (st.hasMoreTokens()) 
		{
			str=(st.nextToken());
			if(str.length()==size)
			{
				scoreCheck(str.toLowerCase());
			}			
		}
	}
	
	public void scoreCheck(String str)
	{
		int wordScore=0;
		for(int k=0; k<str.length(); k++)
		{
			for(int i=0; i<26; i++)
			{
				if(str.charAt(k)==alphabet.charAt(i))
				{
					wordScore+=score[i];
					i=26;
				}
			}
		}
		if(wordScore>highestScore)
		{
			highestScore=wordScore;
			highestWord=str;
		}
	}
	
	public void reportWinner()
	{
		System.out.print(highestWord+" is the highest scoring "+size+" letter word with a total word score of "+highestScore);
	}
}
