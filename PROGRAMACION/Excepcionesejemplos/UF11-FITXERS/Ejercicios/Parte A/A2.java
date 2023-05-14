package a2;

import java.io.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class A2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String rutaIntroduida = "";
        boolean info = true;
        // Mentre la ruta introduïda siga diferent de buida (tecla intro)
        do {
            try {
                System.out.print("Introdueix la ruta (intro per a eixir): ");
                rutaIntroduida = in.nextLine();

                if (!rutaIntroduida.equals("")) {
                    File f = new File(rutaIntroduida);
                    mostraInfoRuta(f,info);
                }
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
        } while (!rutaIntroduida.equals(""));

        System.out.println("Fi del programa");
    }

    public static void mostraInfoRuta(File ruta, boolean info) throws FileNotFoundException {
        // Si la ruta no existeix llança una excepció
        if (!ruta.exists()) {
            throw new FileNotFoundException("La ruta introduïda no existeix");
        }
        // Si la ruta és un arxiu mostra el nom de l'arxiu
        if (ruta.isFile()) {
            System.out.println("Nom de l'arxiu: " + ruta.getName());
        } else if (ruta.isDirectory()) { // Si no, si la ruta és una carpeta, primer mostra la llista de carpetes i després mostra els arxius

            File[] lista = ruta.listFiles();
            // Ordena la llista alfabèticament
            Arrays.sort(lista);
            // Recorre la llista i mostra les carpetes ordenades
            for (File element : lista) {
                if (element.isDirectory()) {
                    if (info) {
                        System.out.println("[*] " + element.getName() + "\t" + element.length() + " bytes\t" + new Date(element.lastModified()));
                    } else {
                        System.out.println("[*] " + element.getName());
                    }
                }
            }
            // Recorre la llista i mostra els arxius ordenats
            for (File element : lista) {
                if (element.isFile()) {
                    if (info) {
                        System.out.println("[A] " + element.getName() + "\t" + element.length() + " bytes\t" + new Date(element.lastModified()));
                    } else {
                        System.out.println("[A] " + element.getName());
                    }
                }
            }
        }

        System.out.println("");
    }
}
