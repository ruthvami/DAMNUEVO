/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quadrat.magic;

import java.util.Scanner;

/**
 *
 * @author ruthv
 */
public class QUADRATMAGIC {

    public static void llegirmatriu(int[][] matriu) {
        System.out.println("Introduce valores:");
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu.length; j++) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Para la fila " + (i + 1) + ", columna " + (j + 1) + ":");
                matriu[i][j] = sc.nextInt();
            }

        }
    }

    public static boolean comprovar(int[][] matriu) {
        boolean compr = true;
        int fil = 0, colum = 0, diagonal = 0, suma = 0, diagonalin = 0;

        for (int i = 0; i < matriu.length; i++) {
            suma += matriu[0][i];
        }
        for (int i = 0; i < matriu.length; i++) {
            fil = 0;
            colum = 0;
            for (int j = 0; j < matriu.length; j++) {
                fil += matriu[i][j];
                colum += matriu[j][i];
            }

        }

        for (int i = 0; i < matriu.length; i++) {
            diagonal += matriu[i][i];
            diagonalin += matriu[i][matriu.length - i - 1];
        }
        if (fil != suma || colum != suma || diagonal != suma) {
            compr = false;
        }
        return compr;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int dim;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la dimensión de la matriz:");
        dim = sc.nextInt();

        while (dim <= 1) {
            System.out.println("ERROR");
            System.out.println("Introduce la anchura de la matriz:");
            dim = sc.nextInt();

        }
        int quadrat[][] = new int[dim][dim];

        llegirmatriu(quadrat);

        if (comprovar(quadrat) == true) {
            System.out.println("SI es un cuadrado magico");
        } else {
            System.out.println("NO es un cuadrado magico");
        }
    }

}
