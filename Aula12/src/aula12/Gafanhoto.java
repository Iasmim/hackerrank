package aula12;
public class Gafanhoto extends Pessoa{
    private String login;
    private int totassistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totassistido =0;
    }

    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotassistido() {
        return totassistido;
    }

    public void setTotassistido(int totassistido) {
        this.totassistido = totassistido;
    }
    
    public void viumaisum()
    {
      this.totassistido++;
    }

    @Override
    public String toString() {
        return "Gafanhoto{"+ super.toString() + "\nlogin= "+ login + "totassistido= " + totassistido +"}"; //To change body of generated methods, choose Tools | Templates.
    }
     
    
}
