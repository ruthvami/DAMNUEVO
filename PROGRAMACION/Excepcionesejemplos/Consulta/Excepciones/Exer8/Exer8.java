/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author AiA
 */
public class Exer8 {

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
            } 
            catch (InputMismatchException e) {
                System.out.println("EXCEPCIÓ: L'edat ha de ser un sencer (" + e + ")");
                in.nextLine();
            } 
            catch (Exception e) {
                System.out.println("EXCEPCIÓ: " + e);
            }

        } while (llistaGats.size() < 5);

        mostraGats(llistaGats);

        try {
            System.out.print("Quin gat vols esborrar? ");
            int index = in.nextInt();
            in.nextLine();

            llistaGats.remove(index);
            mostraGats(llistaGats);
        } 
        catch (InputMismatchException e) {
            System.out.println("EXCEPCIÓ: Cal seleccionar un sencer com a índex (" + e + ")");
            in.nextLine();
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("EXCEPCIÓ: L'índex seleccionat no es troba a la llista (" + e + ")");
        }
    }

    public static void mostraGats(ArrayList<Gat> llistaGats) {
        System.out.println("\n*** GATS ***");
        for (int i = 0; i < llistaGats.size(); i++) {
            System.out.print("Gat " + i + " -> ");
            llistaGats.get(i).imprimir();
        }
    }
}
