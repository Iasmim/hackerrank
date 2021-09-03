/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadsandlibraries;

import java.io.*;
import java.util.*;

public class RoadsandLibraries {

    private static List<Boolean> visitado;
    private static int cont;
    private static List<List<Integer>> cities;

    public static void dfs(int i) {
        // Write your code here
        cont++;
        visitado.set(i, true);
        List<Integer> temp = cities.get(i);
        for (int j = 0; j < temp.size(); j++) {
            if (!visitado.get(temp.get(j))) {
                dfs(temp.get(j));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.out"));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n = Integer.parseInt(firstMultipleInput[0]);

            int m = Integer.parseInt(firstMultipleInput[1]);

            int c_lib = Integer.parseInt(firstMultipleInput[2]);

            int c_road = Integer.parseInt(firstMultipleInput[3]);

            cities = new ArrayList<>();

            for (int i = 0; i < m; i++) {
                String[] citiesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                List<Integer> citiesRowItems = new ArrayList<>();

                for (int j = 0; j < 2; j++) {
                    int citiesItem = Integer.parseInt(citiesRowTempItems[j]);
                    citiesRowItems.add(citiesItem);
                }

                cities.add(citiesRowItems);
            }

            visitado = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                visitado.add(false);
            }

            cont = 0;
            int result = 0;
            for (int i = 0; i < cities.size(); i++) {
                if (!visitado.get(i)) {
                    //busca por profuncidade
                    dfs(i);
                    if (c_lib > c_road) {
                        result += c_lib + c_road * (cont - 1);
                    } else {
                        result += c_lib * cont;
                    }
                }
            }

            System.out.println(result);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
