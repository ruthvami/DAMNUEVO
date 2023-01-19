/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piramide;

import java.util.Scanner;

/**
 *
 * @author ruth
 */
public class PIRAMIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, tipo, alt = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número de filas que tendrá la piramide: ");
        num = sc.nextInt();

        System.out.println("Si quieres que la piramide sea con * introduce un 1, si quieres que sea con números 2: ");
        tipo = sc.nextInt();

        while ( alt <= num) {

                //espacios en blanco que se dejan para la altura de la piramide
            for (int espacio = 1; espacio <= num - alt; espacio++) {
                System.out.print(" ");
                }
            
            //ancho que tiene la piramide y si se completa con * o números
            for (int asteriscos = 1; asteriscos <= (alt * 2) - 1; asteriscos++) {
                
                if (tipo == 1) {
                    System.out.print("*");
                    
                } else {
                    System.out.print(alt);
                }
            }
            System.out.println();
            alt++;
        }
    }
}
