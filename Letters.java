//Christopher Finn (23657096)
public class Letters 
{	
	private String word;
	
	public Letters(String str)
	{
		word=str.toLowerCase();
	}
	
	public int countLetters(char l)
	{
		char letter=l;
		int count=0;
		for(int k=0; k<word.length(); k++)
		{
			if(word.charAt(k)==letter)
			{
				count++;
			}
		}
		return count;
	}
}
