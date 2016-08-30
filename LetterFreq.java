//Christopher Finn (23657096)
import java.util.*;
public class LetterFreq {

		public static void main(String[] args) 
		{
		Letters[] lines = new Letters[50];
		Scanner scan = new Scanner(System.in);
		int pos = 0;
		String t = " ";
		int BCount=0;
		int count= 0;
		char letter;
		while(BCount!=2)
		{
			t = scan.nextLine();
		    if(t.length()==0)
			{
		    	BCount++;
			}
			else
			{		        
		        lines[pos] = new Letters(t);
		        pos++;
			}
		}
		System.out.println("Two returns");
		String alphabet="abcdefghijklmnopqrstuvwxyz";
		for(int i=0; i<26; i++)
		{
			letter=alphabet.charAt(i);
			count=0;
			for(int k=0; k<pos; k++)
			{
			count+=lines[k].countLetters(letter);
			}
			System.out.println(letter+": "+count);
		}
	}
}