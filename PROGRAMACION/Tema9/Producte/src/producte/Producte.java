/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package producte;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author rutvac
 */
public class Producte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList lista=new ArrayList();
        lista.add("peras");
        lista.add("manzanas");
        lista.add("limones");
        lista.add("sandia");
        lista.add("platano");
        lista.add(2,"melocotones");
        for (Iterator iter=lista.iterator(); iter.hasNext() ; ) {
            System.out.println(iter.next());
        }
         Producte p1=(Producte)lista.get(0);
        
        
    }
    
}
