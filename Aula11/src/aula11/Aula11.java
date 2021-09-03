package aula11;
public class Aula11 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mamifero m = new Mamifero();
        Reptil f = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        m.setCorPelo("Marrom");
        m.setPeso(35.3f);
        m.alimentar();
        m.locomover();
        m.emitirsom();
        m.status();
        
        a.locomover();
        p.locomover();
        f.locomover();
        
        
        Cachorro c = new Cachorro();
        Canguru ca = new Canguru();
        
        c.emitirsom();
        ca.emitirsom();
        
        
        c.reagir("Olá");
        c.reagir(11,45);
        c.reagir(19,00);
        c.reagir(false);
        c.reagir(true);
        c.reagir(2,12.5f);
        
    }
    
}
