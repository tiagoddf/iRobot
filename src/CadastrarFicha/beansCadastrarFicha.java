/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadastrarFicha;

/**
 *
 * @author tduarte
 */
public class beansCadastrarFicha {
    private boolean rodandobot;
    
    private String usuario;
    private String nome;
    private String sobrenome;
    private String cargo;
    private String estado;
    private String equipe;
    
    public boolean getBotStatus() {
        return rodandobot;
    }
    public void setBotStatus(boolean rodandobot) {
        this.rodandobot = rodandobot;
    }
}
