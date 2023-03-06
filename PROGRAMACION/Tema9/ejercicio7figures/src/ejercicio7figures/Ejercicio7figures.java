/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7figures;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author rutvac
 */
public class Ejercicio7figures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle r=new Rectangle(3,5);
        Quadrat q=new Quadrat(2);
        Triangle t=new Triangle(2,7);
        Cercle c=new Cercle(8.8);
        
        ArrayList <iFigura2D> lista=new ArrayList<>();
        
        lista.add(r);
        lista.add(q);
        lista.add(t);
        lista.add(c);
        System.out.println("Normal");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).imprimir());
            System.out.println("---------------------------------------------------");
        }
        System.out.println("x0.5");
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).escalar(0.5);
            lista.get(i).imprimir();
            System.out.println("---------------------------------------------------");
        }
        System.out.println("x2");
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).escalar(2);
            lista.get(i).imprimir();
            System.out.println("---------------------------------------------------");
        }
    }
    
}
