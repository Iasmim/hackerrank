/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimumswaps;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumSwaps {
    // Complete the minimumSwaps function below.

    static int minimumSwaps(int[] arr) {
      int numSwap = 0;
        for (int i = 0; i < arr.length; ++i) {
            while(i + 1 != arr[i]){
              int swapIndex = arr[i] - 1;
              int valAtIndex = arr[i];
              int valAtWwapIndex = arr[swapIndex];
              arr[i] = valAtWwapIndex;
              arr[swapIndex] = valAtIndex;
              ++numSwap;
              System.out.println(arr[0] +","+arr[1]+","+ arr[2]+","+arr[3]+","+arr[4]);
            }
        }
        return numSwap;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.out"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);
        System.out.println(res);
        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
