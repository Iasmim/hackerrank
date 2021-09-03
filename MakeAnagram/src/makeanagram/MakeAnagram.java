/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makeanagram;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static int makeAnagram(String a, String b) {
        
        int min_detetions = 0;
        int[] a_frequencies = new int[26];
        int[] b_frequencies = new int[26];
        
        for (int i = 0; i < a.length(); i++) {
            char current_char = a.charAt(i);
            int char_to_int = (int)current_char;
            int position = char_to_int - (int)'a';
            a_frequencies[position]++;
        }
        
         for (int i = 0; i < b.length(); i++) {
            char current_char = b.charAt(i);
            int char_to_int = (int)current_char;
            int position = char_to_int - (int)'a';
            b_frequencies[position]++;
        }
         
         for (int i = 0; i < 26; i++) {
            int difference = Math.abs(a_frequencies[i] - b_frequencies[i]);
            min_detetions+= difference;
        }
         
         return min_detetions;
        
     }
}
public class MakeAnagram {
 public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.out"));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = Result.makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
