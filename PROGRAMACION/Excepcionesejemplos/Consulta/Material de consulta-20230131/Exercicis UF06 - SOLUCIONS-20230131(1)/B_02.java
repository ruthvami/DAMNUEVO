/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b_02;
import java.util.Scanner;

/**
 * 
 * Ejercicio B-02: Crea un programa que pida dos cadenas de texto por 
 * teclado y luego indique si son iguales, además de si son iguales
 * sin diferenciar entre mayúsculas y minúsculas
 * 
 */
public class B_02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe una cadena de texto: ");
        String cadena1 = sc.nextLine();
        System.out.print("Escribe otra cadena de texto: ");
        String cadena2 = sc.nextLine();

        if (cadena1.equals(cadena2)) {
            System.out.println("Las dos cadenas son iguales");
        } else if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Las dos cadenas son iguales, sin diferenciar entre mayúsculas/minúsculas");
        } else {
            System.out.println("Son cadenas diferentes");
        }
        System.out.println();
    }

}