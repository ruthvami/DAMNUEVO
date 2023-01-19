/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso2;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class REPASO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 0,espacio = 12;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la largaria de la serpiente: ");
        num = sc.nextInt();

        for (int i = 0; i <= espacio; i++) {   // se puede poner tambien (" ".repeat(espacios )
            System.out.print(" ");
        }
        System.out.println("@");
        
        int randm;
        
        for (int i = 0; i <= num; i++) {
            randm = (int) (Math.random() * 3) - 1;
            for (int j = 0; j <= espacio + randm; j++) {
                System.out.print(" ");

            }
            System.out.println("*");

            espacio += randm;
        }
    }

}
