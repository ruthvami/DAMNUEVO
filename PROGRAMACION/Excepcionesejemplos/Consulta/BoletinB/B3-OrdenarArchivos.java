/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3;

import java.io.*;
import java.util.*;

public class B3 {

    public static void main(String[] args) {
        try {
            
            String Llegir;
            String Escriure;
            
            Scanner in = new Scanner(System.in);
            System.out.print("Arxiu per a llegir: ");
            Llegir = in.nextLine();
            System.out.print("Arxiu a escriure: ");
            Escriure = in.nextLine();
            
            File fileLlegir = new File(Llegir);
            File fileEscriure = new File(Escriure);
            
            // Objectes per a llegir i escriure
            Scanner reader = new Scanner(fileLlegir);
            FileWriter writer = new FileWriter(fileEscriure);
            
            // Guardem en un ArrayList tot el contingut de l'arxiu a llegir
            ArrayList<String> nomPersones = new ArrayList();
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
