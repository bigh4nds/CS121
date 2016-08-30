import java.util.*;
import java.io.*;

public class ScrabbleDriver{
  public static void main(String args[]) 
  {
    try{
    Scanner s = new Scanner(System.in);
    System.out.println("enter file name, then word size");
    String f = s.next();
    int size = s.nextInt();
    Scrabble scrab = new Scrabble(f,size);
    scrab.readLines();
    scrab.reportWinner();
    }
    catch(Exception e)
    {System.out.println(e);}
  }
}