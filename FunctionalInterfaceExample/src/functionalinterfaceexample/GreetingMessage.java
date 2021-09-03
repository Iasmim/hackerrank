/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalinterfaceexample;

/**
 *
 * @author iasmimc
 */
@FunctionalInterface
public interface GreetingMessage {
    //only one method in it
    public abstract void greet(String name);
   // public abstract void test;
    
}
