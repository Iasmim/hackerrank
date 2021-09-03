package minimumbribes;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
    int swapCount = 0;
        for (int i = q.size()-1; i >=0 ; i--) {
            if(q.get(i) != i+1){
              if(((i-1) >= 0) && q.get(i-1) == (i+1))
              {
                  swapCount++;
                  swap(q,i, i-1);
                  System.out.println(q);
              }else if(((i-2)>=0) && q.get(i-2) == i+1)
              {
                  swapCount+=2;
                  swap(q, i-2, i-1);
                  swap(q, i-1, i);
                  System.out.println(q);
              }else{
                  System.out.println("Too chaotic");
                  return;
              }
            }
        }
        System.out.println(swapCount);
    }

    
    private static void swap(List<Integer> q, int a, int b){
           int temp = q.get(a);
           q.set(a, q.get(b));
           q.set(b, temp);
}
}



public class MinimumBribes {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] qTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> q = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qTemp[i]);
                q.add(qItem);
            }

            Result.minimumBribes(q);
        }

        bufferedReader.close();
    }
    
}
