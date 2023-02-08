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
        lista.add(new Productes("peras",7));
        lista.add(new Productes("manzanas",3));
        lista.add(new Productes("limones",5));
        lista.add(new Productes("sandia",9));
        lista.add(new Productes("platano",2));
        lista.add(2,"melocotones");
        Productes prod;
        
        for (Iterator iter=lista.iterator(); iter.hasNext() ; ) {
           prod=(Productes)iter.next();
            System.out.println(prod.getNom()+"-"+prod.getQuantitat());
        }
        
        
    }
    
}
