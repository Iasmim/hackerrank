/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;
public class Aula07 {

    public static void main(String[] args) {
        // TODO code application logic here
        Lutador l[] = new Lutador[6];     
        l[0] =  new Lutador("Pretty Boy", "França", 30, 1.80f, 80.9f, 1, 2,1);
        l[1] =  new Lutador("Snapshot", "Poland", 20, 1.65f, 70.9f, 3, 2,1);
        l[2] =  new Lutador("winderson", "Portugal", 28, 1.85f, 100.9f, 11, 0,1);
        l[3] =  new Lutador("Betty", "Brasil", 32, 1.80f, 90.9f, 5, 2,1);
        l[4] =  new Lutador("Kaka", "EUA", 34, 1.70f, 78.9f, 11, 2,5);
        l[5] =  new Lutador("Welligton", "França",40, 1.65f, 60.9f, 11, 2,4);
        
        
        Luta uec01 = new Luta();
        uec01.marcarLuta(l[0], l[2]);
        uec01.lutar();
    }
    
}
