/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        double num[] = new double[20];
        double suma = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce un número real: ");
            num[i] = sc.nextDouble();
            suma += num[i];

        }
        System.out.println("La media de los números es " + suma / num.length);
    }

}
