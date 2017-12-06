/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadastrarFicha;

import java.awt.event.KeyEvent;

/**
 * @author tiago
*/

public class WayPoint
{
  Thread t1; // Thread t1 para o metodo VegaTrain
  beansCadastrarFicha beans = new beansCadastrarFicha();

  public void TreinarVega(beansCadastrarFicha beans)
  {
        t1 = new Thread(){   // thread 1
        @Override
        public void run() {
        while(beans.getBotStatus() == true) {
            iRobot_Functions irlf = new iRobot_Functions();
            if(beans.getBotStatus()== true) {
                /* Logando RDP */
                irlf.MouseClick("left", 105, 584); // desktop LXDE func
                irlf.MouseClick("left", 60, 249); // 3 icone LXTerminal
                irlf.Press(KeyEvent.VK_ENTER); // enter pra abrir LXTERMINAL selecionado
                irlf.Send("rdesktop rj-dc-01");
                irlf.Press(KeyEvent.VK_ENTER);
                irlf.MouseClick("left", 536, 210); // outro usuario
                // apagar 16 caracteres do usuário que vem em padrão
                for(int i = 1; i < 16; i++) { irlf.Press(KeyEvent.VK_BACK_SPACE); }
                irlf.Send("BASILIO\analista03");
                irlf.Press(KeyEvent.VK_TAB);
                irlf.Send("*SENHAANALISTA*");
                irlf.Press(KeyEvent.VK_ENTER);
                
                /* Cadastra no AD */
                irlf.MouseClick("left", 30, 161); // gerenciador de usuário
                // não se esquecer de ao fechar o gerenciador de usuário deixar com a aba escritorio aberta e todos minimizados
                if(estado == RJ) {
                    irlf.MouseClick("left", 119, 309); // abrir aba RJ
                    if(cargo == Advogado) {
                        irlf.MouseClick("left", 187, 325); // OU advogados
                    }
                    else if(cargo == Estagiario) {
                        irlf.MouseClick("left", 194, 362); // OU estagiarios
                    }
                    else if(cargo == Funcionario) {
                        irlf.MouseClick("left", 193, 380); // OU funcionario
                    }
                    irlf.MouseClick("left", 347, 79); // criar um novo usuário no container atual
                    irlf.Send("Tiago");
                    irlf.Press(KeyEvent.VK_TAB);
                    irlf.Press(KeyEvent.VK_TAB);
                    irlf.Send("Duarte");
                    irlf.Press(KeyEvent.VK_TAB);
                    irlf.Press(KeyEvent.VK_TAB);
                    irlf.Send("tduarte");
                    irlf.Press(KeyEvent.VK_ENTER);
                    irlf.Send("*SENHAPADRAO*");
                    irlf.Press(KeyEvent.VK_TAB);
                    irlf.Send("*SENHAPADRAO*");
                    irlf.MouseClick("left", 106, 211); // desmarcar "O usuário deve..."
                    irlf.MouseClick("left", 107, 263); // marcar "A senha nunca expira"
                    irlf.Press(KeyEvent.VK_ENTER); // pra avançar
                    irlf.Press(KeyEvent.VK_ENTER); // pra concluir
                    irlf.MouseClick("left", 119, 309); // fechar aba RJ
                }
                else if(estado == SP) {
                    irlf.MouseClick("left", 118, 326); // abrir aba SP
                    if(cargo == Advogado) {
                        irlf.MouseClick("left", 198, 362); // OU advogados
                    }
                    else if(cargo == Estagiario) {
                        irlf.MouseClick("left", 197, 398); // OU estagiarios
                    }
                    else if(cargo == Funcionario) {
                        irlf.MouseClick("left", 188, 416); // OU funcionario
                    }
                    irlf.MouseClick("left", 347, 79); // criar um novo usuário no container atual
                    irlf.Send("Tiago");
                    irlf.Press(KeyEvent.VK_TAB);
                    irlf.Press(KeyEvent.VK_TAB);
                    irlf.Send("Duarte");
                    irlf.Press(KeyEvent.VK_TAB);
                    irlf.Press(KeyEvent.VK_TAB);
                    irlf.Send("tduarte");
                    irlf.Press(KeyEvent.VK_ENTER);
                    irlf.Send("*SENHAPADRAO*");
                    irlf.Press(KeyEvent.VK_TAB);
                    irlf.Send("*SENHAPADRAO*");
                    irlf.MouseClick("left", 106, 211); // desmarcar "O usuário deve..."
                    irlf.MouseClick("left", 107, 263); // marcar "A senha nunca expira"
                    irlf.Press(KeyEvent.VK_ENTER); // pra avançar
                    irlf.Press(KeyEvent.VK_ENTER); // pra concluir
                    irlf.MouseClick("left", 118, 326); // fechar aba SP
                }
                else if(estado == DF) {
                    irlf.MouseClick("left", 119, 291); // abrir aba BSB
                    if(cargo == Advogado) {
                        irlf.MouseClick("left", 196, 325); // OU advogados
                    }
                    else if(cargo == Estagiario) {
                        irlf.MouseClick("left", 196, 361); // OU estagiarios
                    }
                    else if(cargo == Funcionario) {
                        irlf.MouseClick("left", 201, 378); // OU funcionario
                    }
                    irlf.MouseClick("left", 347, 79); // criar um novo usuário no container atual
                    irlf.Send("Tiago");
                    irlf.Press(KeyEvent.VK_TAB);
                    irlf.Press(KeyEvent.VK_TAB);
                    irlf.Send("Duarte");
                    irlf.Press(KeyEvent.VK_TAB);
                    irlf.Press(KeyEvent.VK_TAB);
                    irlf.Send("tduarte");
                    irlf.Press(KeyEvent.VK_ENTER);
                    irlf.Send("*SENHAPADRAO*");
                    irlf.Press(KeyEvent.VK_TAB);
                    irlf.Send("*SENHAPADRAO*");
                    irlf.MouseClick("left", 106, 211); // desmarcar "O usuário deve..."
                    irlf.MouseClick("left", 107, 263); // marcar "A senha nunca expira"
                    irlf.Press(KeyEvent.VK_ENTER); // pra avançar
                    irlf.Press(KeyEvent.VK_ENTER); // pra concluir
                    irlf.MouseClick("left", 119, 291); // fechar aba BSB
                }
                // fechar gerenciador de usuários
                irlf.MouseClick("left", 773, 28); // X
            }
            /* 
                Cria Diretorio - permissões
            */
            if(cargo == Advogado || cargo == Estagiario) {
                if(beans.getBotStatus() == true) {
                    irlf.MouseClick("left", 29, 132); // pastinha
                    if(estado == RJ) {
                        irlf.MouseClick("left", 328, 365); // unidade mapeada RJ
                        irlf.Press(KeyEvent.VK_ENTER);
                        // pasta de adv ou est
                        if(cargo == Advogado) {
                            irlf.MouseClick("left", 295, 258);
                        }
                        else if(cargo == Estagiario) {
                            irlf.MouseClick("left", 288, 426);
                        }
                        irlf.Press(KeyEvent.VK_ENTER);
                        irlf.MouseClick("left", 484, 93); // nova pasta
                        irlf.Send("Tiago Duarte");
                        irlf.Press(KeyEvent.VK_ENTER);
                        // criou a pasta, agr seta as permissões
                        irlf.MouseClick("left", 581, 87); // propriedades
                        irlf.MouseClick("left", 504, 139); // propriedades - segurança
                        irlf.MouseClick("left", 726, 453); // avançadas
                        /* Permitir */
                        irlf.MouseClick("left", 726, 453); // adicionar
                        irlf.MouseClick("left", 347, 88); // selecionar entidade de segurança
                        if(equipe == ATB) { irlf.Send("equipeatb"); }
                        else if(equipe == JAB) { irlf.Send("equipejab"); }
                        else if(equipe == JRS) { irlf.Send("equipejrs"); }
                        else if(equipe == MRF) { irlf.Send("equipemrf"); }
                        else if(equipe == MHN) { irlf.Send("equipemhn"); }
                        else if(equipe == BSB) { irlf.Send("equipebsb"); }
                        else if(equipe == SP) { irlf.Send("equipesp"); }
                        irlf.Press(KeyEvent.VK_ENTER);
                        irlf.MouseClick("left", 751, 213); // mostrar permissões avançadas
                        irlf.MouseClick("left", 164, 233); // controle total
                        irlf.MouseClick("left", 485, 340); // remover- Alterar permissões
                        irlf.MouseClick("left", 486, 362); // remover- Apropriar-se
                        irlf.MouseClick("left", 613, 141); // clicar num campo limpo pra dar enter (pq não da pra ver a tela toda)
                        irlf.Press(KeyEvent.VK_ENTER);
                        /* Negar */
                        irlf.MouseClick("left", 726, 453); // adicionar
                        irlf.MouseClick("left", 347, 88); // selecionar entidade de segurança
                        if(equipe == ATB) { irlf.Send("equipeatb"); }
                        else if(equipe == JAB) { irlf.Send("equipejab"); }
                        else if(equipe == JRS) { irlf.Send("equipejrs"); }
                        else if(equipe == MRF) { irlf.Send("equipemrf"); }
                        else if(equipe == MHN) { irlf.Send("equipemhn"); }
                        else if(equipe == BSB) { irlf.Send("equipebsb"); }
                        else if(equipe == SP) { irlf.Send("equipesp"); }
                        irlf.Press(KeyEvent.VK_ENTER);
                        irlf.MouseClick("left", 304, 117); // selecionar tipo
                        irlf.MouseClick("left", 240, 137); // negar
                        irlf.MouseClick("left", 273, 152); // selecionar aplicavel a
                        irlf.MouseClick("left", 270, 173); // esta pasta somente
                        irlf.MouseClick("left", 165, 277); // remover- ler & executar
                        irlf.MouseClick("left", 165, 318); // remover- leitura
                        irlf.MouseClick("left", 751, 213); // mostrar permissões avançadas
                        irlf.MouseClick("left", 476, 298); // excluir
                        irlf.MouseClick("left", 613, 141); // clicar num campo limpo pra dar enter (pq não da pra ver a tela toda)
                        irlf.Press(KeyEvent.VK_ENTER);
                    }
                }
            }
            if(beans.getBotStatus()== true) {
                /* Cadastra no Exchange */
                irlf.MouseClick("left", 45, 106); // fav WebMail
                irlf.MouseClick("left", 194, 359); // button admin
                irlf.MouseClick("left", 226, 370); // button adicionar um usuario
                irlf.MouseClick("left", 33, 315); // nome_textfield
                irlf.Send("Tiago");
                irlf.MouseClick("left", 234, 314); // sobrenome_textfield
                irlf.Send("Duarte");
                irlf.MouseClick("left", 21, 379); // nome exibição_textfield
                irlf.Send("Tiago Duarte");
                irlf.MouseClick("left", 17, 441); // email de usuário_textfield
                irlf.Send("tduarte");
                irlf.MouseClick("left", 793, 556); // descer tela
                irlf.MouseClick("left", 28, 354); // senha_button
                irlf.MouseClick("left", 79, 451); // permita-me criar a senha
                irlf.MouseClick("left", 86, 486); // senha_textfield
                irlf.Send("*SENHAPADRAO*");
                irlf.MouseClick("left", 792, 559); // descer tela
                irlf.MouseClick("left", 86, 460); // licenças_button
                irlf.MouseClick("left", 391, 523); // exchange online select
                irlf.MouseClick("left", 794, 561); // descer tela
                irlf.MouseClick("left", 26, 555); // adicionar_button
                /* Adiciona ao Grupo do EXCHANGE */
            }
            if(beans.getBotStatus()== true) {
                /* Cadastra no OTRS */
                irlf.MouseClick("left", 112, 101); // fav OTRS
                irlf.MouseClick("left", 414, 400); // tfigueiredo
                irlf.MouseClick("left", 396, 504); // login button
                irlf.MouseClick("left", 406, 189); // clientes
                irlf.MouseClick("left", 99, 359); // adicionar cliente
                irlf.MouseClick("left", 461, 330); // nome_textfield
                irlf.Send("Tiago");
                irlf.MouseClick("left", 460, 361); // sobrenome_textfield
                irlf.Send("Duarte");
                irlf.MouseClick("left", 456, 391); // login_textfield
                irlf.Send("tduarte");
                irlf.MouseClick("left", 456, 452); // email_textfield
                irlf.Send("tduarte@basilioadvogados.com.br");
                irlf.MouseClick("left", 455, 482); // idcliente_textfield
                irlf.Send("tduarte@basilioadvogados.com.br");
                irlf.MouseClick("left", 792, 485); // descer tela
                irlf.MouseClick("left", 491, 477); // enviar button
            }
            if(beans.getBotStatus()== true) {
                /* Cadastra nas Impressoras (scanner) */
                // imp 1
                irlf.MouseClick("left", 173, 103); // fav IMP1
                
                irlf.MouseClick("left", 435, 273); // login_textfield
                irlf.MouseClick("left", 476, 398); // 7654321
                irlf.MouseClick("left", 690, 438); // login_button
                irlf.MouseClick("left", 572, 569); // address book
                irlf.MouseClick("left", 385, 303); // adrress list 01
                irlf.MouseClick("left", 385, 317); // register new destination...
                irlf.MouseClick("left", 395, 473); // name_textfield
                irlf.Send("Tiago Duarte");
                irlf.MouseClick("left", 392, 524); // emailadress_textfield
                irlf.Send("tduarte@basilioadvogados.com.br");
                irlf.MouseClick("left", 666, 316); // ok_button
                // imp 2
                irlf.MouseClick("left", 236, 104); // fav IMP2
                
                irlf.MouseClick("left", 435, 273); // login_textfield
                irlf.MouseClick("left", 476, 398); // 7654321
                irlf.MouseClick("left", 690, 438); // login_button
                irlf.MouseClick("left", 572, 569); // address book
                irlf.MouseClick("left", 385, 303); // adrress list 01
                irlf.MouseClick("left", 385, 317); // register new destination...
                irlf.MouseClick("left", 395, 473); // name_textfield
                irlf.Send("Tiago Duarte");
                irlf.MouseClick("left", 392, 524); // emailadress_textfield
                irlf.Send("tduarte@basilioadvogados.com.br");
                irlf.MouseClick("left", 666, 316); // ok_button
                // imp 3
                irlf.MouseClick("left", 293, 103); // fav IMP3
                
                irlf.MouseClick("left", 435, 273); // login_textfield
                irlf.MouseClick("left", 476, 398); // 7654321
                irlf.MouseClick("left", 690, 438); // login_button
                irlf.MouseClick("left", 572, 569); // address book
                irlf.MouseClick("left", 385, 303); // adrress list 01
                irlf.MouseClick("left", 385, 317); // register new destination...
                irlf.MouseClick("left", 395, 473); // name_textfield
                irlf.Send("Tiago Duarte");
                irlf.MouseClick("left", 392, 524); // emailadress_textfield
                irlf.Send("tduarte@basilioadvogados.com.br");
                irlf.MouseClick("left", 666, 316); // ok_button
                // imp 4
                irlf.MouseClick("left", 349, 106); // fav IMP4
                
                irlf.MouseClick("left", 435, 273); // login_textfield
                irlf.MouseClick("left", 476, 398); // 7654321
                irlf.MouseClick("left", 690, 438); // login_button
                irlf.MouseClick("left", 572, 569); // address book
                irlf.MouseClick("left", 385, 303); // adrress list 01
                irlf.MouseClick("left", 385, 317); // register new destination...
                irlf.MouseClick("left", 395, 473); // name_textfield
                irlf.Send("Tiago Duarte");
                irlf.MouseClick("left", 392, 524); // emailadress_textfield
                irlf.Send("tduarte@basilioadvogados.com.br");
                irlf.MouseClick("left", 666, 316); // ok_button
                // imp 5
                irlf.MouseClick("left", 407, 106); // fav IMP5
                
                irlf.MouseClick("left", 435, 273); // login_textfield
                irlf.MouseClick("left", 476, 398); // 7654321
                irlf.MouseClick("left", 690, 438); // login_button
                irlf.MouseClick("left", 572, 569); // address book
                irlf.MouseClick("left", 385, 303); // adrress list 01
                irlf.MouseClick("left", 385, 317); // register new destination...
                irlf.MouseClick("left", 395, 473); // name_textfield
                irlf.Send("Tiago Duarte");
                irlf.MouseClick("left", 392, 524); // emailadress_textfield
                irlf.Send("tduarte@basilioadvogados.com.br");
                irlf.MouseClick("left", 666, 316); // ok_button
            }
       }
          
      }  
    };t1.start();
}

}
