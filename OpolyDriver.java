import java.util.*;

public class OpolyDriver{
  
  public static void main(String[] args){
    System.out.println("Enter an int - the size of the board");
    Scanner s = new Scanner(System.in);
    int boardSize = s.nextInt();
    System.out.println("Board Size: " + boardSize);
    Opoly g = new Opoly(boardSize);
    g.playGame();
  }
}

