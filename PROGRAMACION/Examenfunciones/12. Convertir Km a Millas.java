/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_12;


import java.util.Scanner;

public class Ejercicio_12 {

    public static double kilometros_a_millas(double km) {
        return (km / 1.60934);
    }

    public static void main(String[] args) {
        double millas, km;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las millas: ");
        millas = sc.nextDouble();
        
        km = kilometros_a_millas(millas);
        
        System.out.println("Kilómetros: " + km);
    }
}