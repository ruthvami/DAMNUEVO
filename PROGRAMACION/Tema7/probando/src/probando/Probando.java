/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probando;

import java.util.Scanner;
/**
 *
 * @author ruthv
 */
public class Probando {



public class CuadradoMagico {
    public static void main(String[] args) {
        int n = leerDimensión();
        int[][] matriz = leerMatriz(n);
        if (comprobar(matriz)) {
            System.out.println("La matriz es un cuadrado mágico");
        } else {
            System.out.println("La matriz no es un cuadrado mágico");
        }
    }

    public static int leerDimensión() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduce la dimensión de la matriz (debe ser un número entero positivo): ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

    public static int[][] leerMatriz(int n) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[n][n];
        System.out.println("Introduce los valores de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }

    public static boolean comprobar(int[][] matriz) {
        int n = matriz.length;
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += matriz[0][i];
        }
        int sumaFila, sumaColumna, sumaDiagonal;
        for (int i = 0; i < n; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < n; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }
            if (sumaFila != suma || sumaColumna != suma) {
                return false;
            }
        }
        sumaDiagonal = 0;
        for (int i = 0; i < n; i++) {
            sumaDiagonal += matriz[i][i];
        }
        if (sumaDiagonal != suma) {
            return false;
        }
        sumaDiagonal = 0;
        for (int i = 0; i < n; i++) {
            sumaDiagonal += matriz[i][n - 1 - i];
        }
        if (sumaDiagonal != suma) {
            return false;
        }
        return true;
    }
}}
