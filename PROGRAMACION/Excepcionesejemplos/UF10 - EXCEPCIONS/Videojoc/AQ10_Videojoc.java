/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aq10_videojoc;

/**
 *
 * @author AiA
 */
public class AQ10_Videojoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {   // Test colocació incorrecta en la creació
            Enemic Darth = new Enemic("Darth Vader", -211, -22, 5, 500);  // error de colocació en tauler
            Darth.info();
        } catch (ExceptionLimitDePantalla e) {
            System.out.println(e);
        }

        try {   // Test info per pantalla, disparar i disparar sobre enemic mort
            Enemic Snoke = new Enemic("Snoke", 23, -50, 2, 2);
            Enemic Darth = new Enemic("Darth Vader", -200, 56, 5, 500);
            Jugador Luke = new Jugador("Luke", 11, 33, 5, 6);

            Snoke.info();
            Darth.info();
            Luke.info();
            System.out.println("");
            Luke.disparar(Darth);
            Luke.disparar(Darth);
            Luke.disparar(Snoke);
            Luke.disparar(Snoke);
            Luke.disparar(Snoke);   // Error: Snoke ja estava mort
        } catch (ExceptionEnemicMort | ExceptionLimitDePantalla | ExceptionSenseBales e) {
            System.out.println(e);
        }
        
        try {   // Test moure's fora de la pantalla de joc
            Jugador Leia = new Jugador("Leia", 11, 33, 5, 6);
            Leia.info();
            for (int i = 0; i < 100; i++) {
//                Leia.moureDreta();
//                System.out.println("Leia Xpos: " + Leia.getX());
                Leia.saltar();
                System.out.println("Leia Ypos: " + Leia.getY());
            }
        } catch (ExceptionLimitDePantalla e) {
            System.out.println(e);
        }
        
        try {   // Test disparar sense bales
            Jugador Han = new Jugador("Han", -22, 99, 8, 3);
            Enemic Kylo = new Enemic("Kylo", -200, 56, 5, 250);
            Han.info();
            Kylo.info();
            
            Han.disparar(Kylo);
            Han.disparar(Kylo);
            Han.disparar(Kylo);
            Han.disparar(Kylo);
            
        } catch (ExceptionEnemicMort | ExceptionLimitDePantalla | ExceptionSenseBales e) {
            System.out.println(e);
        }

    }

}
