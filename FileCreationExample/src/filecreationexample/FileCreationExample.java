/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filecreationexample;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author iasmimc
 */
public class FileCreationExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File myFile = new File("C:\\Users\\iasmim.cunha\\Desktop\\myFile.txt");
        try{
         boolean filecreated = myFile.createNewFile();
            System.out.println(filecreated);
        }catch(IOException ioe)
        {
        }
        
        
       FilenameFilter filter = (file, fileName) -> {
              return fileName.contains(".");
           };
        
        String[] contents = new File(".").list(filter);
        for(String file : contents)
        {
            System.out.println(file);
        }
        
        //new File("myDirectory").mkdir();
        
        Path path = Paths.get("Hello World.txt");
        try {
            Files.deleteIfExists(path);
        } catch (Exception e) {
        }
        
        
        
    }
    
}
