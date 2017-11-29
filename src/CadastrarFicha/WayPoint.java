/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadastrarFicha;

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
  beansCadastrarFicha beans = new beansCadastrarFicha();
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

  public void TreinarVega(beansCadastrarFicha beans)
  {
      
        t1 = new Thread(){   // thread 1
        @Override
        public void run() {
        while(beans.getBotStatus() == true) {
            iRobot_Functions irf = new iRobot_Functions();
            if(beans.getBotStatus()== true) {
                /* Cadastra no Exchange */
                System.out.println("");
            }
            if(beans.getBotStatus()== true) {
                /* Cadastra no AD */
                
            }
            if(beans.getBotStatus()== true) {
                /* Cria Diretorio - permissões */
                
            }
            if(beans.getBotStatus()== true) {
                /* Cadastra no OTRS */
                
            }
            if(beans.getBotStatus()== true) {
                /* Cadastra nas Impressoras (scanner) */
                
            }
            if(beans.getBotStatus()== true) {
                /* Cadastra nas Impressoras */
                
            }
            if(beans.getBotStatus()== true) {
                /* Adiciona ao Grupo do EXCHANGE (ultimo pra dar tempo de atualizar) */
                
            }
       }
          
      }  
    };t1.start();
}

}
