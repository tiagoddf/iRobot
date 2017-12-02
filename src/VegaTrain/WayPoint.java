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
  int espera = beans.getDelayinterval();
  int x1 = beans.getXposTela1();
  int y1 = beans.getYposTela1();
  int x2 = beans.getXposTela2();
  int y2 = beans.getYposTela2();
  
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
            System.out.println(espera);
            System.out.println(x1);
            System.out.println(y1);
            System.out.println(x2);
            System.out.println(y2);
            iRobot_Functions irf = new iRobot_Functions();
            /* CHAR 1 */
            // mudar de janela char 1
            irf.Wait(espera);
            irf.MouseClick("left", x1, y1);
            // come food
            irf.Wait(espera);
            irf.Press(KeyEvent.VK_F2);
            // exura
            irf.Wait(espera);
            irf.Press(KeyEvent.VK_F3);
            // anti-idle (rodadinha)
            irf.Wait(espera);
            AntiIdle();
        if(beans.getBotStatus()== true) { // Caso aperte o BOTAO PAUSE e esteja no meio do while parar aqui... 
            /* CHAR 2 */
            // mudar janela char 2
            irf.Wait(espera);
             irf.MouseClick("left", x2, y2);
            // come food
            irf.Wait(espera);
            irf.Press(KeyEvent.VK_F2);
            // exura
            irf.Wait(espera);
            irf.Press(KeyEvent.VK_F3);
            // anti-idle (rodadinha)
            irf.Wait(espera);
            AntiIdle();
        }
       }
          
      }  
    };t1.start();
}

}
