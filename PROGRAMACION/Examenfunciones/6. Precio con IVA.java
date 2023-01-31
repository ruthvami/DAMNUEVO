/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_06;


import java.util.Scanner;

public class Ejercicio_06 {

    public static double precioConIVA(double precio) {
        return (precio * 1.21);
    }

    public static void main(String[] args) {
        double precioSin, precioCon;
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Precio sin IVA: ");
            precioSin = entrada.nextDouble();
            precioCon = precioConIVA(precioSin);
            System.out.println("Precio con IVA: " + precioCon);
        }
    }
}