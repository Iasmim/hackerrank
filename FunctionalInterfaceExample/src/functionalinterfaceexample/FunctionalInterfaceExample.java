package functionalinterfaceexample;
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // TODO code application logic here
       
        GreetingMessage gm = new GreetingMessage() {
             
            @Override
            public void greet(String name){
             System.out.println("Hello "+ name);
            }
            
        };
        
        gm.greet("Brenda");
        
        GreetingMessage gm2 = (name) -> {
          System.out.println("Hello "+ name);
        };
        
        gm2.greet("Bethan");
        
        
        MessagePrinter mp = () -> {
         System.out.println("This is a message");
        };
        mp.printMessage();        
         
        
        
    }
    
}
