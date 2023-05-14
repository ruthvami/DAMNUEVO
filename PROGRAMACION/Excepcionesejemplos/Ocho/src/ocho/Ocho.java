/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ocho;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ruthv
 */
public class Ocho {

    /**
     * Escribe un programa que lea un archivo de texto y escriba su contenido en
     * otro archivo, pero con todas las palabras de más de 5 letras reemplazadas
     * por la palabra *.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        File ar = new File("a.txt");
        Scanner sc = new Scanner(ar);
        FileWriter wr = new FileWriter("arch.txt", false);
        while (sc.hasNext()) {
            String palabra = sc.next();
            if (palabra.length() > 5) {
                wr.write(" ***** ");
            } else {
                wr.write(palabra + " ");
            }
        }
        wr.close();
//Para hacerlo con salto de linea
//        while (sc.hasNextLine()) {
//    String linea = sc.nextLine();
//    String[] palabras = linea.split(" ");
//    for (String palabra : palabras) {
//        if (palabra.length() > 5) {
//            wr.write(" ***** ");
//        } else {
//            wr.write(palabra + " ");
//        }
//    }
//    wr.write("\n"); // Agregar salto de línea al final de cada línea
//}
//wr.close();
    }

}
