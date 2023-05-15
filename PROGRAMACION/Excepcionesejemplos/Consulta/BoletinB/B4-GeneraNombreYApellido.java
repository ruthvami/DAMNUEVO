/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b4;

import java.io.*;
import java.util.*;

public class B4 {

    public static void main(String[] args) {

        int numPersones;
        String ruta;

        Scanner teclat = new Scanner(System.in);

        try {

            System.out.print("Número de noms de persones a generar: ");
            numPersones = teclat.nextInt();
            teclat.nextLine();

            System.out.print("Ruta on guardar l'arxiu generat: ");
            ruta = teclat.nextLine();

            File fileNoms = new File("Documentos/usa_noms.txt");       //amb rutes relatives ... millor
            File fileCognoms = new File("Documentos/usa_cognoms.txt");

            ArrayList llistaNoms = llegirArxiu(fileNoms);
            ArrayList llistaCognoms = llegirArxiu(fileCognoms);

            FileWriter writer = new FileWriter(new File("Documentos/" + ruta), true);   // true per a afegir, respectant el que hi ha

            // Generem nom i cognom aleatoriament i es guarda a l'arxiu
            for (int i = 0; i < numPersones; i++) {
                int indexNom = (int) (Math.random() * llistaNoms.size());
                int indexApe = (int) (Math.random() * llistaCognoms.size());
                writer.write(llistaNoms.get(indexNom) + " " + llistaCognoms.get(indexApe) + "\n");
            }

            writer.close();
            System.out.println("Arxiu generat correctament: " + ruta);

        } catch (FileNotFoundException e) {
            System.out.println("Error: Ubicació no existeix, no és accesible o no tens persmissos");
        } catch (IOException e) {
            System.out.println("Error de gestió d'arxius: " + e);
        } catch (InputMismatchException e) {
            System.out.println("Error: S'ha d'especificar un nombre enter");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static ArrayList llegirArxiu(File f) throws FileNotFoundException {
        Scanner lector = new Scanner(f);
        ArrayList llista = new ArrayList();
        while (lector.hasNext()) {
            llista.add(lector.nextLine());
        }
        lector.close();
        return llista;
    }
}
