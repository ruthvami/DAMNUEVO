package cinco;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cinco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del archivo de texto: ");
        String nombreArchivo = scanner.nextLine();

        try {
            Map<String, Integer> estadisticas = contarFrecuenciaPalabras(nombreArchivo);
            guardarEstadisticas(estadisticas, "estadisticas.txt");
            imprimir(estadisticas);
            System.out.println("Estadísticas guardadas correctamente.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error al guardar las estadísticas.");
        }
    }

    public static Map<String, Integer> contarFrecuenciaPalabras(String nombreArchivo) throws FileNotFoundException {
        Map<String, Integer> frecuenciaPalabras = new HashMap<>();

        File archivo = new File(nombreArchivo);
        Scanner scanner = new Scanner(archivo);

        while (scanner.hasNext()) {
            String palabra = scanner.next().toLowerCase().replace(".", "");//Cambia el punto por espacio.
            frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
        }
        scanner.close();
        return frecuenciaPalabras;
    }

    public static void guardarEstadisticas(Map<String, Integer> estadisticas, String nombreArchivo) throws IOException {
        FileWriter escritor = new FileWriter(nombreArchivo);

        for (Map.Entry<String, Integer> entrada : estadisticas.entrySet()) {
            escritor.write(entrada.getKey() + " - " + entrada.getValue() + "\n");
        }

        escritor.close();
    }

    public static void imprimir(Map<String, Integer> frecuenciaPalabras) {
        ArrayList<Map.Entry<String, Integer>> m = new ArrayList<>(frecuenciaPalabras.entrySet());//Coje todo lo del HashMap y lo pone dentro del ArrayList
        Collections.sort(m, (a1, a2) -> a2.getValue() - a1.getValue());//orden mayor a menor
        for (Map.Entry<String, Integer> entry : m) {
            System.out.println(entry);
        }
    }
}
