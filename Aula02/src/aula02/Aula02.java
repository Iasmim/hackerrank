/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

public class Aula02 {
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.modelo = "Castelo";
        c1.ponta = 0.5f;
        c1.status();
        
        c1.tampar();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.cor = "Vermelha";
        c2.modelo = "Bic";
        c2.destampar();
        c2.rabiscar();
        c2.status();
    }
    
}
