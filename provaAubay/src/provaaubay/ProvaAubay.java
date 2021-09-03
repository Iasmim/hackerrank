/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaaubay;

class Animal {

    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

class Cat extends Animal {

}

class Dog extends Animal {

}

public class ProvaAubay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.setNome("lala");

        System.out.println(cat.getNome());

    }

}
