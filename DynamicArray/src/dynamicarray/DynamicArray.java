/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicarray;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

        
        List<List<Integer>>  computation = new ArrayList<>();
        List<Integer>  result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            computation.add(new ArrayList<>());
        }
        int lastAnswer = 0;
        
        for (int i = 0; i < queries.size(); i++) {
            
            List<Integer> q = queries.get(i);
            
            int queryTipe = q.get(0);
            int x = q.get(1);
            int y = q.get(2);
            if (queryTipe == 1) {
                int rowIndex = (x ^ lastAnswer) % n;
                computation.get(rowIndex).add(y);
            } else {
                
                int rowIndex = (x ^ lastAnswer) % n;
                List<Integer> seq = computation.get(rowIndex);
                int colIndex = y % seq.size();
                lastAnswer = seq.get(colIndex);
                result.add(lastAnswer);

            }
        }
        return result;
    }

}

public class DynamicArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.out"));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> queriesRowItems = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
                queriesRowItems.add(queriesItem);
            }

            queries.add(queriesRowItems);
        }

        List<Integer> result = Result.dynamicArray(n, queries);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
