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
 * @author tiago
*/


public class WayPoint
{
      Thread t1; // Thread t1 para o metodo VegaTrain
    beansVegaTrain beans = new beansVegaTrain();
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

  public void TreinarVega(beansVegaTrain beans)
  {
      
       t1 = new Thread(){   // thread 1
        @Override
        public void run() {
        while(beans.getBotStatus() == true) {
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
        if(beans.getBotStatus()== true) { // Caso aperte o BOTAO PAUSE e esteja no meio do while parar aqui... 
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
    };t1.start();
}

}
