/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_19;


import java.util.Scanner;

public class Ejercicio_19 {

    public static boolean esPitagorica(int x, int y, int z) {
        return Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2);
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Vamos a comprobar si X² + Y² = Z²");
        System.out.print("Valor X: ");
        int x = teclado.nextInt();
        System.out.print("Valor Y: ");
        int y = teclado.nextInt();
        System.out.print("Valor Z: ");
        int z = teclado.nextInt();
        
        boolean pitagorica = esPitagorica(x, y, z);
        
        if (pitagorica) {
            System.out.println("Sí es pitagórica");
        }
        else {
            System.out.println("No es pitagórica");
        }
    }
    
}