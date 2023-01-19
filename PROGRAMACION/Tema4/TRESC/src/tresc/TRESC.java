/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tresc;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class TRESC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N = 0, M = 0, num, mayor = 0, menor = 0, igual = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero de filas:");
        N = sc.nextInt();

        System.out.println("Introduce un numero de columnas:");
        M = sc.nextInt();

        int matriz[][] = new int[N][M];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduce un numero:");
                num = sc.nextInt();
                matriz[i][j] = num;
                if (num > 0) {
                    mayor++;
                } else if (num < 0) {
                    menor++;
                } else {
                    igual++;
                }
            }

        }
        System.out.println("Se han introducido " + mayor + " numeros mayores que 0 \n" + "Se han introducido " + menor + " numeros menores que 0 \n"
                + "Se han introducido " + igual + " numeros igual que 0 \n");
    }
}
