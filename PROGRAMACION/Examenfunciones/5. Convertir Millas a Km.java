/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_05;


import java.util.Scanner;

public class Ejercicio_05 {

    public static double millas_a_kilometros(int millas) {
        return 1.60934 * millas;
    }

    public static void main(String[] args) {
        int millas; 
        double km;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce las millas: ");
        millas = entrada.nextInt();
        km = millas_a_kilometros(millas);
        System.out.println("Kilómetros: " + km);

    }
}