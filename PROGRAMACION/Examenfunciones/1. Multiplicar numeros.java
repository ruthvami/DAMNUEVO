/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_01;


import java.util.Scanner;

public class Ejercicio_01 {

    public static double multiplica(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        double x, y, res;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número real: ");
        x = entrada.nextDouble();
        System.out.print("Introduce un número real: ");
        y = entrada.nextDouble();
//        res = multiplica(x, y);
        System.out.println("Resultado: " + multiplica(x, y));
    }

}