/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo4;

import java.util.ArrayList;

/**
 *
 * @author rutvac
 */
public class Ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList notes = new ArrayList();
        Persona p1 = new Persona("Antonio", "12345678E", "SADASDAS", 123445);
        
        notes.add(8);
        notes.add(3);
        notes.add(2);
        ArrayList moduls = new ArrayList();
        moduls.add("Programacion");
        moduls.add("FOL");
        moduls.add("Entornos");
        Alumne p2=new Alumne("Alba","1241352I","dgdfahfds",212454,2,"dam",1,notes);
        Alumne p3=new Alumne("Ansias","157298l","sadgfds",42353,6,"daw",5,moduls);
        p1.mostrarPersona();
        System.out.println(" ");
        p2.mostrarPersona();
        System.out.println(" ");
        p3.mostrarPersona();
    }

}
