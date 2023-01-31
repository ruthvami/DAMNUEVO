/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado_magico;

import java.util.Scanner;

/**
 *
 * @author raquel
 */
public class Cuadrado_magico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n = 0;
        do {
            System.out.print("Introduzca dimensión de la matriz a evaluar: ");
            n = entrada.nextInt();
        } while (n < 1); //nos protegemos de números negativos

        int[][] matriz = new int[n][n]; //para calcular el cuadrado mágico la matriz debe ser cuadrada
        leermatriz(matriz);

        if (comprobar(matriz)) {
            System.out.println("Es cuadrado mágico");
        } else {
            System.out.println("No es cuadrado mágico");
        }
    }

    /**
     * leermatriz: función que lee datos de teclado y los introduce en la matriz
     * in: tantos números enteros como se necesiten según el tamaño de la matriz
     * out: void
     */
    static void leermatriz(int[][] matriz) {
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) { //podríamos volver a utilizar matriz.length puesto que la matriz es cuadrada
                System.out.print("Introduzca elemento fila " + i + " columna " + j + ": ");
                matriz[i][j] = entrada.nextInt();
            }
        }
    }

    /**
     * comprobar: función que comprueba si la suma de los elementos de cada
     * fila, columna o diagonal devuelve el mismo valor. Si es así, devolverá
     * true, si no, false. in: la matriz a comprobar out: true o false
     */
    static boolean comprobar(int[][] matriz) {
        int sum = 0, sumaInicial = 0;

        if (matriz.length == 1) { //si la dimensión de la matriz es 1, directamente ya es cuadrado mágico y la función devuelve true.
            return true;
        } else {
            //HORIZONTALES
            for (int i = 0; i < matriz.length; i++) {
                sum = 0; //para cada fila inicializo la suma

                for (int j = 0; j < matriz[0].length; j++) {
                    sum += matriz[i][j];
                }

                if (i == 0) {
                    sumaInicial = sum; //me guardo la suma de la primera fila para poder comparar con las demás
                }
                if (sumaInicial != sum) {  // si para alguna fila no se cumple, ya no hace falta que sigamos comprobando, la matriz ya no será cuadrado mágico
                    return false;
                }
            }

            //VERTICALES
            for (int i = 0; i < matriz[0].length; i++) {
                sum = 0; //para cada columna inicializo la suma

                for (int j = 0; j < matriz.length; j++) {
                    sum += matriz[j][i];
                }
                if (sumaInicial != sum) { // si para alguna columna no se cumple, ya no hace falta que sigamos comprobando, la matriz ya no será cuadrado mágico
                    return false;
                }
            }

            //DIAGONALES PRINCIPALES
            sum = 0;
            for (int i = 0; i < matriz.length; i++) {
                sum += matriz[i][i];
            }

            if (sumaInicial != sum) {
                return false;
            }

            sum = 0;
            for (int i = 0; i < matriz.length; i++) {
                sum += matriz[i][matriz.length - i - 1];
            }

            if (sumaInicial != sum) {
                return false;
            }
            return true; //si hemos llegado hasta aquí es que todas las filas, columnas y diagonales suman lo mismo
        }
    }
}
