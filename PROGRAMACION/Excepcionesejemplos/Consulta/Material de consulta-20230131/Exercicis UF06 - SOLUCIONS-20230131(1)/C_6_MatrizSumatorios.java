package c_6_matrizsumatorios;

/**
 * Programa que genera 20 números enteros aleatorios entre 100 y 999 y 
 * los introduce en un array de 4 filas por 5 columnas. 
 * 
 * Después mostrará el array con las sumas parciales de filas y columnas
 * igual que si de una hoja de cálculo se tratara. 
 * 
 * La suma total debe aparecer en la esquina inferior derecha.
 * 
 */

public class C_6_MatrizSumatorios {

  public static void main(String[] args) {
    final int FILAS = 4;
    final int COLUMNAS = 5;
    final int ALEATORIO_INICIAL = 100;
    final int ALEATORIO_FINAL = 999;
    int[][] numeros = new int[FILAS][COLUMNAS]; // array de números aleatorios

    // Introduce valores aleatorios en el array
    for(int fila = 0; fila < FILAS; fila++) {
      for(int columna = 0; columna < COLUMNAS; columna++) {
        numeros[fila][columna] = ALEATORIO_INICIAL + 
                            (int)(Math.random() * (ALEATORIO_FINAL - ALEATORIO_INICIAL + 1));
      }
    }

    // Muestra los datos y las sumas parciales de las filas
    for(int fila = 0; fila < FILAS; fila++) {
      int sumaFila = 0;
      for(int columna = 0; columna < COLUMNAS; columna++) { // valores de la fila
        System.out.printf("%7d   ", numeros[fila][columna]);
        sumaFila += numeros[fila][columna];
      }
      System.out.printf("|%7d\n", sumaFila);    // suma de la fila
    }
    
    // Pone separador de la fila de resultados
    for(int columna = 0; columna < COLUMNAS; columna++) {
      System.out.print("----------");
    }
    System.out.println("-----------");

    // Muestra las sumas parciales de las columnas
    int sumaTotal = 0;
    
    for(int columna = 0; columna < COLUMNAS; columna++) {
      int sumaColumna = 0;
      for(int fila = 0; fila < FILAS; fila++) {
        sumaColumna += numeros[fila][columna];
      }
      sumaTotal += sumaColumna;
      System.out.printf("%7d   ", sumaColumna);
    }
    
    // Muestra suma total
    System.out.printf("|%7d   %n", sumaTotal);
  }
}
