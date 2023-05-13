/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tres;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ruthv
 */
public class Tres {

    /**
     * @param args the command line arguments Escribe un programa en Java que
     * lea un archivo de texto llamado "datos.txt" y almacene cada palabra en un
     * Set. Maneja las siguientes situaciones:
     *
     * Si el archivo no se encuentra, lanza una excepción del tipo
     * FileNotFoundException y muestra un mensaje de error. Si se produce un
     * error al leer el archivo, lanza una excepción del tipo IOException y
     * muestra un mensaje de error.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f1 = new File("datos.txt");
        Set<String> s = new HashSet<>();
        try {
            Scanner sc = new Scanner(f1);
            while (sc.hasNextLine()) {
                s.add(sc.nextLine());
            }
            System.out.println("Palabras encontradas:");
            for (String palabra : s) {
                System.out.println(palabra);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error al encontrar el fichero -> " + f1.getName());
        }
    }

}
