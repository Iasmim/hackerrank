/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alternatingcharacters;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/**
 *
 * @author iasmimc
 */

class Result {

    /*
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternatingCharacters(String s) {
    // Write your code here
        int size = s.length();
         char last_char = '\0';
         int count = 0;
         for (int i = 0; i < size; i++) {
            char current_char = s.charAt(i);
            if(current_char == last_char){
                count++;
            }
            last_char = current_char;
        }
         
         return count;
    }

}


public class AlternatingCharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
