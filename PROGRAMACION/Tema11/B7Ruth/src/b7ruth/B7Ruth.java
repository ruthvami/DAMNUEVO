/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b7ruth;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
         try {
            File archivo = new File("C:/Users/ruthv/Documents/DAMNUEVO/PROGRAMACION/Tema11/B7Ruth/Llibres/lazarillo.txt");
            Scanner sc = new Scanner(archivo);
            ArrayList let=new ArrayList();
            Map<Character, Integer> nue = new HashMap<Character, Integer>();
            int lineas = 0;
            int palabras = 0;
            int caracteres = 0;

            // Leer todas las líneas del archivo
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                lineas++;

                // Contar el número de palabras y caracteres en la línea
                Scanner sclin = new Scanner(linea);
                while (sclin.hasNext()) {
                    String palabra = sclin.next();
                    palabras++;
                    caracteres += palabra.length();
                    let.add(caracteres);
                }
                for (int i = 0; i < let.size(); i++) {
                    for (char letra = 'a'; letra < 'Z'; letra++) {
                        if (let.contains(i)) {
                            nue.put(letra, 1);
                        }
                        
                    }
                }
                sclin.close();
            }

            // Imprimir las estadísticas del archivo
             System.out.println("Llibre: "+archivo.getName());
            System.out.println("Línies totals: " + lineas);
            System.out.println("Nombre de paraules: " + palabras);
            System.out.println("Nombre de caràcters: " + caracteres);
             System.out.println("Les 10 paraules més comunes són:");
             for (int i = 0; i < nue.size(); i++) {
                 System.out.println(nue.get(i));
             }
             
            // Cerrar los scanners
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe.");
        }
    }
}