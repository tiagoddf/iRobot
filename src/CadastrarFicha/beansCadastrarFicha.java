package CadastrarFicha;

import java.time.Year;
import java.util.Calendar;

public class beansCadastrarFicha {
    private boolean rodandobot;
    
    private String nome;
    private String sobrenome;
    private String cargo;
    private String estado;
    private String equipe;
    private String usuario;
    private String senha;
    
    // transformar a primeira letra em maiuscula e o resto em minusculo
    private static String capitalize(final String line) {
      return Character.toUpperCase(line.charAt(0)) + line.substring(1).toLowerCase();
    }
    
    public boolean getBotStatus() {
        return rodandobot;
    }
    public void setBotStatus(boolean rodandobot) {
        this.rodandobot = rodandobot;
    }
    
    public String getEstado() {
        return estado;
    }
    public void setEstado(String str) {
        this.estado = str;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String str) {
        this.cargo = str;
    }
    public String getEquipe() {
        return equipe;
    }
    public void setEquipe(String str) {
        this.equipe = str;
    }
    
    public String getNome() {
        return capitalize(nome);
        /* OUUUUUUUUUU \/ tbm ta funcionando
        // pegar a primeira letra e colocar maiuscula
        String pm = nome.toUpperCase();
        char primeiraletra = pm.charAt(0);
        // pegar todo o resto e colocar minuscula
        //String resto = usuario.substring(1).toLowerCase();
        String resto = nome.substring(1);
        // retornar a nova string "Nome"
        String nova = primeiraletra + resto;
        return nova;
        */
    }
    public void setNome(String str) {
        this.nome = str;
    }
    public String getSobreNome() {
        return capitalize(sobrenome);
    }
    public void setSobreNome(String str) {
        this.sobrenome = str;
    }
        
    // usuário e senha
    // usuário = primeira letra nome + sobrenome [TUDO MINUSCULO]
    // senha = primeira letra do nome (mantem maiusculo) + dia + ultimas 2 sobrenome + *
    public String getUsuario() {
        String nome1 = this.getNome();
        char primeiraletra = nome1.charAt(0);
        usuario = primeiraletra + this.getSobreNome();
        String toLowerCase = usuario.toLowerCase();
        return toLowerCase;
}
    public String getSenha() { 
        // primeira letra
        String nome1 = this.getNome();
        String lastOne = Character.toString(nome1.charAt(0));
        // ano
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        String yearInString = String.valueOf(year);
        // ultimas 2 letras
        String nome2 = this.getSobreNome(); 
        String lastTwo = nome2.substring(nome2.length() - 2);
        // 
        senha = lastOne + yearInString + lastTwo + "!";
        return senha;
    }
}
