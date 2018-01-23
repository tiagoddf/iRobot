/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadastrarFicha;

import iRobot.iRobot_Functions;
import java.awt.event.KeyEvent;

/**
 * @author tiago
 * 800x600
 * terceiro icone = LXTERMINAL
*/

public class WayPoint
{
  Thread t1; // Thread t1 para o metodo VegaTrain
  beansCadastrarFicha beans = new beansCadastrarFicha();
  String servidor = "rj-dc-01";
  String admUsr = "BASILIO'\'analista03";
  String admPass = "analistaPASS";
  // as senhas do email estão lá embaixo SELIGA
  
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
                irf.Send("rdesktop " + servidor);
                irf.Press(KeyEvent.VK_ENTER);
                irf.MouseClick("left", 536, 210); // outro usuario
                // apagar 16 caracteres do usuário que vem em padrão
                for(int i = 1; i < 16; i++) { irf.Press(KeyEvent.VK_BACK_SPACE); }
                irf.Send(admUsr);
                irf.Press(KeyEvent.VK_TAB);
                irf.Send(admPass);
                irf.Press(KeyEvent.VK_ENTER);
                
                /* Cadastra no AD */
                irf.MouseClick("left", 30, 161); // gerenciador de usuário
                // não se esquecer de ao fechar o gerenciador de usuário deixar com a aba escritorio aberta e todos minimizados
                if("RJ".equals(beans.getEstado())) {
                    irf.MouseClick("left", 119, 309); // abrir aba RJ
                    if("advogado".equals(beans.getCargo())) {
                        irf.MouseClick("left", 187, 325); // OU advogados
                    }
                    else if("estagiario".equals(beans.getCargo())) {
                        irf.MouseClick("left", 194, 362); // OU estagiarios
                    }
                    else if("funcionario".equals(beans.getCargo())) {
                        irf.MouseClick("left", 193, 380); // OU funcionario
                    }
                    irf.MouseClick("left", 347, 79); // criar um novo usuário no container atual
                    irf.Send(beans.getNome());
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Send(beans.getSobreNome());
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Send(beans.getUsuario());
                    irf.Press(KeyEvent.VK_ENTER);
                    irf.Send(beans.getSenha());
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Send(beans.getSenha());
                    irf.MouseClick("left", 106, 211); // desmarcar "O usuário deve..."
                    irf.MouseClick("left", 107, 263); // marcar "A senha nunca expira"
                    irf.Press(KeyEvent.VK_ENTER); // pra avançar
                    irf.Press(KeyEvent.VK_ENTER); // pra concluir
                    irf.MouseClick("left", 119, 309); // fechar aba RJ
                }
                else if("SP".equals(beans.getEstado())) {
                    irf.MouseClick("left", 118, 326); // abrir aba SP
                    if("advogado".equals(beans.getCargo())) {
                        irf.MouseClick("left", 198, 362); // OU advogados
                    }
                    else if("estagiario".equals(beans.getCargo())) {
                        irf.MouseClick("left", 197, 398); // OU estagiarios
                    }
                    else if("funcionario".equals(beans.getCargo())) {
                        irf.MouseClick("left", 188, 416); // OU funcionario
                    }
                    irf.MouseClick("left", 347, 79); // criar um novo usuário no container atual
                    irf.Send(beans.getNome());
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Send(beans.getSobreNome());
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Send(beans.getUsuario());
                    irf.Press(KeyEvent.VK_ENTER);
                    irf.Send(beans.getSenha());
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Send(beans.getSenha());
                    irf.MouseClick("left", 106, 211); // desmarcar "O usuário deve..."
                    irf.MouseClick("left", 107, 263); // marcar "A senha nunca expira"
                    irf.Press(KeyEvent.VK_ENTER); // pra avançar
                    irf.Press(KeyEvent.VK_ENTER); // pra concluir
                    irf.MouseClick("left", 118, 326); // fechar aba SP
                }
                else if("DF".equals(beans.getEstado())) {
                    irf.MouseClick("left", 119, 291); // abrir aba BSB
                    if("advogado".equals(beans.getCargo())) {
                        irf.MouseClick("left", 196, 325); // OU advogados
                    }
                    else if("estagiario".equals(beans.getCargo())) {
                        irf.MouseClick("left", 196, 361); // OU estagiarios
                    }
                    else if("funcionario".equals(beans.getCargo())) {
                        irf.MouseClick("left", 201, 378); // OU funcionario
                    }
                    irf.MouseClick("left", 347, 79); // criar um novo usuário no container atual
                    irf.Send(beans.getNome());
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Send(beans.getSobreNome());
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Send(beans.getUsuario());
                    irf.Press(KeyEvent.VK_ENTER);
                    irf.Send(beans.getSenha());
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Send(beans.getSenha());
                    irf.MouseClick("left", 106, 211); // desmarcar "O usuário deve..."
                    irf.MouseClick("left", 107, 263); // marcar "A senha nunca expira"
                    irf.Press(KeyEvent.VK_ENTER); // pra avançar
                    irf.Press(KeyEvent.VK_ENTER); // pra concluir
                    irf.MouseClick("left", 119, 291); // fechar aba BSB
                }
                // fechar gerenciador de usuários
                irf.MouseClick("left", 773, 28); // X
            }
            /* 
                Cria Diretorio - permissões
            */
            if("advogado".equals(beans.getCargo()) || "estagiario".equals(beans.getCargo())) {
                if(beans.getBotStatus() == true) {
                    irf.MouseClick("left", 29, 132); // pastinha
                    if("RJ".equals(beans.getEstado())) {
                        irf.MouseClick("left", 328, 365); // unidade mapeada RJ
                        irf.Press(KeyEvent.VK_ENTER);
                        // pasta de adv ou est
                        if("advogado".equals(beans.getCargo())) {
                            irf.MouseClick("left", 295, 258);
                        }
                        else if("estagiario".equals(beans.getCargo())) {
                            irf.MouseClick("left", 288, 426);
                        }
                        irf.Press(KeyEvent.VK_ENTER);
                        irf.MouseClick("left", 484, 93); // nova pasta
                        irf.Send(beans.getNome() + " " + beans.getSobreNome());
                        irf.Press(KeyEvent.VK_ENTER);
                        // criou a pasta, agr seta as permissões
                        irf.MouseClick("left", 581, 87); // propriedades
                        irf.MouseClick("left", 504, 139); // propriedades - segurança
                        irf.MouseClick("left", 726, 453); // avançadas
                        /* Permitir */
                        irf.MouseClick("left", 726, 453); // adicionar
                        irf.MouseClick("left", 347, 88); // selecionar entidade de segurança
                        if("ATB".equals(beans.getEquipe())) { irf.Send("equipeatb"); }
                        else if("JAB".equals(beans.getEquipe())) { irf.Send("equipejab"); }
                        else if("JRS".equals(beans.getEquipe())) { irf.Send("equipejrs"); }
                        else if("MRF".equals(beans.getEquipe())) { irf.Send("equipemrf"); }
                        else if("MHN".equals(beans.getEquipe())) { irf.Send("equipemhn"); }
                        else if("BSB".equals(beans.getEquipe())) { irf.Send("equipebsb"); }
                        else if("SP".equals(beans.getEquipe())) { irf.Send("equipesp"); }
                        irf.Press(KeyEvent.VK_ENTER);
                        irf.MouseClick("left", 751, 213); // mostrar permissões avançadas
                        irf.MouseClick("left", 164, 233); // controle total
                        irf.MouseClick("left", 485, 340); // remover- Alterar permissões
                        irf.MouseClick("left", 486, 362); // remover- Apropriar-se
                        irf.MouseClick("left", 613, 141); // clicar num campo limpo pra dar enter (pq não da pra ver a tela toda)
                        irf.Press(KeyEvent.VK_ENTER);
                        /* Negar */
                        irf.MouseClick("left", 726, 453); // adicionar
                        irf.MouseClick("left", 347, 88); // selecionar entidade de segurança
                        if("ATB".equals(beans.getEquipe())) { irf.Send("equipeatb"); }
                        else if("JAB".equals(beans.getEquipe())) { irf.Send("equipejab"); }
                        else if("JRS".equals(beans.getEquipe())) { irf.Send("equipejrs"); }
                        else if("MRF".equals(beans.getEquipe())) { irf.Send("equipemrf"); }
                        else if("MHN".equals(beans.getEquipe())) { irf.Send("equipemhn"); }
                        else if("BSB".equals(beans.getEquipe())) { irf.Send("equipebsb"); }
                        else if("SP".equals(beans.getEquipe())) { irf.Send("equipesp"); }
                        irf.Press(KeyEvent.VK_ENTER);
                        irf.MouseClick("left", 304, 117); // selecionar tipo
                        irf.MouseClick("left", 240, 137); // negar
                        irf.MouseClick("left", 273, 152); // selecionar aplicavel a
                        irf.MouseClick("left", 270, 173); // esta pasta somente
                        irf.MouseClick("left", 165, 277); // remover- ler & executar
                        irf.MouseClick("left", 165, 318); // remover- leitura
                        irf.MouseClick("left", 751, 213); // mostrar permissões avançadas
                        irf.MouseClick("left", 476, 298); // excluir
                        irf.MouseClick("left", 613, 141); // clicar num campo limpo pra dar enter (pq não da pra ver a tela toda)
                        irf.Press(KeyEvent.VK_ENTER);
                    }
                }
            }
            if(beans.getBotStatus()== true) {
                /* Cadastra no Exchange */
                irf.MouseClick("left", 45, 106); // fav WebMail
                irf.MouseClick("left", 194, 359); // button admin
                irf.MouseClick("left", 226, 370); // button adicionar um usuario
                irf.MouseClick("left", 33, 315); // nome_textfield
                irf.Send(beans.getNome());
                irf.MouseClick("left", 234, 314); // sobrenome_textfield
                irf.Send(beans.getSobreNome());
                irf.MouseClick("left", 21, 379); // nome exibição_textfield
                irf.Send(beans.getNome() + " " + beans.getSobreNome());
                irf.MouseClick("left", 17, 441); // email de usuário_textfield
                irf.Send(beans.getUsuario());
                irf.MouseClick("left", 793, 556); // descer tela
                irf.MouseClick("left", 28, 354); // senha_button
                irf.MouseClick("left", 79, 451); // permita-me criar a senha
                irf.MouseClick("left", 86, 486); // senha_textfield
                irf.Send(beans.getSenha());
                irf.MouseClick("left", 792, 559); // descer tela
                irf.MouseClick("left", 86, 460); // licenças_button
                irf.MouseClick("left", 391, 523); // exchange online select
                irf.MouseClick("left", 794, 561); // descer tela
                irf.MouseClick("left", 26, 555); // adicionar_button
                /* Adiciona ao Grupo do EXCHANGE */
            }
            if(beans.getBotStatus()== true) {
                /* Cadastra no OTRS */
                irf.MouseClick("left", 112, 101); // fav OTRS
                irf.MouseClick("left", 414, 400); // tfigueiredo
                irf.MouseClick("left", 396, 504); // login button
                irf.MouseClick("left", 406, 189); // clientes
                irf.MouseClick("left", 99, 359); // adicionar cliente
                irf.MouseClick("left", 461, 330); // nome_textfield
                irf.Send(beans.getNome());
                irf.MouseClick("left", 460, 361); // sobrenome_textfield
                irf.Send(beans.getSobreNome());
                irf.MouseClick("left", 456, 391); // login_textfield
                irf.Send(beans.getUsuario());
                irf.MouseClick("left", 456, 452); // email_textfield
                irf.Send(beans.getUsuario() + "@basilioadvogados.com.br");
                irf.MouseClick("left", 455, 482); // idcliente_textfield
                irf.Send(beans.getUsuario() + "@basilioadvogados.com.br");
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
                irf.Send(beans.getNome() + " " + beans.getSobreNome());
                irf.MouseClick("left", 392, 524); // emailadress_textfield
                irf.Send(beans.getUsuario() + "@basilioadvogados.com.br");
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
                irf.Send(beans.getNome() + " " + beans.getSobreNome());
                irf.MouseClick("left", 392, 524); // emailadress_textfield
                irf.Send(beans.getUsuario() + "@basilioadvogados.com.br");
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
                irf.Send(beans.getNome() + " " + beans.getSobreNome());
                irf.MouseClick("left", 392, 524); // emailadress_textfield
                irf.Send(beans.getUsuario() + "@basilioadvogados.com.br");
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
                irf.Send(beans.getNome() + " " + beans.getSobreNome());
                irf.MouseClick("left", 392, 524); // emailadress_textfield
                irf.Send(beans.getUsuario() + "@basilioadvogados.com.br");
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
                irf.Send(beans.getNome() + " " + beans.getSobreNome());
                irf.MouseClick("left", 392, 524); // emailadress_textfield
                irf.Send(beans.getUsuario() + "@basilioadvogados.com.br");
                irf.MouseClick("left", 666, 316); // ok_button
            }
            if(beans.getBotStatus()== true) {
                String sender = "tduarte@basilioadvogados.com.br";
                String pass = "mailPASS";
                String title = "Alocação de Advogado - iRobot Mail";
                String msg = "<font face=\"calibri\" color=\"#2471a3\" size=\"3\">Prezadas,<br/><br/>Chegou um novo "+ beans.getCargo() +" chamado <b>" + beans.getNome() + " " + beans.getSobreNome() + "</b><br/>Usuário:"+ beans.getEquipe() +"<br/>Equipe:"+ beans.getEquipe() +"<br/>Estado:"+ beans.getEstado() +".<br/><br/><br/>Poderiam aloca-lo no sistema <i>iRobot</i>?<br/><br/><br/></font><font face=\"arial\" color=\"0\" size=\"1\">Esse e-mail foi enviado automaticamente através do programa <b>iRobot</b> por favor não responda.";
                String reciver = "jfonseca@basilioadvogados.com.br";
                irf.SendMail(sender, pass, title, msg, reciver);
            }
       }
          
      }  
    };t1.start();
}

}
