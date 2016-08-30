import java.util.*;
public class CountingNonBlank {
	
	public static void main(String[] args) {
		int bcount=0;
		int head=0;
		String word;
		Scanner console= new Scanner(System.in);
		String line= console.nextLine();
		for(int i=0; i<line.length(); i++)
		{
			if(line.charAt(i)== ' ')
			{
				bcount++;
				word=line.substring(head,i);
				head=i+1;
				System.out.println(word);
			}
		}
		word=line.substring(head,line.length());
		System.out.println(word);
		System.out.println(line.length()-bcount);
	}
}
