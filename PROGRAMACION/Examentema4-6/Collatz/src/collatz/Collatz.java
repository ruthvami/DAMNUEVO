/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collatz;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class Collatz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        num = sc.nextInt();

        while (num != 1) {

            if (num > 1) {
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = (num * 3) + 1;
                }
                System.out.print(num + "   ");
            } else {
                System.err.println("Error");
                System.out.println("Introduce un número: ");
                num = sc.nextInt();
            }
        }
    }

}
