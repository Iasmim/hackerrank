/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

import java.util.Random;

/**
 *
 * @author iasmimc
 */
public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    
    
    public void marcarLuta(Lutador l1, Lutador l2){
    
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2)
        {
          this.setAprovado(true);
          this.setDesafiado(l1);
          this.setDesafiante(l2);
        }else {
          this.setAprovado(false);
          this.setDesafiado(null);
          this.setDesafiante(null);
        }
    }
    
    public void lutar(){
      if(this.isAprovado())
      {
          System.out.println("###DESAFIADO###");
          this.desafiado.apresentar();
          System.out.println("##DESAFIANTE##");      
          this.desafiante.apresentar();
          
          Random aleatorio = new Random();
          int vencedor = aleatorio.nextInt(3);
          
          System.out.println("========RESULTADO DA LUTA=========");
          switch(vencedor){
              case 0://Empate
                  System.out.println("Empatou");
                  this.desafiado.empatarLuta();
                  this.desafiante.empatarLuta();
                  break;
              case 1://Desafiado
                  System.out.println("Vitória do "+ this.desafiado.getNome());
                  this.desafiado.ganharLuta();
                  this.desafiante.perderLuta();
                  break;
              case 2://Desafiante
                  System.out.println("Vitória do "+ this.desafiante.getNome());
                  this.desafiado.perderLuta();
                  this.desafiante.ganharLuta();
                  break;
                 
          }
          System.out.println("=================");
          
      }else
      {
          System.out.println("A luta não pode acontecer!");
      }
    
    
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
}
