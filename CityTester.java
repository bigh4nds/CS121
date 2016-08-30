public class CityTester 
{
  public static void main(String[] args)
  {
      DisplayWindow display = new DisplayWindow("Future Boston");
      CityPanel p = new CityPanel();
      display.addPanel(p);
      display.showFrame();
    }
}