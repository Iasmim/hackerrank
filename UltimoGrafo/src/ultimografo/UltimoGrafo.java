package ultimografo;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static int ultimo(int[] g1, int[] g2) {

        int size = g1.length;

        if (size == 0) {
            return 0;
        }

        int valueonfrom;
        int valueonto = g2[0];
        int j = 0;
        for (int i = 0; i < size; i++) {
            valueonto = g2[i];
            valueonfrom = g1[j];
            while (valueonfrom == valueonto) {
                j++;
            }
        }
        return valueonto;
    }
}
//2, 3
//1,2,3 2,3 1,2
//1-2-3-4
//3,4,1,2
//5 6 7 8
//5 6
//7 8

public class UltimoGrafo {

    static int count = 0;

    public static void badMethod() {
        throw new Error();
    }

    public static void Linkedinmeth() {
        String[] array = new String[]{"A", "B", "C"};
        List<String> list1 = Arrays.asList(array);

        List<String> list2 = new ArrayList<>(Arrays.asList(array));
        List<String> list3 = new ArrayList<>(Arrays.asList("A", new String("B"), "C"));

        System.out.println(list1.equals(list2));
        System.out.println(list1.equals(list3));

        if (count < 3) {
            count++;
            // main(null);
        } else {
            return;
        }
        System.out.println("Hellor");

        LinkedList<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(1);
        list.add(10);
        System.out.println(list);

        try {
            System.out.println("hello wotud");
        } catch (Exception e) {
            System.out.println("e");
        } /*catch (ArithmeticException e) {
            System.out.println("e");
        }*/ finally {
            System.out.println("hello wotud");
        }

        try {
            System.out.println("A");
            badMethod();
            System.out.println("B");
        } catch (Exception e) {
            System.out.println("C");
        } finally {
            System.out.println(
                    "D");
        }

        String message = "Hello world!";
        String newm = message.substring(6, 12) + message.substring(12, 6);

        System.out.println(newm);

        String fruit = "strawberries";
        System.out.println(fruit.substring(2, 5));

        char pi = "piper".charAt(3);
        //int result = Result.ultimo(g1,g2);
        System.out.println("Resultado");
        //System.out.println(result);

        int[] samp = {8, 5, 3, 1};
        System.out.println(samp[2]);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int tam = scan.nextInt();
        int[] g1 = new int[tam];
        int[] g2 = new int[tam];
        for (int i = 0; i < tam; i++) {
            g1[i] = scan.nextInt();
        }

        for (int i = 0; i < tam; i++) {
            g2[i] = scan.nextInt();
        }

        int result = Result.ultimo(g1, g2);
        System.out.println("Resultado");
        System.out.println(result);
    }

}
