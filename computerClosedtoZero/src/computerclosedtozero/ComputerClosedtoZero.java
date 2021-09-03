/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerclosedtozero;
import java.util.*;
import java.io.*;
import java.math.*;
class ComputerClosedtoZero {
     // Returns the distance between the two closest numbers.
    static int distClosestNumbers(int[] numbers) { 
        // try to implement it!
       Arrays.sort(numbers);
        if(numbers.length == 0)
           return 0;

        int diff = numbers[0];
         
         for(int i =0; i < numbers.length;i++){
             if(i > 0)
             {
                 int tempdif = numbers[i-1] - numbers[i];
                 if( Math.abs(tempdif) < diff )
                      diff = Math.abs(tempdif);
             }
         }
         return diff;
    }
    
    public static int calculetotalPrice(int[] prices, int discount){
    
       Arrays.sort(prices);
       
       if(prices.length == 0)
           return 0;
       
       float hp = (float)prices[prices.length-1];
       float dfinal = (hp*discount/100);
       prices[prices.length-1] = Math.round(hp - dfinal);
       int total = 0;
        for (int price : prices) {
            total +=price;
        }
        
        return total;
    }
    
    public static int computerClosestoZero(int[] ts){
    
        if(ts.length ==0)
            return 0;
        
        int menor = ts[0];
        
        for (int t : ts) {
            if(Math.abs(t) < Math.abs(menor)){
                   menor = t;
            }else
                if(Math.abs(t) == Math.abs(menor))
                {
                    if(t > menor)
                        menor = t;
                }
        }
        
        return menor;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ts = new int[n];
        for (int i = 0; i < n; i++) {
            ts[i] = in.nextInt();
            
        }
        
        PrintStream outStream = System.out;
        System.setOut(System.err);
        
        //int solution = computerClosestoZero(ts);
       // System.setOut(outStream);
        //System.out.println(solution);
        
        int[] testArray = {3, 9, 50, 15, 99, 7, 98, 65};
        int result = distClosestNumbers(testArray);
        System.out.println(result); // Expected result is 1 (the 2 closest numbers are 98 and 99)
      
        int[] prices = {3, 99};
        int totalprice = calculetotalPrice(prices, 5);
        System.out.println("total price");
        System.out.println(totalprice); // Expected result is 1 (the 2 closest numbers are 98 and 99)
        
    }
    
}
