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
        Professor p3=new Professor("Ansias","157298l","sadgfds",42353,"dsg",6,moduls,"mañana");
        p1.mostrarPersona();
        System.out.println(" ");
        p2.mostrarPersona();
        System.out.println(" ");
        p3.mostrarPersona();
    }

}
