/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJ12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double n = 0;
        int posicio = 0;
        String cadena;
        double[] valors = {9.83, 4.5, -3.06, 0.06, 2.52, -11.3, 7.60, 3.00, -30.4, 105.2};

        System.out.println("Contingut de l'array abans de modificar:");
        for (int i = 0; i < valors.length; i++) {
            System.out.printf("%.2f ", valors[i]);

        }
        boolean repetir = true;
        do {
            try {

                System.out.println("\n\nIntrodueix la posició de l'array a modificar: ");
                cadena = sc.nextLine();
                posicio = Integer.parseInt(cadena);

                System.out.println("\nIntrodueix el nou valor de la posició " + posicio + ": ");
                n = sc.nextDouble();

                valors[posicio] = n;

                System.out.println("\nPosicio a modificar " + posicio);
                System.out.println("Nou valor:" + n);
                System.out.println("Contingut de l'array modificat:");
                for (int i = 0; i < valors.length; i++) {
                    System.out.printf("%.2f ", valors[i]);

                }
                repetir = false;
            } catch (NumberFormatException e) {
                System.out.println(e);
            } catch (InputMismatchException e) {
                System.out.println("Debes de introducir un numero");
                sc.nextLine();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("El numero maximo del array es " + valors.length);
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (repetir);
    }
}
