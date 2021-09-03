/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sherlockvalidstring;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static String isValid(String s) {
        // Write your code here
        int[] string_frequencies = new int[26];
        ArrayList<Integer> sort_arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            int current_to_int = (int) current;
            int position = current_to_int - (int) 'a';
            string_frequencies[position]++;
             
        }

        for (int i = 0; i < 26; i++) {
            if(string_frequencies[i] != 0)
               sort_arr.add(string_frequencies[i]);
                
        }
        Collections.sort(sort_arr);
        
        if(s.length() == 1) return "YES";
        
       int first = sort_arr.get(0);
       int second = sort_arr.get(1);
       int secondLast = sort_arr.get(sort_arr.size() - 2);
       int last = sort_arr.get(sort_arr.size() - 1);
        System.out.println("latest" + last);
      
       if(first == last) return "YES";
       if(first == 1 && second == last) return "YES";
       if(first == second && second == secondLast && secondLast == (last -1)) return "YES";
       
       return "NO";
    }

}

public class SherlockValidString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.out"));

        String s = bufferedReader.readLine();

        String result = Result.isValid(s);

        System.out.println(result);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
