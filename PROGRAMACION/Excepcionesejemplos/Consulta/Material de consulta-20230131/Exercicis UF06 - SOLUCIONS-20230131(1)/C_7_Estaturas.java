/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/

package c_7_estaturas;

/**
 * Programa que calcule la estatura media, mínima y máxima en centímetros de personas
 * de diferentes países. El array que contiene los nombres de los paises es el siguiente: 
 * pais = {"España", "Rusia", "Japón", "Australia"}. 
 * 
 * Los datos sobre las estaturas se deben simular mediante un array de 4 filas por 
 * 10 columnas con números aleatorios generados al azar entre 140 y 210. Los decimales 
 * de la media se pueden despreciar. 
 * 
 * Los nombres de los países se deben mostrar utilizando el array de países (no se pueden
 * escribir directamente).
 */

public class C_7_Estaturas {
  
  public static void main(String[] args) {

    final int COLUMNAS = 10;
    final int ALEATORIO_INICIAL = 140;
    final int ALEATORIO_FINAL = 210;
    final String[] PAIS = {"España", "Rusia", "Japón", "Australia"};      
    
    int[][] estatura = new int[PAIS.length][COLUMNAS];   // habrá tantas filas como países
    int[] minimo = new int[PAIS.length];    // mínimos de cada país 
    int[] maximo = new int[PAIS.length];    // máximos de cada país
    int[] sumatorio = new int[PAIS.length]; // sumas de las estaturas de cada país
    
    // inicializamos sumatorios, mínimos y máximos
    for (int i = 0; i < PAIS.length; i++) {
      sumatorio[i] = 0;
      minimo[i] = Integer.MAX_VALUE;    // el mínimo inicial será el mayor INT posible
      maximo[i] = Integer.MIN_VALUE;    // el máximo inicial será el menor INT posible
    }
    
    // Cabecera tabla
    System.out.println(" ".repeat(16 + COLUMNAS*4) + "MED MÍN MÁX");
    
    // Generamos las estaturas y a la vez buscamos mínimos, máximos, hacemos sumatorios y escribimos
    for (int fila = 0; fila < PAIS.length; fila++) {
      
      // mostramos el país
      System.out.printf("%12s: ", PAIS[fila]);

      // generamos tantas estaturas como columnas
      for (int columna = 0; columna < COLUMNAS; columna++) {
        
        // generamos estatura y la mostramos
        estatura[fila][columna] = ALEATORIO_INICIAL +   
                                  (int)(Math.random() * (ALEATORIO_FINAL - ALEATORIO_INICIAL + 1));
        System.out.printf("%3d ", estatura[fila][columna]);
        
        // actualizamos cálculos
        sumatorio[fila] += estatura[fila][columna];     // actualizamos sumatorio (para calcular la media)   
        maximo[fila] = Math.max(maximo[fila], estatura[fila][columna]); // ¿nuevo máximo?
        minimo[fila] = Math.min(minimo[fila], estatura[fila][columna]); // ¿nuevo mínimo?
      }
      
      // mostramos media, mínimo y máximo
      System.out.printf("| %3d %3d %3d\n", sumatorio[fila] / COLUMNAS, minimo[fila], maximo[fila]);
    }
    
  }

}
