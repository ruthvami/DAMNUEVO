/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class B2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String archivo = "alumnes_notes.txt";

        ArrayList alumnos = new ArrayList();
        try {
            Scanner scanner = new Scanner(new File(archivo));
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] datos = linea.split(" ");
                if (datos.length < 3) {
                    System.out.println("Error en la estructura de datos: " + linea);
                    continue;
                }
                String nombre = datos[0];
                String apellido = datos[1];
                ArrayList<Integer> notas = new ArrayList<>();
                for (int i = 2; i < datos.length; i++) {
                    try {
                        notas.add(Integer.parseInt(datos[i]));
                    } catch (NumberFormatException e) {
                        System.out.println("Error en el formato de la nota: " + datos[i]);
                        notas.clear();
                        break;
                    }
                }
                if (!notas.isEmpty()) {
                    alumnos.add(nombre + " " + apellido + " " + notas);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo " + archivo);
            e.printStackTrace();
            return;
        }

        Collections.sort(alumnos);

        for (int i = 0; i < alumnos.size(); i++) {

            System.out.println(alumnos.get(i));

        }
    }
}
