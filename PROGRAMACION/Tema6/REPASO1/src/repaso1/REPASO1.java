/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso1;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class REPASO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char letra;
        int num = 0;

        while (num != 1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce una letra");
            letra = sc.nextLine().charAt(0);
            letra=Character.toLowerCase(letra);

            if (letra == 'a') {
                System.out.println("VOCAL");
            } else if (letra == 'e') {
                System.out.println("VOCAL");
            } else if (letra == 'i') {
                System.out.println("VOCAL");
            } else if (letra == 'o') {
                System.out.println("VOCAL");
            } else if (letra == 'u') {
                System.out.println("VOCAL");
            } else if (letra == ' ') {
                num = 1;
            } else {
                System.out.println("NO VOCAL");
            }
        }

    }
}
