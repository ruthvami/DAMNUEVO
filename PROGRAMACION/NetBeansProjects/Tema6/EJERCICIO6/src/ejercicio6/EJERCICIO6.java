/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N = 0, M = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        N = sc.nextInt();

        int num[] = new int[N];

        System.out.println("Introduce un número, el cual se repetira");
        M = sc.nextInt();
        System.out.println("");
        for (int i = 0; i < num.length; i++) {
            num[i] = M;
            System.out.print(num[i] + " ");
        }

    }

}
