package CadastrarFicha;

import java.awt.AWTException;
import java.awt.Robot;

public class WayPoint
{
  Robot r = new Robot();
  public static void main(String[] args) throws AWTException
  {
    r.delay(5000);
      
    r.delay(1000);
    MouseClick("left", 100, 100);
    
    r.delay(1000);
    Send("This is a iRobot test!");
  }  
}