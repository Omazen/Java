/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derbruch;

/**
 *
 * @author schre
 */
public class gleichesobjekt {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        
        Bruch a = new Bruch();  // a als Bruch definiert
        a.zaehler = 3;
        a.nenner = 4;
        Bruch b = a;        // b hat den wert von a
        // die objekte 3 und 4 werden jetzt doppelt verwendet 
        //undzwar als bruch a und b
        // ändert man nun egal welchen bruch verändert sich das objekt.
        // das bezeichnet man als "aliasing"
        
        //jetzt erstelle ich 2 verschiedene objekte (brüche) 
        // die aber den gleichen wert haben
        Bruch c = new Bruch();
        c.zaehler = 3;
        c.nenner = 4;
        Bruch d = new Bruch();
        d.zaehler = 3;
        d.nenner = 4;
        //if ( a == B)...überprüfung liefert false zurück.
        //dies ist jedoch kein progblem :)
        
        
        // TODO code application logic here
    }
    
    
}
