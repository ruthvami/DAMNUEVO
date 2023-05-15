/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author AiA
 */
public class Exer4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = (int) (Math.random() * 100 + 1);
        int[] vector = new int[N];

        System.out.println("El vector té una grandaria de: " + N);
        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 10 + 1);
        }

        int valor = 0;
        do {
            try {
                System.out.println("Introdueix la posició del vector a mostrar: (negatiu per a eixir)");
                valor = in.nextInt();
                if (valor >= 0) {
                    System.out.println("Valor en el vector: " + vector[valor]);
                }
                in.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Valor introduït incorrecte");
                in.nextLine();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posició fora dels límits del vector");

            }

        } while (valor >= 0);
        System.out.println("Fi del programa");
    }
}
