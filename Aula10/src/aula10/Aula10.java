package aula10;
public class Aula10 {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setIdade(25);
        a1.setSexo("M");
        a1.pagarMensalidade();
        Visitante v1 = new Visitante();
        Bolsista b1 = new Bolsista();
        b1.setNome("Lucas");
        b1.pagarMensalidade();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();         
    }
    
}
