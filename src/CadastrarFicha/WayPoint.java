package CadastrarFicha;
import java.awt.AWTException;
import iRobot.iRobot_Functions;


public class WayPoint
{
  public static void main(String[] args) throws AWTException
  {
      iRobot_Functions irf = new iRobot_Functions();
      irf.Wait(5000);
      irf.MouseClick("left", 100, 100);
      irf.Wait(1000);
      irf.Send("This is a iRobot test!");
  }  
}