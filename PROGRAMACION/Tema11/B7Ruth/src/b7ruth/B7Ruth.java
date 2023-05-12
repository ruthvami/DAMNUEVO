package b7ruth;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

/**
 * Programa para mostrar las 10 palabras mas comunes de cada libro y el numero de caracteres,palabras y lineas.
 * @author ruthv
 */
public class B7Ruth {

    /**
     * Método principal que ejecuta el programa.
     * @param args los argumentos de la línea de comandos 
     * @
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File directorio = new File("Llibres");
        System.out.println("*********DICCIONARI*********");

        for (File archivo : directorio.listFiles()) {
            System.out.println("-----------------------------------");

            System.out.println("Llibre: " + archivo.getName());

            try {
                Scanner scanner = new Scanner(archivo);
                int lineas = 0;
                int palabras = 0;
                int caracteres = 0;
                Map<String, Integer> contadorPalabras = new HashMap<>();

                while (scanner.hasNextLine()) {
                    String linea = scanner.nextLine();
                    lineas++;

                    String[] palabrasEnLinea = linea.split(" ");
                    palabras += palabrasEnLinea.length;
                    for (String palabra : palabrasEnLinea) {
                        caracteres += palabra.length();
                        contadorPalabras.put(palabra, contadorPalabras.getOrDefault(palabra, 0) + 1);
                    }
                }

                System.out.println("Línies totals: " + lineas);
                System.out.println("Nombre de paraules: " + palabras);
                System.out.println("Nombre de caràcters: " + caracteres);

                top10(contadorPalabras);

            } catch (FileNotFoundException e) {
                System.out.println("El archivo no existe: " + archivo.getName());
            } catch (Exception e) {
                System.out.println("Error no detectado :"+e );
            }

        }
    }

    /**
     * Imprime las 10 palabras más comunes junto con su frecuencia.
     * @param contadorPalabras el mapa que contiene las palabras y su frecuencia
     */
    public static void top10(Map<String, Integer> contadorPalabras) {
        ArrayList<Map.Entry<String, Integer>> listaPalabras = new ArrayList<>(contadorPalabras.entrySet());

        listaPalabras.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("Les 10 paraules més comunes són:");
        System.out.printf("%12s %12s\n", "Paraula", "Vegades");
        for (int i = 0; i < 10 && i < listaPalabras.size(); i++) {
            Map.Entry<String, Integer> palabra = listaPalabras.get(i);
            System.out.printf("%12s %12d\n", "'" + palabra.getKey() + "'", palabra.getValue());
        }
    }

}
