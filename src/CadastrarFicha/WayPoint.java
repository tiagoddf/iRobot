package CadastrarFicha;
package iRobot;

import java.awt.AWTException;
import java.awt.Robot;

public class WayPoint
{
  public static void main(String[] args) throws AWTException
  {
    Wait(5000);
      
    Wait(1000);
    MouseClick("left", 100, 100);
    
    Wait(1000);
    Send("This is a iRobot test!");
  }  
}