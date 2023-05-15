/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_21;
import java.util.Scanner;

public class Ejercicio_21 {

    public static void main(String args[]) {
        int opcion;
        double radio;
        do {
            opcion = menu();
            switch (opcion) {
                case 0:
                    System.out.println("Terminamos.");
                    break;
                case 1:
                    radio = pideRadio();
                    System.out.println("Circunferencia: " + circunferencia(radio));
                    break;
                case 2:
                    radio = pideRadio();
                    System.out.println("Área: " + area(radio));
                    break;
                case 3:
                    radio = pideRadio();
                    System.out.println("Volumen: " + volumen(radio));
                    break;
                case 4:
                    radio = pideRadio();
                    System.out.println("Circunferencia: " + circunferencia(radio));
                    System.out.println("Área: " + area(radio));
                    System.out.println("Volumen: " + volumen(radio));
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
            System.out.println();
        } while (opcion != 0); // se repite hasta que la opción elegida sea 0, salir
    }

    public static int menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("ELIGE UNA OPCIÓN:");
        System.out.println("1. Circunferencia");
        System.out.println("2. Área");
        System.out.println("3. Volumen");
        System.out.println("4. Todas");
        System.out.println("0. Salir");
        return in.nextInt();
    }

    public static double pideRadio() {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el radio en cm: ");
        return in.nextDouble();
    }

    public static double circunferencia(double r) {
        return r * Math.PI;
    }

    public static double area(double r) {
        return Math.pow(r,2) * Math.PI;
    }

    public static double volumen(double r) {
        return Math.pow(r,3) * Math.PI * 4 / 3;
    }
}