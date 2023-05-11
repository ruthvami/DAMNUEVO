/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b7ruth;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

/**
 *
 * @author ruthv
 */
public class B7Ruth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File directorio = new File("Llibres");

        // Lista los archivos en el directorio y recorre cada archivo
        for (File archivo : directorio.listFiles()) {
            // Ignora si el archivo es un directorio
            if (!archivo.isDirectory()) {
                System.out.println("Archivo: " + archivo.getName());

                try {
                    Scanner scanner = new Scanner(archivo);
                    int lineas = 0;
                    int palabras = 0;
                    int caracteres = 0;
                    Map<String, Integer> contadorPalabras = new HashMap<>();

                    // Recorre el archivo línea por línea
                    while (scanner.hasNextLine()) {
                        String linea = scanner.nextLine();
                        lineas++;

                        // Divide cada línea en palabras y actualiza las estadísticas
                        String[] palabrasEnLinea = linea.trim().split("\\s+");
                        palabras += palabrasEnLinea.length;
                        for (String palabra : palabrasEnLinea) {
                            caracteres += palabra.length();
                            contadorPalabras.put(palabra, contadorPalabras.getOrDefault(palabra, 0) + 1);
                        }
                    }

                    // Imprime las estadísticas
                    System.out.println("Lineas: " + lineas);
                    System.out.println("Palabras: " + palabras);
                    System.out.println("Caracteres: " + caracteres);

                    // Obtiene las 10 palabras más comunes y las imprime
                    ArrayList<Map.Entry<String, Integer>> listaPalabras = new ArrayList<>(contadorPalabras.entrySet());
                    listaPalabras.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
                    System.out.println("Las 10 palabras más comunes son:");
                    System.out.printf("%12s %12s", "Paraula", "Vegades");
                    System.out.println(" ");
                    for (int i = 0; i < 10 && i < listaPalabras.size(); i++) {
                        System.out.printf("%10s %13s", "'" + listaPalabras.get(i).getKey()+"'",  "'" + listaPalabras.get(i).getValue()+"'");
                        System.out.println(" ");
                    }

                } catch (FileNotFoundException e) {
                    System.out.println("El archivo no existe: " + archivo.getName());
                }

                System.out.println("--------------------------------------");
            }
        }
    }
}
