/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeatedstring;
import java.io.*;
/**
 *
 * @author iasmimc
 */
class Result {

    public static long repeatedString(String s, long n) {
    // Write your code here
    int strlength = s.length();
    long quant_sub = n / strlength;
    long r_a = n % strlength;
    long partialStrLen = (r_a==0)? 0 : r_a;
    long aCount = quant_sub * getLetterCount(s, strlength) + getLetterCount(s, partialStrLen);
    return aCount;
    }
    
    public static long getLetterCount(String s, long strLen){
        long count = 0;
        for(int i =0; i < strLen; i++)
        {
            if(s.charAt(i) =='a')
                count++;
        }
        
        return count;
    }
     

}

public class RepeatedString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

