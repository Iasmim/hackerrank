/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commonchild;
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

    public static int commonChild(String s1, String s2) {
    // Write your code here
      int j = 0;
      int repVal = 0;
      for(int i = 0; i < s1.length(); i++)
      {
          int count = s2.length()-1;
          while(count > 0)
          {
             if(s1.charAt(i) == s2.charAt(j))
             {
               j = i+1;
               repVal++;
               count-=i;
             }
             
             count--;
          }
          
      }      
        return repVal;
    }

}
//ABCDEF
//FBDAMN

public class CommonChild {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = bufferedReader.readLine();

        String s2 = bufferedReader.readLine();

        int result = Result.commonChild(s1, s2);
        
        System.out.println(result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedReader.close();
        //bufferedWriter.close();
    }
}

