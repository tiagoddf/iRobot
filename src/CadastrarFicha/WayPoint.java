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
                irf.MouseClick("left", 45, 106); // fav WebMail
                irf.MouseClick("left", 194, 359); // button admin
                irf.MouseClick("left", 226, 370); // button adicionar um usuario
                irf.MouseClick("left", 33, 315); // nome_textfield
                irf.Send("Tiago");
                irf.MouseClick("left", 234, 314); // sobrenome_textfield
                irf.Send("Duarte");
                irf.MouseClick("left", 21, 379); // nome exibição_textfield
                irf.Send("Tiago Duarte");
                irf.MouseClick("left", 17, 441); // email de usuário_textfield
                irf.Send("tduarte");
                irf.MouseClick("left", 793, 556); // descer tela
                irf.MouseClick("left", 28, 354); // senha_button
                irf.MouseClick("left", 79, 451); // permita-me criar a senha
                irf.MouseClick("left", 86, 486); // senha_textfield
                irf.Send("SENHAPADRAO");
                irf.MouseClick("left", 792, 559); // descer tela
                irf.MouseClick("left", 86, 460); // licenças_button
                irf.MouseClick("left", 391, 523); // exchange online select
                irf.MouseClick("left", 794, 561); // descer tela
                irf.MouseClick("left", 26, 555); // adicionar_button
            }
            if(beans.getBotStatus()== true) {
                /* Cadastra no AD */
                // rdp
            }
            if(beans.getBotStatus()== true) {
                /* Cria Diretorio - permissões */
                // rdp
            }
            if(beans.getBotStatus()== true) {
                /* Cadastra no OTRS */
                irf.MouseClick("left", 112, 101); // fav OTRS
                irf.MouseClick("left", 414, 400); // tfigueiredo
                irf.MouseClick("left", 396, 504); // login button
                irf.MouseClick("left", 406, 189); // clientes
                irf.MouseClick("left", 99, 359); // adicionar cliente
                irf.MouseClick("left", 461, 330); // nome_textfield
                irf.Send("Tiago");
                irf.MouseClick("left", 460, 361); // sobrenome_textfield
                irf.Send("Duarte");
                irf.MouseClick("left", 456, 391); // login_textfield
                irf.Send("tduarte");
                irf.MouseClick("left", 456, 452); // email_textfield
                irf.Send("tduarte@basilioadvogados.com.br");
                irf.MouseClick("left", 455, 482); // idcliente_textfield
                irf.Send("tduarte@basilioadvogados.com.br");
                irf.MouseClick("left", 792, 485); // descer tela
                irf.MouseClick("left", 491, 477); // enviar button
            }
            if(beans.getBotStatus()== true) {
                /* Cadastra nas Impressoras (scanner) */
                // imp 1
                irf.MouseClick("left", 173, 103); // fav IMP1
                
                irf.MouseClick("left", 435, 273); // login_textfield
                irf.MouseClick("left", 476, 398); // 7654321
                irf.MouseClick("left", 690, 438); // login_button
                irf.MouseClick("left", 572, 569); // address book
                irf.MouseClick("left", 385, 303); // adrress list 01
                irf.MouseClick("left", 385, 317); // register new destination...
                irf.MouseClick("left", 395, 473); // name_textfield
                irf.Send("Tiago Duarte");
                irf.MouseClick("left", 392, 524); // emailadress_textfield
                irf.Send("tduarte@basilioadvogados.com.br");
                irf.MouseClick("left", 666, 316); // ok_button
                // imp 2
                irf.MouseClick("left", 236, 104); // fav IMP2
                
                irf.MouseClick("left", 435, 273); // login_textfield
                irf.MouseClick("left", 476, 398); // 7654321
                irf.MouseClick("left", 690, 438); // login_button
                irf.MouseClick("left", 572, 569); // address book
                irf.MouseClick("left", 385, 303); // adrress list 01
                irf.MouseClick("left", 385, 317); // register new destination...
                irf.MouseClick("left", 395, 473); // name_textfield
                irf.Send("Tiago Duarte");
                irf.MouseClick("left", 392, 524); // emailadress_textfield
                irf.Send("tduarte@basilioadvogados.com.br");
                irf.MouseClick("left", 666, 316); // ok_button
                // imp 3
                irf.MouseClick("left", 293, 103); // fav IMP3
                
                irf.MouseClick("left", 435, 273); // login_textfield
                irf.MouseClick("left", 476, 398); // 7654321
                irf.MouseClick("left", 690, 438); // login_button
                irf.MouseClick("left", 572, 569); // address book
                irf.MouseClick("left", 385, 303); // adrress list 01
                irf.MouseClick("left", 385, 317); // register new destination...
                irf.MouseClick("left", 395, 473); // name_textfield
                irf.Send("Tiago Duarte");
                irf.MouseClick("left", 392, 524); // emailadress_textfield
                irf.Send("tduarte@basilioadvogados.com.br");
                irf.MouseClick("left", 666, 316); // ok_button
                // imp 4
                irf.MouseClick("left", 349, 106); // fav IMP4
                
                irf.MouseClick("left", 435, 273); // login_textfield
                irf.MouseClick("left", 476, 398); // 7654321
                irf.MouseClick("left", 690, 438); // login_button
                irf.MouseClick("left", 572, 569); // address book
                irf.MouseClick("left", 385, 303); // adrress list 01
                irf.MouseClick("left", 385, 317); // register new destination...
                irf.MouseClick("left", 395, 473); // name_textfield
                irf.Send("Tiago Duarte");
                irf.MouseClick("left", 392, 524); // emailadress_textfield
                irf.Send("tduarte@basilioadvogados.com.br");
                irf.MouseClick("left", 666, 316); // ok_button
                // imp 5
                irf.MouseClick("left", 407, 106); // fav IMP5
                
                irf.MouseClick("left", 435, 273); // login_textfield
                irf.MouseClick("left", 476, 398); // 7654321
                irf.MouseClick("left", 690, 438); // login_button
                irf.MouseClick("left", 572, 569); // address book
                irf.MouseClick("left", 385, 303); // adrress list 01
                irf.MouseClick("left", 385, 317); // register new destination...
                irf.MouseClick("left", 395, 473); // name_textfield
                irf.Send("Tiago Duarte");
                irf.MouseClick("left", 392, 524); // emailadress_textfield
                irf.Send("tduarte@basilioadvogados.com.br");
                irf.MouseClick("left", 666, 316); // ok_button
            }
            if(beans.getBotStatus()== true) {
                /* Adiciona ao Grupo do EXCHANGE (ultimo pra dar tempo de atualizar) */
                // ver navegações entre rdp e navegadores e timers de delay
            }
       }
          
      }  
    };t1.start();
}

}
