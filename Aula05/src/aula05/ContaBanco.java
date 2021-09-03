/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

public class ContaBanco {
     public int numConta;
     protected String tipo;
     private String dono;
     private float saldo;
     private boolean status;

     public void estadoAtual(){
         System.out.println("----------------------------");
         System.out.println("Conta: "+ this.getNumConta());
         System.out.println("Tipo: "+ this.getTipo());
         System.out.println("Dono: "+ this.getDono());
         System.out.println("Saldo: "+ this.getSaldo());
         System.out.println("Status: "+ this.isStatus());
     }     
     
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public void abrirConta(String tipo){
        
        this.setTipo(tipo);
        this.setStatus(true);
        
        if(tipo == "CC")
        {
            this.setSaldo(50);
        }else if(tipo == "CP")
        { 
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
     
    public void fecharConta(){
          if(this.getSaldo() > 0)
          {
              System.out.println("Conta não pode ser fechada: Conta com dinheiro");
          }else if(this.getSaldo() < 0){
              System.out.println("Conta não pode ser fechada: Conta em debito!");
          }else{
              this.setStatus(false);
              System.out.println("Conta fechado com sucesso!");
          }
    }
    
    public void depositar(float v){
      if(this.isStatus()){
          this.setSaldo(this.getSaldo() + v);
          System.out.println("Deposito relatizado na conta de "+ this.getDono());
      }else
      {
          System.out.println("Impossivel depositar em um conta fechada!");
      }
    }
    
    public void sacar(float v){
      if(this.isStatus()){
        if(this.getSaldo() >= v){
         this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque realizado na conta de "+ this.getDono());
        }else{
            System.out.println("Saldo insuficiente para sacar!");
        }
      }else 
      {
          System.out.println("Impossível sacar em uma conta fechada!");
      }
    }
    
    public void pagarMensal(){
        int v = 0;
        if(this.getTipo().equals("CC")){
            v = 12;
        }else if (this.getTipo().equals("CP"))
        {
            v = 20;
        }
        
        if(this.isStatus()){
         if(this.getSaldo() > v){
           this.setSaldo(this.getSaldo() - v);
           System.out.println("Pagamento realizado na conta de "+ this.getDono());
         }else
                System.out.println("Saldo insuficiente para pagar!");
        }else 
      {
          System.out.println("Impossível sacar em uma conta fechada!");
      }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
