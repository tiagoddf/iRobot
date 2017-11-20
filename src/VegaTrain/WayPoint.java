/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VegaTrain;
import iRobot.iRobot_Functions;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tiago
 */
public class WayPoint
{
  public void AntiIdle()
  {
      try {
          Robot robot = new Robot();
          robot.keyPress(KeyEvent.VK_CONTROL);
          robot.keyPress(KeyEvent.VK_RIGHT);
          robot.keyRelease(KeyEvent.VK_RIGHT);
          robot.delay(200);
          robot.keyPress(KeyEvent.VK_DOWN);
          robot.keyRelease(KeyEvent.VK_DOWN);
          robot.keyRelease(KeyEvent.VK_CONTROL);
      } catch (AWTException ex) {
          Logger.getLogger(WayPoint.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  public void TreinarVega()
  {
      while(rodandobot == true) {
        iRobot_Functions irf = new iRobot_Functions();
        /* CHAR 1 */
        // come food
        irf.Press(KeyEvent.VK_F2);
        irf.Wait(1000);
        // exura
        irf.Press(KeyEvent.VK_F3);
        irf.Wait(1000);
        // anti-idle (rodadinha)
        AntiIdle();
        // mudar de janela char 2
        irf.MouseClick("left", 2, 2);
        /* CHAR 2 */
        // come food
        irf.Press(KeyEvent.VK_F2);
        irf.Wait(1000);
        // exura
        irf.Press(KeyEvent.VK_F3);
        irf.Wait(1000);
        // anti-idle (rodadinha)
        AntiIdle();
        // mudar janela char 1
        irf.MouseClick("left", 1, 1);
      }
  }  
}
