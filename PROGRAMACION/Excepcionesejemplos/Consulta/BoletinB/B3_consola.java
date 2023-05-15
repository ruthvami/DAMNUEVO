/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;

public class B3_consola {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("*** ERROR: L'ús del programa ha de ser: ***\njava B3_consola arxiu1 arxiu2");
            System.exit(-1); // El programa acaba
        }
        try {
            File fileLlegir = new File(args[0]);
            File fileEscriure = new File(args[1]);

            // Objectes per a llegir i escriure
            Scanner reader = new Scanner(fileLlegir);
            FileWriter writer = new FileWriter(fileEscriure);

            // Guardem en un ArrayList tot el contingut de l'arxiu a llegir
            ArrayList<String> nomPersones = new ArrayList<String>();
            while (reader.hasNext()) {
                nomPersones.add(reader.nextLine());
            }

            Collections.sort(nomPersones);

            // Recorrem l'ArrayList i anem escrivint a l'arxiu final
            for (String nom : nomPersones) {
                writer.write(nom + "\n");
            }

            reader.close();
            writer.close();

            System.out.println("L'arxiu " + fileEscriure.getName() + " ha estat creat correctament");

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println("Error de gestió d'arxius: " + e);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
