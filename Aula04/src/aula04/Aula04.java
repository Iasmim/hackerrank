/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

public class Aula04 {

    public static void main(String[] args) {
      Caneta c1 = new Caneta("BIC",0.5f, "Azul");
        System.out.println("TENHO UMA CANETA: "+ c1.getModelo());
        System.out.println("de ponta:"+ c1.getPonta());
    }
    
}
