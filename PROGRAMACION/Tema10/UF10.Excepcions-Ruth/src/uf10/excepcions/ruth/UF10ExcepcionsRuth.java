/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf10.excepcions.ruth;

import java.util.ArrayList;

/**
 *
 * @author ruthv
 */
public class UF10ExcepcionsRuth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Jugadors j1 = new Jugadors(10, "Juan", 50, 50, 2.5);
        Jugadors j2 = new Jugadors(8, "María", 75, 100, 3.0);
        Jugadors j3 = new Jugadors(12, "Pedro", 25, 75, 2.0);
        Enemic e1 = new Enemic(1, "Enemic1", 50, 50, 2.0);
        Enemic e2 = new Enemic(0, "Enemic2", 100, 100, 1.5);
        Enemic e3 = new Enemic(120, "Enemic3", 34, 66, 3.0);

        // Los añadimos a una lista para gestionarlos de forma conjunta
        ArrayList<Personatges> personatges = new ArrayList<>();
        personatges.add(j1);
        personatges.add(j2);
        personatges.add(j3);
        personatges.add(e1);
        personatges.add(e2);
        personatges.add(e3);
        
         for (Personatges personatge : personatges) {
                personatge.estat();
            }
        
        try {
            j1.mourex(20);
            

        } catch (LimitDePantalla e) {
            System.out.println(e.toString());
        }try {
            
            j2.mourey(-34);
            

        } catch (LimitDePantalla e) {
            System.out.println(e.toString());
        }try {
            
            j3.mourey(8);

        } catch (LimitDePantalla e) {
            System.out.println(e.toString());
        }

        // Disparamos a un enemigo
        
         try {
            
            j3.disparar(e1);
            
        } catch (Exception e) {
            System.out.println(e.toString());

        } try {
            j1.disparar(e2);
           
        } catch (Exception e) {
            System.out.println(e.toString());

        } try {
            
            j2.disparar(e3);
            
        } catch (Exception e) {
            System.out.println(e.toString());

        } try {
            
            j2.disparar(e1);
        } catch (Exception e) {
            System.out.println(e.toString());

        }
        for (Personatges personatge : personatges) {
                personatge.estat();
            }
    }
}
