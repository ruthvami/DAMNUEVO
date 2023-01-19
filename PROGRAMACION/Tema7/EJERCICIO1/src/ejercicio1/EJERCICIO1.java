/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static double multiplica(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        a = sc.nextDouble();
        System.out.println("Introduce otro numero:");
        b = sc.nextDouble();
        System.out.println("La multiplicacion de los numeros " + a + " y " + b + " es " + multiplica(a, b));
    }

}
