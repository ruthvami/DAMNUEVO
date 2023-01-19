/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 0, num2 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num1 = sc.nextInt();

        System.out.println("Introduce otro número mayor que el anteriror");
        num2 = sc.nextInt();
        System.out.println("");

        int num[] = new int[num2];

        for (int i = 0; num1 <= num2; i++) {
            num[i] = num1;
            num1++;
            System.out.print(num[i] + " ");

        }

    }

}
