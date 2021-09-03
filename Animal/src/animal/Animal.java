package animal;

public class Animal {
private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Dog dog = new Dog("Miguel");
        Cat cat = new Cat("Lala");
        
        System.out.println(cat.getNome());
    }
    
}
