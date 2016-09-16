
package derbruch;

/**
 *
 * @author schre
 */
public class lebensdauer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //der bruch wird erzeugt und ist inerhalb der 2 klammern { } "lebendig".
        int x = 11;
        if(x > 10) {
            Bruch b = new Bruch();
            b.zaehler = 2;
            b.nenner = 3;
        }
        //System.out.println(b.nenner);
        
        //in dem fall das wir nach der geschlossenen klammer "}" versuchen
        //auf den bruch zuzugreifen funktioniert es nicht, weil
        //der bruch nicht mehr existiert. das heist die Lebensdauer 
        //endet mit der geschlossenen klammer "}".
        
        
        // TODO code application logic here
    }
    
}
