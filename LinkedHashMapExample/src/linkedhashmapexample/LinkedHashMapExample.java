package linkedhashmapexample;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        // TODO code application logic here
        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap(4, 0.75f, true);
        phonebook.put("Kevin", 12345);
        phonebook.put("Jill", 98745);
        phonebook.put("Brenda", 123123);
        phonebook.put("Gary", 222222);
        System.out.println("Kevin's number: " + phonebook.get("Kevin"));
        
        //especify when a element is add or modifided
        System.out.println("\nList of contacts in phonebook:");
        for(Map.Entry<String, Integer> entry: phonebook.entrySet()){
            System.out.println(entry.getKey() + ": "+ entry.getValue());
        }
    }
    
}
