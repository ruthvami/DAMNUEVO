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
        Jugadors luke = new Jugadors(5, "Luke", 0, 0, 1);
        Jugadors leia = new Jugadors(50, "Leia", 0, 0, 2);
        Enemic snoke = new Enemic(2, "Snoke", 0, 5);

        // Los añadimos a una lista para gestionarlos de forma conjunta
        ArrayList<Personatges> personatges = new ArrayList<>();
        personatges.add(luke);
        personatges.add(leia);
        personatges.add(snoke);
        
        try {
            luke.mourex(20);
            luke.mourey(-45);
            leia.mourey(8);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Disparamos a un enemigo
        try {
            luke.disparar(snoke);
            luke.disparar(snoke);
            leia.disparar(snoke);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Mostramos el estado de los personajes
        for (Personatges personatge : personatges) {
            personatge.estat();
        }
    }
    }


