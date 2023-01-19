/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num, num4 = 0;
        int igual = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        num = sc.nextDouble();

        double array[] = new double[100];
        for (int i = 0; i < array.length; i++) {
            num4 = (double) Math.random();
            if (num4 >= num) {
                igual++;
            }
            System.out.println(num4);
        }
        System.out.println("El número de números mas mayores o iguales " + igual);
    }
}
