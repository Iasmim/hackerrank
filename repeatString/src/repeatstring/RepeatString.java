/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeatstring;
import java.util.*;
import java.io.*;
import java.math.*;
/**
 *
 * @author iasmimc
 */
public class RepeatString {



    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int adigit = in.nextInt();
        int acount = in.nextInt();
        int bdigit = in.nextInt();
        int bcount = in.nextInt();
        int repeats = in.nextInt();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        String sequence = "";

        for(int i = 0; i < repeats;i++)
        {

           if(adigit > 9)
             adigit = 0;

           if(bdigit > 9)
              bdigit = 0;

            sequence += String.valueOf(adigit).repeat(acount);
            sequence += String.valueOf(bdigit).repeat(bcount);
              
            
            adigit++;
            bdigit++;
        }
        System.out.println(sequence);
    }
}
    

