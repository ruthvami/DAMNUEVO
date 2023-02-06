/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist2;

import java.util.ArrayList;

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
        ArrayList llista = new ArrayList();

        llista.add(-25);
        llista.add(3.14);
        llista.add('A');
        llista.add("LLuis");

        llista.add(new Persona("12345678P", "Peter", "Pan", 16));
        llista.add(new Persona("99999999D", "Darth", "Vather", 54));
        
        for (int i = 0; i < llista.size(); i++) {
            System.out.println(llista.get(i));
        }
        llista.toString();
    }

}
