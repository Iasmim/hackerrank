package threadclassexample;
public class ThreadClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ThreadExample thread1 = new ThreadExample();
        thread1.setName("My first Thread");
        thread1.start();
        
         ThreadExample thread2 = new ThreadExample();
        thread2.setName("My secnd Thread");
        thread2.start();
    }
    
}
