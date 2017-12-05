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
                /* Logando RDP */
                irf.MouseClick("left", 105, 584); // desktop LXDE func
                irf.MouseClick("left", 60, 249); // 3 icone LXTerminal
                irf.Press(KeyEvent.VK_ENTER); // enter pra abrir LXTERMINAL selecionado
                irf.Send("rdesktop rj-dc-01");
                irf.Press(KeyEvent.VK_ENTER);
                irf.MouseClick("left", 536, 210); // outro usuario
                // apagar 16 caracteres do usuário que vem em padrão
                for(int i = 1; i < 16; i++) { irf.Press(KeyEvent.VK_BACK_SPACE); }
                irf.Send("BASILIO\analista03");
                irf.Press(KeyEvent.VK_TAB);
                irf.Send("*SENHAANALISTA*");
                irf.Press(KeyEvent.VK_ENTER);
                
                /* Cadastra no AD */
                irf.MouseClick("left", 30, 161); // gerenciador de usuário
                // não se esquecer de ao fechar o gerenciador de usuário deixar com a aba escritorio aberta e todos minimizados
                if(estado == RJ) {
                    irf.MouseClick("left", 119, 309); // abrir aba RJ
                    if(cargo == Advogado) {
                        irf.MouseClick("left", 187, 325); // OU advogados
                    }
                    else if(cargo == Estagiario) {
                        irf.MouseClick("left", 194, 362); // OU estagiarios
                    }
                    else if(cargo == Funcionario) {
                        irf.MouseClick("left", 193, 380); // OU funcionario
                    }
                    irf.MouseClick("left", 347, 79); // criar um novo usuário no container atual
                    irf.Send("Tiago");
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Send("Duarte");
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Send("tduarte");
                    irf.Press(KeyEvent.VK_ENTER);
                    irf.Send("*SENHAPADRAO*");
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Send("*SENHAPADRAO*");
                    irf.MouseClick("left", 106, 211); // desmarcar "O usuário deve..."
                    irf.MouseClick("left", 107, 263); // marcar "A senha nunca expira"
                    irf.Press(KeyEvent.VK_ENTER); // pra avançar
                    irf.Press(KeyEvent.VK_ENTER); // pra concluir
                    irf.MouseClick("left", 119, 309); // fechar aba RJ
                }
                else if(estado == SP) {
                    irf.MouseClick("left", 118, 326); // abrir aba SP
                    if(cargo == Advogado) {
                        irf.MouseClick("left", 198, 362); // OU advogados
                    }
                    else if(cargo == Estagiario) {
                        irf.MouseClick("left", 197, 398); // OU estagiarios
                    }
                    else if(cargo == Funcionario) {
                        irf.MouseClick("left", 188, 416); // OU funcionario
                    }
                    irf.MouseClick("left", 347, 79); // criar um novo usuário no container atual
                    irf.Send("Tiago");
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Send("Duarte");
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Send("tduarte");
                    irf.Press(KeyEvent.VK_ENTER);
                    irf.Send("*SENHAPADRAO*");
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Send("*SENHAPADRAO*");
                    irf.MouseClick("left", 106, 211); // desmarcar "O usuário deve..."
                    irf.MouseClick("left", 107, 263); // marcar "A senha nunca expira"
                    irf.Press(KeyEvent.VK_ENTER); // pra avançar
                    irf.Press(KeyEvent.VK_ENTER); // pra concluir
                    irf.MouseClick("left", 118, 326); // fechar aba SP
                }
                else if(estado == DF) {
                    irf.MouseClick("left", 119, 291); // abrir aba BSB
                    if(cargo == Advogado) {
                        irf.MouseClick("left", 196, 325); // OU advogados
                    }
                    else if(cargo == Estagiario) {
                        irf.MouseClick("left", 196, 361); // OU estagiarios
                    }
                    else if(cargo == Funcionario) {
                        irf.MouseClick("left", 201, 378); // OU funcionario
                    }
                    irf.MouseClick("left", 347, 79); // criar um novo usuário no container atual
                    irf.Send("Tiago");
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Send("Duarte");
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Send("tduarte");
                    irf.Press(KeyEvent.VK_ENTER);
                    irf.Send("*SENHAPADRAO*");
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Send("*SENHAPADRAO*");
                    irf.MouseClick("left", 106, 211); // desmarcar "O usuário deve..."
                    irf.MouseClick("left", 107, 263); // marcar "A senha nunca expira"
                    irf.Press(KeyEvent.VK_ENTER); // pra avançar
                    irf.Press(KeyEvent.VK_ENTER); // pra concluir
                    irf.MouseClick("left", 119, 291); // fechar aba BSB
                }
                // fechar gerenciador de usuários
                irf.MouseClick("left", 773, 28); // X
            }
            /* Cria Diretorio - permissões */
            if(cargo == Advogado || cargo == Estagiario) {
                if(beans.getBotStatus() == true) {
                    irf.MouseClick("left", 29, 132); // pastinha
                    if(estado == RJ) {
                        irf.MouseClick("left", 328, 365); // unidade mapeada RJ
                        irf.Press(KeyEvent.VK_ENTER);
                        // pasta de adv ou est
                        if(cargo == Advogado) {
                            irf.MouseClick("left", 295, 258);
                        }
                        else if(cargo == Estagiario) {
                            irf.MouseClick("left", 288, 426);
                        }
                        irf.Press(KeyEvent.VK_ENTER);
                        irf.MouseClick("left", 484, 93); // nova pasta
                        irf.Send("Tiago Duarte");
                        irf.Press(KeyEvent.VK_ENTER);
                        
                    }
                    irf.Press(KeyEvent.VK_ENTER);
                }
            }
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
                irf.Send("*SENHAPADRAO*");
                irf.MouseClick("left", 792, 559); // descer tela
                irf.MouseClick("left", 86, 460); // licenças_button
                irf.MouseClick("left", 391, 523); // exchange online select
                irf.MouseClick("left", 794, 561); // descer tela
                irf.MouseClick("left", 26, 555); // adicionar_button
                /* Adiciona ao Grupo do EXCHANGE (ultimo pra dar tempo de atualizar) */
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
       }
          
      }  
    };t1.start();
}

}
