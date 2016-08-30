import java.util.*;
public class PigDriver{
  public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   String t = " ";
   Piglatin p = new Piglatin();
   while(t.length() > 0){
     t = scan.nextLine();
     t = t.toLowerCase();
     p.pigConvert(t);
   }
   p.pigReport();
  }
} 
