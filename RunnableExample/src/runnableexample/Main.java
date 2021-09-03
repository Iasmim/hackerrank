/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnableexample;

import java.util.concurrent.ForkJoinWorkerThread;

/**
 *
 * @author iasmimc
 */
public class Main {
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Thread thread1 = new Thread(new RunnableExample());
        thread1.start();
        
        
        Thread thread2 = new Thread(() -> {
                    int i =0;
                    while(i <= 100){
                        System.out.println(i + " "+ Thread.currentThread().getName());
                        i++;

                    }
        });
        
        thread2.start();
        
    }
    
}
