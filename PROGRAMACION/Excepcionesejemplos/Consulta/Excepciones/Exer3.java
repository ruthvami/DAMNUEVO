/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author AiA
 */
public class Exer3 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] vector = new double[5];

        for (int i = 0; i < vector.length; i++) {
            try {
                System.out.print("Valor de la posició " + i + " ? ");
                vector[i] = in.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("El valor introduït és incorrecte: " + e + "\nIntrodueix un nou valor ...");
//                e.printStackTrace();
                in.nextLine();
                i--;
            }
        }
        mostrarVector(vector);
    }

    public static void mostrarVector(double[] v) {
        System.out.print("Dades del vector [ ");
        for (int j = 0; j < v.length; j++) {
            System.out.print(v[j] + ", ");
        }
        System.out.println("\b\b ]");   // "ñapa" per a eliminar l'última coma
    }
}
