package methodreferencesexample;

/**
 *
 * @author iasmimc
 */
public class Main {
    
    public static void main(String[] args){
        
        Square s = new Square(4);
        
       /* Shapes shapes = (Square square) ->{
            return square.calculeArea(); 
        };*/
         Shapes shapes = Square :: calculeArea;
       
       
        System.out.println("Area:" + shapes.getArea(s));
    }
    
}
