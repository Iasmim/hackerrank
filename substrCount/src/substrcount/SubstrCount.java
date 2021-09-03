package substrcount;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SubstrCount {
    // Complete the substrCount function below.

    static long substrCount(int n, String s) {
       long retVal = s.length();
       
        for (int i = 0; i < n; i++) {
            
            int startChar = s.charAt(i);
            int diffCharIdx = -1;
            
            for (int j = i+1; j < n; j++) {
                int currChar = s.charAt(j);
                
                if(startChar == currChar)
                {
                  if(diffCharIdx == -1 || (j - diffCharIdx == diffCharIdx - i))
                      retVal++;
                }else
                {
                  if(diffCharIdx == -1)
                      diffCharIdx = j;
                  else
                      break;
                }
            }
        }
       return retVal;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.out"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);
        System.out.println(result);
        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();
        scanner.close();
    }

}
