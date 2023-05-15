/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b6;

import java.io.*;
import java.util.*;

public class B6 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        try {
            System.out.print("Introdueix el número enter a buscar: ");
            String numero_a_buscar = teclat.nextLine();
            Integer numero_a_buscar_INT = Integer.parseInt(numero_a_buscar);    // Només per a llançar excepció si no s'introdueix un int

            File fileNumeroPI = new File("Documentos/pi-million.txt");  // ruta relativa
            
            Scanner lector = new Scanner(fileNumeroPI);

            //Agafem tots els decimals del número PI de l'arxiu com a string ( a partir del punt .)
            String decimalsPI = (lector.nextLine()).substring(2);
            lector.close();

            boolean trobat = false;

            // anem recorrent "decimalsPI" i comparant en frangments de "numero_a_buscar"
            for (int i = 0; i < decimalsPI.length() - numero_a_buscar.length(); i++) {
                // Comparem si 'numero_a_buscar' està en el substring de 'decimalsPI' 
                if (numero_a_buscar.equals(decimalsPI.substring(i, i + numero_a_buscar.length()))) {
                    trobat = true;
                    break;
                }
            }

            if (trobat) {
                System.out.println("El número " + numero_a_buscar + " SI es troba en PI");
            } else {
                System.out.println("El número " + numero_a_buscar + " NO es troba en PI");
            }

            
        } catch (FileNotFoundException e) {
            System.out.println("Error: L'arxiu de PI no existeix o és inaccessible");
        } catch (NumberFormatException e) {
            System.out.println("Error: El format del número a buscar és incorrecte");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
