/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author rutvac
 */
public class ArrayList2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList lista2 = new ArrayList();

//        llista.add(-25);
//        llista.add(3.14);
//        llista.add('A');
//        llista.add("LLuis");
//
//        llista.add(new Persona("12345678P", "Peter", "Pan", 16));
//        llista.add(new Persona("99999999D", "Darth", "Vather", 54));
//        
//        for (int i = 0; i < llista.size(); i++) {
//            System.out.println(llista.get(i));
//        }
//        llista.toString();
        lista2.add("h");
        lista2.add("o");
        lista2.add("l");
        lista2.add("a");
        
        lista2.set(1, "e");
        
        Iterator iter = lista2.iterator();
        
        while (iter.hasNext()) {
            System.out.print(iter.next());
        }
        System.out.println(" ");
        System.out.println("Tamaño: "+lista2.size());
        for (int i = 0; i < lista2.size(); i++) {
            System.out.print(lista2.get(i));
        }
        lista2.toString();
        System.out.println(" ");
        for(iter=lista2.iterator();iter.hasNext(); ){
            System.out.print(iter.next());
        }
    }

}
