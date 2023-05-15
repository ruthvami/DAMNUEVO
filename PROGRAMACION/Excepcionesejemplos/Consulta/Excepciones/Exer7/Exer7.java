/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AiA
 */
public class Exer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Gat> llistaGats = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String nom;
        int edat;

        do {
            try {
                System.out.print("Nom del gat: ");
                nom = in.nextLine();
                System.out.print("Edat del gat: ");
                edat = in.nextInt();
                in.nextLine();

                llistaGats.add(new Gat(nom, edat));

            } catch (Exception e) {
                System.out.println(e);  
                // Si hi ha excepció per InputMissmatch del nextInt, el in.nextLine() es quedarà per fer
            }

        } while (llistaGats.size() < 5);

        System.out.println("\n*** GATS ***");
        for (int i = 0; i < llistaGats.size(); i++) {
            System.out.print("Gat " + i + " -> ");
            llistaGats.get(i).imprimir();
        }
    }
}
