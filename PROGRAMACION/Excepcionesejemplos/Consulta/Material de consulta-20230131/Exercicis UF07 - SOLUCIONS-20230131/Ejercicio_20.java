/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_20;


public class Ejercicio_20 {

    public static void tabla_multiplicar(int n) {
        System.out.println("Tabla de multiplicar del " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            tabla_multiplicar(i);
        }
    }
}