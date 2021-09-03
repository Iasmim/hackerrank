/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hourglasssum;
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
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
    int rows = arr.size();
    int columns = arr.get(0).size();
    int max_hourglass_sum = Integer.MIN_VALUE;;
    int curret_hourglass_sum = Integer.MIN_VALUE;;
        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < columns -2 ; j++) {
                curret_hourglass_sum = arr.get(i).get(j) +
                        arr.get(i).get(j+1) +
                        arr.get(i).get(j+2) +
                        arr.get(i+1).get(j+1)+
                        arr.get(i+2).get(j) +
                        arr.get(i+2).get(j+1)+
                        arr.get(i+2).get(j+2);
           max_hourglass_sum = Math.max(max_hourglass_sum,curret_hourglass_sum);
            }
        }
     return max_hourglass_sum;
    }

}
        
public class HourglassSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.out"));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
 }
    

