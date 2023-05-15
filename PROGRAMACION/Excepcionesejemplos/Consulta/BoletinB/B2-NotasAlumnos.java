/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2;

import java.io.*;
import java.util.*;

public class B2 {

    public static void main(String[] args) {
        try {
            File f = new File("alumnes_notes.txt");          // Relativa, millor opció
            Scanner lector = new Scanner(f);

            ArrayList<String> alumnes = new ArrayList<String>();

            // Comptador del número de linies
            int nLinia = 1;

            while (lector.hasNextLine()) {
                // Partim (split) la línia en paraules (espais) i agarrem la info de l'alumne
                String[] paraules = (lector.nextLine()).split(" ");

                // Si la línia no té el format correcte la saltem
                if (paraules.length < 3) {
                    System.out.println("**** Línia " + nLinia + " amb format incorrecte. Es passa a la següent");
                    continue;
                }

                String nom = paraules[0];
                String cognom = paraules[1];

                // Calculem la mitjana
                int suma = 0;
                for (int j = 2; j < paraules.length; j++) {
                    suma += Integer.valueOf(paraules[j]);
                }
                double mitjana = (double) (suma) / (double) (paraules.length - 2);

                alumnes.add(String.format("%.2f %s", mitjana, nom + " " + cognom));

                nLinia++;
            }

            // Ordenem la llista en ordre descendent
            Collections.sort(alumnes, Collections.reverseOrder());
            
            System.out.println("LLISTAT DE MITJANES DE L'ALUMNAT");
            System.out.println("--------------------------------------");
            
            alumnes.forEach(a -> System.out.println(a));

        } catch (FileNotFoundException e) {
            System.out.println("Error: L'arxiu no existeix");
        } catch (NumberFormatException e) {
            System.out.println("Error: Hi han notes amb format incorrecte a l'arxiu");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
    }
}
