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
    public static void main(String[] args) {
        // TODO code application logic here

//            File archivo = new File("C:/Users/ruthv/Documents/DAMNUEVO/PROGRAMACION/Tema11/B7Ruth/Llibres/lazarillo.txt");
        File archivo = new File("Llibres");
        File[] a = archivo.listFiles();
        System.out.println("***Diccionario dels Llibres***");
        System.out.println("----------------------------------");
        for (int i = 0; i < a.length; i++) {
            File file = a[i];
            try {
                Scanner sc = new Scanner(file);

                ArrayList let = new ArrayList();
                Map<Character, Integer> nue = new HashMap<Character, Integer>();
                int lineas = 0;
                int palabras = 0;
                int caracteres = 0;

                while (sc.hasNextLine()) {
                    String linea = sc.nextLine();
                    lineas++;

                    Scanner sclin = new Scanner(linea);
                    while (sclin.hasNext()) {
                        String palabra = sclin.next();
                        palabras++;
                        caracteres += palabra.length();
                        let.add(caracteres);
                    }
                    for (int j = 0; j < let.size(); j++) {
                        for (char letra = 'a'; letra < 'Z'; letra++) {
                            if (let.contains(j)) {
                                nue.put(letra, 1);
                            }

                        }
                    }
                    sclin.close();
                }

                System.out.println("Llibre: " + file.getName());
                System.out.println("Línies totals: " + lineas);
                System.out.println("Nombre de paraules: " + palabras);
                System.out.println("Nombre de caràcters: " + caracteres);
                System.out.println("Les 10 paraules més comunes són:");
                System.out.println("----------------------------------");
                
                sc.close();

            } catch (FileNotFoundException e) {
                System.out.println("El archivo no existe.");
            }
        }
    }
}
