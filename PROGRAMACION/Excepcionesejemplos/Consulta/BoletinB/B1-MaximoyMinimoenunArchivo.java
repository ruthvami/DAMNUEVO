/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1;

import java.io.*;
import java.util.*;

public class B1 {

    public static void main(String[] args) {
        int maxim = Integer.MIN_VALUE;
        int minim = Integer.MAX_VALUE;
        int numero = 0;

        try {
            File f = new File("Documentos/numeros.txt");              // Relativa, millor opció
            Scanner lector = new Scanner(f);

            while (lector.hasNext()) {
                numero = lector.nextInt();

                if (numero > maxim) {
                    maxim = numero;
                }
                if (numero < minim) {
                    minim = numero;
                }
            }
            lector.close();

            System.out.println("El valor màxim és " + maxim);
            System.out.println("El valor mínim és " + minim);

        } catch (FileNotFoundException e) {
            System.out.println("Error: L'arxiu no existeix");
        } catch (InputMismatchException e) {
            System.out.println("Error: Hi ha dades correptes a l'arxiu(no INT)");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
