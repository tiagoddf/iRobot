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
  String admUsr = "BASILIO\\analista03";
  String admPass = "analistapss";
  // as senhas do email estão lá embaixo SELIGA
  
  
  public void TreinarVega(beansCadastrarFicha beans)
  {
        t1 = new Thread(){   // thread 1
        @Override
        public void run() {
        while(beans.getBotStatus() == true) {
            iRobot_Functions irf = new iRobot_Functions();
            if(beans.getBotStatus()== true) {
                System.out.println(beans.getNome());
                System.out.println(beans.getSobreNome());
                System.out.println(beans.getUsuario());
                System.out.println(beans.getSenha());
                /* Logando RDP */
                irf.MouseClick("left", 105, 584); // desktop LXDE func
                irf.Wait(1000);
                irf.MouseClick("left", 60, 249); // 3 icone LXTerminal
                irf.Wait(1000);
                irf.Press(KeyEvent.VK_ENTER); // enter pra abrir LXTERMINAL selecionado
                irf.Wait(3000);
                irf.Send("rdesktop " + servidor);
                irf.Wait(3000);
                irf.Press(KeyEvent.VK_ENTER);
                irf.Wait(1000);
                irf.MouseClick("left", 536, 210); // outro usuario
                irf.Wait(1000);
                // apagar 16 caracteres do usuário que vem em padrão
                for(int i = 0; i < 16; i++) { irf.Press(KeyEvent.VK_BACK_SPACE); }
                irf.Wait(1000);
                irf.Send(admUsr);
                irf.Wait(1000);
                irf.Press(KeyEvent.VK_TAB);
                irf.Wait(1000);
                irf.Send(admPass);
                irf.Wait(1000);
                irf.Press(KeyEvent.VK_ENTER);
                irf.Wait(1000);
                /* Cadastra no AD */
                irf.MouseClick("left", 30, 161); // gerenciador de usuário
                irf.Wait(1000);
                // não se esquecer de ao fechar o gerenciador de usuário deixar com a aba escritorio aberta e todos minimizados
                if("RJ".equals(beans.getEstado())) {
                    irf.MouseClick("left", 119, 309); // abrir aba RJ
                    irf.Wait(1000);
                    if("advogado".equals(beans.getCargo())) {
                        irf.MouseClick("left", 187, 325); // OU advogados
                    }
                    else if("estagiario".equals(beans.getCargo())) {
                        irf.MouseClick("left", 194, 362); // OU estagiarios
                    }
                    else if("funcionario".equals(beans.getCargo())) {
                        irf.MouseClick("left", 193, 380); // OU funcionario
                    }
                    irf.Wait(1000);
                    irf.MouseClick("left", 347, 79); // criar um novo usuário no container atual
                    irf.Wait(1000);
                    irf.Send(beans.getNome());
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Wait(1000);
                    irf.Send(beans.getSobreNome());
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Wait(1000);
                    irf.Send(beans.getUsuario());
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_ENTER);
                    irf.Wait(1000);
                    irf.Send(beans.getSenha());
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Wait(1000);
                    irf.Send(beans.getSenha());
                    irf.Wait(1000);
                    irf.MouseClick("left", 106, 211); // desmarcar "O usuário deve..."
                    irf.Wait(1000);
                    irf.MouseClick("left", 107, 263); // marcar "A senha nunca expira"
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_ENTER); // pra avançar
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_ENTER); // pra concluir
                    irf.Wait(1000);
                    irf.MouseClick("left", 119, 309); // fechar aba RJ
                    irf.Wait(1000);
                }
                else if("SP".equals(beans.getEstado())) {
                    irf.MouseClick("left", 118, 326); // abrir aba SP
                    irf.Wait(1000);
                    if("advogado".equals(beans.getCargo())) {
                        irf.MouseClick("left", 198, 362); // OU advogados
                    }
                    else if("estagiario".equals(beans.getCargo())) {
                        irf.MouseClick("left", 197, 398); // OU estagiarios
                    }
                    else if("funcionario".equals(beans.getCargo())) {
                        irf.MouseClick("left", 188, 416); // OU funcionario
                    }
                    irf.Wait(1000);
                    irf.MouseClick("left", 347, 79); // criar um novo usuário no container atual
                    irf.Wait(1000);
                    irf.Send(beans.getNome());
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Wait(1000);
                    irf.Send(beans.getSobreNome());
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Wait(1000);
                    irf.Send(beans.getUsuario());
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_ENTER);
                    irf.Wait(1000);
                    irf.Send(beans.getSenha());
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Wait(1000);
                    irf.Send(beans.getSenha());
                    irf.Wait(1000);
                    irf.MouseClick("left", 106, 211); // desmarcar "O usuário deve..."
                    irf.Wait(1000);
                    irf.MouseClick("left", 107, 263); // marcar "A senha nunca expira"
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_ENTER); // pra avançar
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_ENTER); // pra concluir
                    irf.Wait(1000);
                    irf.MouseClick("left", 118, 326); // fechar aba SP
                }
                else if("DF".equals(beans.getEstado())) {
                    irf.MouseClick("left", 119, 291); // abrir aba BSB
                    irf.Wait(1000);
                    if("advogado".equals(beans.getCargo())) {
                        irf.MouseClick("left", 196, 325); // OU advogados
                    }
                    else if("estagiario".equals(beans.getCargo())) {
                        irf.MouseClick("left", 196, 361); // OU estagiarios
                    }
                    else if("funcionario".equals(beans.getCargo())) {
                        irf.MouseClick("left", 201, 378); // OU funcionario
                    }
                    irf.Wait(1000);
                    irf.MouseClick("left", 347, 79); // criar um novo usuário no container atual
                    irf.Wait(1000);
                    irf.Send(beans.getNome());
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Wait(1000);
                    irf.Send(beans.getSobreNome());
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Wait(1000);
                    irf.Send(beans.getUsuario());
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_ENTER);
                    irf.Wait(1000);
                    irf.Send(beans.getSenha());
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_TAB);
                    irf.Wait(1000);
                    irf.Send(beans.getSenha());
                    irf.Wait(1000);
                    irf.MouseClick("left", 106, 211); // desmarcar "O usuário deve..."
                    irf.Wait(1000);
                    irf.MouseClick("left", 107, 263); // marcar "A senha nunca expira"
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_ENTER); // pra avançar
                    irf.Wait(1000);
                    irf.Press(KeyEvent.VK_ENTER); // pra concluir
                    irf.Wait(1000);
                    irf.MouseClick("left", 119, 291); // fechar aba BSB
                }
                irf.Wait(1000);
                // fechar gerenciador de usuários
                irf.MouseClick("left", 773, 28); // X
                irf.Wait(1000);
            }
            /* 
                Cria Diretorio - permissões
            */
            if("advogado".equals(beans.getCargo()) || "estagiario".equals(beans.getCargo())) {
                if(beans.getBotStatus() == true) {
                    irf.MouseClick("left", 29, 132); // pastinha
                    irf.Wait(1000);
                    if("RJ".equals(beans.getEstado())) {
                        irf.MouseClick("left", 328, 365); // unidade mapeada RJ
                        irf.Wait(1000);
                        irf.Press(KeyEvent.VK_ENTER);
                        irf.Wait(1000);
                        // pasta de adv ou est
                        if("advogado".equals(beans.getCargo())) {
                            irf.MouseClick("left", 295, 258);
                        }
                        else if("estagiario".equals(beans.getCargo())) {
                            irf.MouseClick("left", 288, 426);
                        }
                        irf.Wait(1000);
                        irf.Press(KeyEvent.VK_ENTER);
                        irf.Wait(1000);
                        irf.MouseClick("left", 484, 93); // nova pasta
                        irf.Wait(1000);
                        irf.Send(beans.getNome() + " " + beans.getSobreNome());
                        irf.Wait(1000);
                        irf.Press(KeyEvent.VK_ENTER);
                        // criou a pasta, agr seta as permissões
                        irf.Wait(1000);
                        irf.MouseClick("left", 581, 87); // propriedades
                        irf.Wait(1000);
                        irf.MouseClick("left", 504, 139); // propriedades - segurança
                        irf.Wait(1000);
                        irf.MouseClick("left", 726, 453); // avançadas
                        /* Permitir */
                        irf.Wait(1000);
                        irf.MouseClick("left", 726, 453); // adicionar
                        irf.Wait(1000);
                        irf.MouseClick("left", 347, 88); // selecionar entidade de segurança
                        irf.Wait(1000);
                        if("ATB".equals(beans.getEquipe())) { irf.Send("equipeatb"); }
                        else if("JAB".equals(beans.getEquipe())) { irf.Send("equipejab"); }
                        else if("JRS".equals(beans.getEquipe())) { irf.Send("equipejrs"); }
                        else if("MRF".equals(beans.getEquipe())) { irf.Send("equipemrf"); }
                        else if("MHN".equals(beans.getEquipe())) { irf.Send("equipemhn"); }
                        else if("BSB".equals(beans.getEquipe())) { irf.Send("equipebsb"); }
                        else if("SP".equals(beans.getEquipe())) { irf.Send("equipesp"); }
                        irf.Wait(1000);
                        irf.Press(KeyEvent.VK_ENTER);
                        irf.Wait(1000);
                        irf.MouseClick("left", 751, 213); // mostrar permissões avançadas
                        irf.Wait(1000);
                        irf.MouseClick("left", 164, 233); // controle total
                        irf.Wait(1000);
                        irf.MouseClick("left", 485, 340); // remover- Alterar permissões
                        irf.Wait(1000);
                        irf.MouseClick("left", 486, 362); // remover- Apropriar-se
                        irf.Wait(1000);
                        irf.MouseClick("left", 613, 141); // clicar num campo limpo pra dar enter (pq não da pra ver a tela toda)
                        irf.Wait(1000);
                        irf.Press(KeyEvent.VK_ENTER);
                        /* Negar */
                        irf.Wait(1000);
                        irf.MouseClick("left", 726, 453); // adicionar
                        irf.Wait(1000);
                        irf.MouseClick("left", 347, 88); // selecionar entidade de segurança
                        irf.Wait(1000);
                        if("ATB".equals(beans.getEquipe())) { irf.Send("equipeatb"); }
                        else if("JAB".equals(beans.getEquipe())) { irf.Send("equipejab"); }
                        else if("JRS".equals(beans.getEquipe())) { irf.Send("equipejrs"); }
                        else if("MRF".equals(beans.getEquipe())) { irf.Send("equipemrf"); }
                        else if("MHN".equals(beans.getEquipe())) { irf.Send("equipemhn"); }
                        else if("BSB".equals(beans.getEquipe())) { irf.Send("equipebsb"); }
                        else if("SP".equals(beans.getEquipe())) { irf.Send("equipesp"); }
                        irf.Wait(1000);
                        irf.Press(KeyEvent.VK_ENTER);
                        irf.Wait(1000);
                        irf.MouseClick("left", 304, 117); // selecionar tipo
                        irf.Wait(1000);
                        irf.MouseClick("left", 240, 137); // negar
                        irf.Wait(1000);
                        irf.MouseClick("left", 273, 152); // selecionar aplicavel a
                        irf.Wait(1000);
                        irf.MouseClick("left", 270, 173); // esta pasta somente
                        irf.Wait(1000);
                        irf.MouseClick("left", 165, 277); // remover- ler & executar
                        irf.Wait(1000);
                        irf.MouseClick("left", 165, 318); // remover- leitura
                        irf.Wait(1000);
                        irf.MouseClick("left", 751, 213); // mostrar permissões avançadas
                        irf.Wait(1000);
                        irf.MouseClick("left", 476, 298); // excluir
                        irf.Wait(1000);
                        irf.MouseClick("left", 613, 141); // clicar num campo limpo pra dar enter (pq não da pra ver a tela toda)
                        irf.Wait(1000);
                        irf.Press(KeyEvent.VK_ENTER);
                    }
                }
            }
            if(beans.getBotStatus()== true) {
                /* Cadastra no Exchange */
                irf.Wait(1000);
                irf.MouseClick("left", 45, 106); // fav WebMail
                irf.Wait(1000);
                irf.MouseClick("left", 194, 359); // button admin
                irf.Wait(1000);
                irf.MouseClick("left", 226, 370); // button adicionar um usuario
                irf.Wait(1000);
                irf.MouseClick("left", 33, 315); // nome_textfield
                irf.Wait(1000);
                irf.Send(beans.getNome());
                irf.Wait(1000);
                irf.MouseClick("left", 234, 314); // sobrenome_textfield
                irf.Wait(1000);
                irf.Send(beans.getSobreNome());
                irf.Wait(1000);
                irf.MouseClick("left", 21, 379); // nome exibição_textfield
                irf.Wait(1000);
                irf.Send(beans.getNome() + " " + beans.getSobreNome());
                irf.Wait(1000);
                irf.MouseClick("left", 17, 441); // email de usuário_textfield
                irf.Wait(1000);
                irf.Send(beans.getUsuario());
                irf.Wait(1000);
                irf.MouseClick("left", 793, 556); // descer tela
                irf.Wait(1000);
                irf.MouseClick("left", 28, 354); // senha_button
                irf.Wait(1000);
                irf.MouseClick("left", 79, 451); // permita-me criar a senha
                irf.Wait(1000);
                irf.MouseClick("left", 86, 486); // senha_textfield
                irf.Wait(1000);
                irf.Send(beans.getSenha());
                irf.Wait(1000);
                irf.MouseClick("left", 792, 559); // descer tela
                irf.Wait(1000);
                irf.MouseClick("left", 86, 460); // licenças_button
                irf.Wait(1000);
                irf.MouseClick("left", 391, 523); // exchange online select
                irf.Wait(1000);
                irf.MouseClick("left", 794, 561); // descer tela
                irf.Wait(1000);
                irf.MouseClick("left", 26, 555); // adicionar_button
                /* Adiciona ao Grupo do EXCHANGE */
            }
            if(beans.getBotStatus()== true) {
                /* Cadastra no OTRS */
                irf.Wait(1000);
                irf.MouseClick("left", 112, 101); // fav OTRS
                irf.Wait(1000);
                irf.MouseClick("left", 414, 400); // tfigueiredo
                irf.Wait(1000);
                irf.MouseClick("left", 396, 504); // login button
                irf.Wait(1000);
                irf.MouseClick("left", 406, 189); // clientes
                irf.Wait(1000);
                irf.MouseClick("left", 99, 359); // adicionar cliente
                irf.Wait(1000);
                irf.MouseClick("left", 461, 330); // nome_textfield
                irf.Wait(1000);
                irf.Send(beans.getNome());
                irf.Wait(1000);
                irf.MouseClick("left", 460, 361); // sobrenome_textfield
                irf.Wait(1000);
                irf.Send(beans.getSobreNome());
                irf.Wait(1000);
                irf.MouseClick("left", 456, 391); // login_textfield
                irf.Wait(1000);
                irf.Send(beans.getUsuario());
                irf.Wait(1000);
                irf.MouseClick("left", 456, 452); // email_textfield
                irf.Wait(1000);
                irf.Send(beans.getUsuario() + "@basilioadvogados.com.br");
                irf.Wait(1000);
                irf.MouseClick("left", 455, 482); // idcliente_textfield
                irf.Wait(1000);
                irf.Send(beans.getUsuario() + "@basilioadvogados.com.br");
                irf.Wait(1000);
                irf.MouseClick("left", 792, 485); // descer tela
                irf.Wait(1000);
                irf.MouseClick("left", 491, 477); // enviar button
            }
            if(beans.getBotStatus()== true) {
                /* Cadastra nas Impressoras (scanner) */
                // imp 1
                irf.Wait(1000);
                irf.MouseClick("left", 173, 103); // fav IMP1
                
                irf.Wait(1000);
                irf.MouseClick("left", 435, 273); // login_textfield
                irf.Wait(1000);
                irf.MouseClick("left", 476, 398); // 7654321
                irf.Wait(1000);
                irf.MouseClick("left", 690, 438); // login_button
                irf.Wait(1000);
                irf.MouseClick("left", 572, 569); // address book
                irf.Wait(1000);
                irf.MouseClick("left", 385, 303); // adrress list 01
                irf.Wait(1000);
                irf.MouseClick("left", 385, 317); // register new destination...
                irf.Wait(1000);
                irf.MouseClick("left", 395, 473); // name_textfield
                irf.Wait(1000);
                irf.Send(beans.getNome() + " " + beans.getSobreNome());
                irf.Wait(1000);
                irf.MouseClick("left", 392, 524); // emailadress_textfield
                irf.Wait(1000);
                irf.Send(beans.getUsuario() + "@basilioadvogados.com.br");
                irf.Wait(1000);
                irf.MouseClick("left", 666, 316); // ok_button
                // imp 2
                irf.Wait(1000);
                irf.MouseClick("left", 236, 104); // fav IMP2
                
                irf.Wait(1000);
                irf.MouseClick("left", 435, 273); // login_textfield
                irf.Wait(1000);
                irf.MouseClick("left", 476, 398); // 7654321
                irf.Wait(1000);
                irf.MouseClick("left", 690, 438); // login_button
                irf.Wait(1000);
                irf.MouseClick("left", 572, 569); // address book
                irf.Wait(1000);
                irf.MouseClick("left", 385, 303); // adrress list 01
                irf.Wait(1000);
                irf.MouseClick("left", 385, 317); // register new destination...
                irf.Wait(1000);
                irf.MouseClick("left", 395, 473); // name_textfield
                irf.Wait(1000);
                irf.Send(beans.getNome() + " " + beans.getSobreNome());
                irf.Wait(1000);
                irf.MouseClick("left", 392, 524); // emailadress_textfield
                irf.Wait(1000);
                irf.Send(beans.getUsuario() + "@basilioadvogados.com.br");
                irf.Wait(1000);
                irf.MouseClick("left", 666, 316); // ok_button
                // imp 3
                irf.Wait(1000);
                irf.MouseClick("left", 293, 103); // fav IMP3
                
                irf.Wait(1000);
                irf.MouseClick("left", 435, 273); // login_textfield
                irf.Wait(1000);
                irf.MouseClick("left", 476, 398); // 7654321
                irf.Wait(1000);
                irf.MouseClick("left", 690, 438); // login_button
                irf.Wait(1000);
                irf.MouseClick("left", 572, 569); // address book
                irf.Wait(1000);
                irf.MouseClick("left", 385, 303); // adrress list 01
                irf.Wait(1000);
                irf.MouseClick("left", 385, 317); // register new destination...
                irf.Wait(1000);
                irf.MouseClick("left", 395, 473); // name_textfield
                irf.Wait(1000);
                irf.Send(beans.getNome() + " " + beans.getSobreNome());
                irf.Wait(1000);
                irf.MouseClick("left", 392, 524); // emailadress_textfield
                irf.Wait(1000);
                irf.Send(beans.getUsuario() + "@basilioadvogados.com.br");
                irf.Wait(1000);
                irf.MouseClick("left", 666, 316); // ok_button
                // imp 4
                irf.Wait(1000);
                irf.MouseClick("left", 349, 106); // fav IMP4
                
                irf.Wait(1000);
                irf.MouseClick("left", 435, 273); // login_textfield
                irf.Wait(1000);
                irf.MouseClick("left", 476, 398); // 7654321
                irf.Wait(1000);
                irf.MouseClick("left", 690, 438); // login_button
                irf.Wait(1000);
                irf.MouseClick("left", 572, 569); // address book
                irf.Wait(1000);
                irf.MouseClick("left", 385, 303); // adrress list 01
                irf.Wait(1000);
                irf.MouseClick("left", 385, 317); // register new destination...
                irf.Wait(1000);
                irf.MouseClick("left", 395, 473); // name_textfield
                irf.Wait(1000);
                irf.Send(beans.getNome() + " " + beans.getSobreNome());
                irf.Wait(1000);
                irf.MouseClick("left", 392, 524); // emailadress_textfield
                irf.Wait(1000);
                irf.Send(beans.getUsuario() + "@basilioadvogados.com.br");
                irf.Wait(1000);
                irf.MouseClick("left", 666, 316); // ok_button
                // imp 5
                irf.Wait(1000);
                irf.MouseClick("left", 407, 106); // fav IMP5
                
                irf.Wait(1000);
                irf.MouseClick("left", 435, 273); // login_textfield
                irf.Wait(1000);
                irf.MouseClick("left", 476, 398); // 7654321
                irf.Wait(1000);
                irf.MouseClick("left", 690, 438); // login_button
                irf.Wait(1000);
                irf.MouseClick("left", 572, 569); // address book
                irf.Wait(1000);
                irf.MouseClick("left", 385, 303); // adrress list 01
                irf.Wait(1000);
                irf.MouseClick("left", 385, 317); // register new destination...
                irf.Wait(1000);
                irf.MouseClick("left", 395, 473); // name_textfield
                irf.Wait(1000);
                irf.Send(beans.getNome() + " " + beans.getSobreNome());
                irf.Wait(1000);
                irf.MouseClick("left", 392, 524); // emailadress_textfield
                irf.Wait(1000);
                irf.Send(beans.getUsuario() + "@basilioadvogados.com.br");
                irf.Wait(1000);
                irf.MouseClick("left", 666, 316); // ok_button
            }
            if(beans.getBotStatus()== true) {
                String sender = "tduarte@basilioadvogados.com.br";
                String pass = "emailpss";
                String title = "Alocação de Advogado - iRobot Mail";
                String msg = "<font face=\"calibri\" color=\"#2471a3\" size=\"3\">Prezadas,<br/><br/>Chegou um novo "+ beans.getCargo() +" chamado <b>" + beans.getNome() + " " + beans.getSobreNome() + "</b><br/>Usuário:"+ beans.getEquipe() +"<br/>Equipe:"+ beans.getEquipe() +"<br/>Estado:"+ beans.getEstado() +".<br/><br/><br/>Poderiam aloca-lo no sistema <i>iRobot</i>?<br/><br/><br/></font><font face=\"arial\" color=\"0\" size=\"1\">Esse e-mail foi enviado automaticamente através do programa <b>iRobot</b> por favor não responda.";
                String reciver = "ebrandao@basilioadvogados.com.br;jfonseca@basilioadvogados.com.br";
                irf.Wait(1000);
                irf.SendMail(sender, pass, title, msg, reciver);
            }
            beans.setBotStatus(false);
       }
          
      }  
    };t1.start();
}

}
