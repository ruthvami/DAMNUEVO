/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_02;


import java.util.Scanner;

public class Ejercicio_02 {

    public static boolean esMayorEdad(int a) {
        if (a >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int x;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        x = entrada.nextInt();

        if (esMayorEdad(x)) {
            System.out.println("Eres mayor de edad");

        } else {
            System.out.println("No eres mayor de edad");
        }
    }

}