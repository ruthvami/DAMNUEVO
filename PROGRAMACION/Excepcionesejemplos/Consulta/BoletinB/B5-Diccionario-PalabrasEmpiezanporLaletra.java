/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b5;

import java.io.*;
import java.util.*;

public class B5 {

    public static void main(String[] args) {

        File dirDiccionari = new File("Documentos/Diccionari");
        boolean resultat;
        if (!dirDiccionari.exists()) {
            resultat = dirDiccionari.mkdir();
        } else {
            resultat = true;
        }

        if (resultat) {
            try {
                File fileDiccionari = new File("Documentos/diccionari.txt");

                ArrayList<String> alDiccionari = new ArrayList();
                Scanner reader = new Scanner(fileDiccionari);
                while (reader.hasNext()) {
                    alDiccionari.add(reader.nextLine());
                }
                reader.close();

                // Creem dins de la carpeta 'Diccionari' tants arxius com lletres de l'abecedari (A.txt, B.txt, C.txt,...)
                for (int i = 65; i <= 90; i++) {
                    // Es genera un FileWriter per a cada arxiu a crear
                    FileWriter writer = new FileWriter(new File(dirDiccionari.getParent() + "/" + dirDiccionari.getName() + "/" + (char) i + ".txt"));

                    // Es recorren totes les paraules de l'ArrayList
                    for (String paraula : alDiccionari) {
                        // S'escriuen en cada arxiu les que comencen per la lletra del nom de l'arxiu
                        if (paraula.toUpperCase().startsWith(Character.toString((char) i))) {
                            writer.write(paraula + "\n");
                        }
                    }
                    writer.close();
                    System.out.println("Arxiu " + (char) i + ".txt creat correctament");
                }
            } catch (FileNotFoundException e) {
                System.out.println("L'arxiu del diccionari no existeix o és inaccessible");
            } catch (IOException e) {
                System.out.println("Error de gestió d'arxius: " + e);
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        } else {
            System.out.println("La carpeta " + dirDiccionari.getName() + " no s'ha pogut crear. Ruta incorrecta o ja existeix");
        }
    }
}
