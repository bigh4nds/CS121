//Christopher Finn (23657096)
import java.util.*;

public class PairTester 
{
	public static void main(String[] args) 
	{
		try
		{
		    Scanner s = new Scanner(System.in);
		    System.out.print("enter file name: ");
		    String f = s.next();
		    PairFreq pair = new PairFreq(f);
		    pair.pairGenerator();
		    pair.readLines();
		    pair.reportScore();
		 }
		 catch(Exception e)
		 {
		   	System.out.println(e);
		 }
	}
}
