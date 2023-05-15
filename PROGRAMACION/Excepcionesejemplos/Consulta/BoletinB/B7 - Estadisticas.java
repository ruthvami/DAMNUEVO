/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b7;

import java.io.*;
import java.util.*;

public class B7 {

    public static void main(String[] args) {

        System.out.println("ESTADÍSTIQUES DE LLIBRES");
        System.out.println("----------------------");
        System.out.println("");

        try {
            File rutaLlibres = new File("Documentos/Llibres");

            File[] llistaLlibres = rutaLlibres.listFiles();

            // Per a cada llibre
            for (File llibre : llistaLlibres) {
                Scanner lector = new Scanner(llibre);

                // Inicialitzem contadors i el HashMap
                int numLinies = 0, numParaules = 0, numCaracters = 0;
                HashMap<String, Integer> mapaParaules = new HashMap<String, Integer>();

                while (lector.hasNext()) {
                    // Línia
                    String linia = lector.nextLine();
                    numLinies++;

                    // Paraules
                    String[] paraules = linia.split(" ");
                    numParaules += paraules.length;

                    // Per cada paraula actualitzem numCaracters i guardem en el HashMap
                    for (String paraula : paraules) {
                        char[] lletres = paraula.toCharArray();
                        numCaracters += lletres.length;

                        // Si ja existeix la paraula, sumem +1. Si no existeix la guardem
                        if (mapaParaules.containsKey(paraula)) {
                            mapaParaules.put(paraula, mapaParaules.get(paraula) + 1);
                        } else {
                            mapaParaules.put(paraula, 1);
                        }
                    }
                }

                System.out.println("Llibre: " + llibre.getName());
                System.out.println("Línies totals: " + numLinies);
                System.out.println("Nombre de paraules: " + numParaules);
                System.out.println("Nombre de caràcters: " + numCaracters);                

                top10(mapaParaules);

                System.out.println("");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: L'arxiu no existeix o és inaccessible");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    private static void top10(HashMap<String, Integer> mapa) {
        ArrayList<Integer> arrayVegades = new ArrayList(mapa.values()); // ArrayList ordenat amb les vegades que apareix cada paraula
        ArrayList<String> arrayParaules = new ArrayList(mapa.keySet()); // ArrayList ordenat amb les paraules

        System.out.println("Les 10 paraules més comunes són: ");
        System.out.println("\tParaula\t\tVegades");

        for (int j = 0; j < 10; j++) {      // Repetim 10 vegades per a buscar les 10 més habituals
            int index = 0;
            int max_valor = 0;

            for (int i = 0; i < arrayVegades.size(); i++) { 
                Integer vegades = arrayVegades.get(i);
                if (vegades > max_valor) {  // Busquem el major valor en arrayVegades 
                    index = i;              // i actualitzem l'index que marca on està la paraula més repetida
                    max_valor = vegades;
                }
            }
            System.out.println("\t'" + arrayParaules.get(index) + "'\t\t" + arrayVegades.get(index));

            arrayParaules.remove(index);    // Esborrem l'index i el valor per a buscar el següent màxim
            arrayVegades.remove(index);
        }
    }
}
