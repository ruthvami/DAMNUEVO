/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c_02;


/**
 * Ejercicio C_02 Crea un programa que cree una matriz de 10x10 e introduzca
 * los valores de las tablas de multiplicar del 1 al 10
 * (cada tabla en una fila). Luego mostrará la matriz por pantalla.
 */
public class C_02 {

    public static void main(String[] args) {

        int x = 1;
        int m[][] = new int[10][10];
        for (int i = 0; i < m.length; i++) {
            System.out.println("La tabla del " + (i+1) + " es:");
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = x * (j + 1);
                System.out.printf("%d x %d = %d %n",x,(j+1),m[i][j]);
            }
            x++;
            System.out.println("");

        }

    }

}