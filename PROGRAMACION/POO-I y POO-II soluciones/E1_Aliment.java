/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e1_aliment;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author angel
 */
public class E1_Aliment {

    public static void main(String[] args) {

        Aliment p1 = new Aliment("Cebes",33);
        Aliment p2 = new Aliment("Taronges",3);
        Aliment p3 = new Aliment("Floricols",11);
        Aliment p4 = new Aliment("Pebres",4);
        Aliment p5 = new Aliment("Olives",55);
        
        ArrayList llista = new ArrayList();
        
        llista.add(p1);
        llista.add(p2);
        llista.add(p3);
        llista.add(p4);
        llista.add(p5);
        
        System.out.println("*** Contingut inicial ***");
        mostrarLlista(llista);
        
        llista.remove(1);   // Esborrem 2 aliments
        llista.remove(0);        
        llista.add(2,new Aliment("Peix",41));  // Afegim un nou
        
        System.out.println("\n*** Nou contingut després d'esborrar + afegir ***");
        mostrarLlista(llista);
        
        llista.clear(); // Esborrem tots
        System.out.println("\n*** Després d'esborrar tots ***");    
        mostrarLlista(llista);
        
        // CREACIÓ DIFERENT DEL ARRAYLIST        
        ArrayList<Aliment> llista2 = new ArrayList<Aliment>();
        
        llista2.add(p1);
        llista2.add(p2);
        llista2.add(p3);
        llista2.add(p4);
        llista2.add(p5);
        System.out.println("\n*** Utilitzant 'ArrayList<Aliment> llista2' ***");
        mostrarLlista(llista2);
        
                
    }   
    
    public static void mostrarLlista(ArrayList llista){
        System.out.println("Nº elements: " + llista.size());
        Iterator iter = llista.iterator();
        while(iter.hasNext()){
            Aliment prod = (Aliment) iter.next();
            System.out.println("Tenim " + prod.getQuantitat() + " " + prod.getNom());
        }        
    }
    public static void mostrarLlista2(ArrayList<Aliment> llista){
        System.out.println("Nº elements: " + llista.size());
        for (Aliment prod : llista) {
            System.out.println("Tenim " + prod.getQuantitat() + " " + prod.getNom());
        }       
    }
}