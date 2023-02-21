/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interficie;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author rutvac
 */
public class Interficie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Figura q1 = new Quadrat(2);
        Figura q2 = new Quadrat(8);
        Figura q3 = new Quadrat(6);

        Figura c1 = new Cercle(3);
        Figura c2 = new Cercle(2);

        Figura r1 = new Rectangle(2, 4);
        Figura r2 = new Rectangle(9, 3);

        ArrayList Figures = new ArrayList();

        Figures.add(q1);
        Figures.add(q2);
        Figures.add(q3);
        Figures.add(r1);
        Figures.add(r2);
        Figures.add(c1);
        Figures.add(c2);

        Iterator iter = Figures.iterator();

        float areas = 0;
        while (iter.hasNext()) {
            Figura f = (Figura) iter.next();
            areas = f.area() + areas;
            System.out.println(f);
        }
        System.out.println("Tenim un total de " + Figures.size() + " figures i la seua àrea total es de " + areas + " unitats quadrades");
    }

}
