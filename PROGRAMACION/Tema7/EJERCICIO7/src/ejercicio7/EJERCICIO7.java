/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO7 {

    /**
     * @param args the command line arguments
     */
    public static double perimetre(double a, double b) {
        return 2 * (a + b);
    }

    public static double area(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ancho de un rectangulo : ");
        a = sc.nextInt();
        System.out.println("Introduce la altura de un rectangulo : ");
        b = sc.nextInt();
        System.out.println("El perimetro es : " + perimetre(a, b));
        System.out.println("El area es :" + area(a, b));
    }

}
