/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferedreadexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author iasmimc
 */
public class BufferedReadExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File myFile = new File("example.txt");
        try{
        BufferedReader reader = new BufferedReader(new FileReader(myFile));
        String line;
        while((line = reader.readLine()) != null){
            System.out.println(line);
        }
        } catch(IOException e){
          
        }
        
        
    }
    
}
