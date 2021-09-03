package fibonacci;

import java.util.*;

/*In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.*/
public class Fibonacci {
    
    public static int fibonacci(int i){
        if(i <=1)
            return i;
        else
        return fibonacci(i-1) + fibonacci(i-2); 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        for (int i = 0; i < n; i++) {
               System.out.print(fibonacci(i)+" ");
        }
        
    }
    
}
