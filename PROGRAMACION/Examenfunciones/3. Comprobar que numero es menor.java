/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_03;


import java.util.Scanner;

public class Ejercicio_03 {

    public static int minimo(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int x, y, min;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        x = entrada.nextInt();
        System.out.print("Introduce un número: ");
        y = entrada.nextInt();
        min = minimo(x, y);
        System.out.println("El minimo es: " + min);

    }
}