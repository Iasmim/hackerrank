/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkendpoint;
import java.util.*;
/**
 *
 * @author iasmimc
 */
public class NetworkEndpoint {
    
    public static int findNetworkEndpoint(int startNodeId ,int[] fromIds,int[] toIds){
   
          if((toIds.length<= 0)||(toIds.length > 10000))
            {
                return 0;
            }
        List<Integer> toIdsList = new ArrayList<Integer>() {{ for (int i : toIds) add(i); }};
        List<Integer> fromIdsList = new ArrayList<Integer>() {{ for (int i : fromIds) add(i); }};
          

        boolean startSearch = true;   
        boolean endFound = false;
        
        int node = startNodeId;
        int indexNode = Integer.MIN_VALUE;   
        
        
    while (!endFound)  
        {                              
            if(startSearch)             
            {
                startSearch = false;
            }

            if(fromIdsList.contains(node))
            {
                indexNode = fromIdsList.indexOf(node);
                node = toIdsList.get(indexNode); 
            }
            else
            {
                endFound = true;
            }
        }
        return indexNode;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int startNodeId = 6;
        int n = 4;

        int[] fromIds = new int[] { 4, 9, 6, 1 };
        int[] toIds = new int[] { 9, 5, 1, 4 };
        System.out.println((startNodeId));
        System.out.println(n);
        
        
        

        for (int i = 0; i < n; i++)
        {
            System.out.println("from : " + fromIds[i] + " -> " + toIds[i]);
        }

        int endPointId = findNetworkEndpoint(startNodeId, fromIds, toIds);
        System.out.println("End Node is: " + endPointId);
        
       
        
    }
}

