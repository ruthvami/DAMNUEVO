package a1;

import java.io.*;
import java.util.Scanner;

public class A1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String rutaIntroduida = "";
        // Mentre la ruta introduïda siga diferent de buida (tecla intro)
        do {
            try {
                System.out.print("Introdueix la ruta (intro per a eixir): ");
                rutaIntroduida = in.nextLine();

                if (!rutaIntroduida.equals("")) {
                    File f = new File(rutaIntroduida);
                    mostraInfoRuta(f);
                }
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
        } while (!rutaIntroduida.equals(""));

        System.out.println("Fi del programa");
    }

    public static void mostraInfoRuta(File ruta) throws FileNotFoundException {
        // Si la ruta no existeix llança una excepció
        if (!ruta.exists()) {
            throw new FileNotFoundException("La ruta introduïda no existeix");
        }
        // Si la ruta és un arxiu mostra el nom de l'arxiu
        if (ruta.isFile()) {
            System.out.println("Nom de l'arxiu: " + ruta.getName());
        } else if (ruta.isDirectory()) { // Si no, si la ruta és una carpeta, primer mostra la llista de carpetes i després mostra els arxius

            File[] llista = ruta.listFiles();
            // Recorre la llista i mostra les carpetes
            for (File element : llista) {
                if (element.isDirectory()) {
                    System.out.println("[*] " + element.getName());
                }
            }
            // Recorre la llista i mostra els arxius
            for (File element : llista) {
                if (element.isFile()) {
                    System.out.println("[A] " + element.getName());
                }
            }
        }
        System.out.println("");
    }
}
