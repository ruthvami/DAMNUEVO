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
                matriu[i][j] = sc.nextInt();                            //rellena la matriz con los numeros introducidos
            }

        }
    }

    public static boolean comprovar(int[][] matriu) {
        boolean compr = true;
        int fil = 0, colum = 0, diagonal = 0, suma = 0, diagonalin = 0;

        for (int i = 0; i < matriu.length; i++) {
            suma += matriu[0][i];                       //rellena la variable suma con la suma de todos los numeros de la matriz
        }
        for (int i = 0; i < matriu.length; i++) {
            fil = 0;
            colum = 0;
            for (int j = 0; j < matriu.length; j++) {
                fil += matriu[i][j];                    //rellena la variable con la suma de las filas
                colum += matriu[j][i];                  //rellena la variable con la suma de las columnas
            }

        }

        for (int i = 0; i < matriu.length; i++) {
            diagonal += matriu[i][i];                   //rellena la variable con la suma de la diagonal(\)
            diagonalin += matriu[i][matriu.length - i - 1];//rellena la variable con la suma de la diagonal(/)
        }
        if (fil != suma || colum != suma || diagonal != suma) {  //comprueba que si no coinciden la suma de los numeros en todas las direcciones
            compr = false;                                       //devuelve falso 
        }
        return compr;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int dim;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la dimensión de la matriz:");
        dim = sc.nextInt();

        while (dim <= 1) {                                                  //Para detectar que se ha introducido un numero positivo y diferente al 1
            System.out.println("ERROR");
            System.out.println("Introduce la anchura de la matriz:");
            dim = sc.nextInt();

        }
        int quadrat[][] = new int[dim][dim];

        llegirmatriu(quadrat);

        if (comprovar(quadrat) == true) {                                   //comprueba que sea cuadrado magico o no
            System.out.println("SI es un cuadrado magico");
        } else {
            System.out.println("NO es un cuadrado magico");
        }
    }

}
