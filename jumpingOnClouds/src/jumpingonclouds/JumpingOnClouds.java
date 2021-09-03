/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumpingonclouds;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import javax.swing.ScrollPaneLayout;

class Result {
    public static int jumpingOnClouds(List<Integer> c) {
 // Write your code here
        int Len = c.size();
        int count = -1;//won´t count last element
        for (int i = 0; i < Len;i++, count++) {
            if(i + 2 < Len && c.get(i+2) == 0 )
            {
                i++;
            }
        } 
        
        return count;
    }

}
public class JumpingOnClouds {

    public static void main(String[] args)  throws IOException {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("foo.out"));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] cTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> c = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cTemp[i]);
            c.add(cItem);
        }

        int result = Result.jumpingOnClouds(c);
        System.out.println(result);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
    

