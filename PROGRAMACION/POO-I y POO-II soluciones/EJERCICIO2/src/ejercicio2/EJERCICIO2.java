/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author rutvac
 */
public class EJERCICIO2 {

    public static void main(String[] args) {
        // TODO code application logic here

        Temps t1 = new Temps(12, 25, 352);
        Temps t2 = new Temps(5, 100, -5);
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        
        System.out.println(t1.sumarobj(t2));
        System.out.println(t2.restaobj(t1));
        
        t1.editasegundos(70);
        t2.editasegundos(-70);
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        
        t1.editahoras(4);
        t2.editahoras(-4);
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        
        t1.editaminutos(102);
        t2.editaminutos(-102);
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        
        t1.setMinutos(78);
        System.out.println(t1.toString());
        t2.setSegundos(-120);
        System.out.println(t2.toString());

    }

}
