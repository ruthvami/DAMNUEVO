/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int V = 0, Inc = 0, N = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero inicial :");
        V = sc.nextInt();

        System.out.println("Introduce un Inc. :");
        Inc = sc.nextInt();

        System.out.println("Introduce un numero maximo :");
        N = sc.nextInt();

        int array[] = new int[N];

        array[0] = V;

        for (int i = 0; i < array.length; i++) {

            array[i] = V + Inc;
            System.out.print(array[i] + " ");
            V = V + Inc;
                    System.out.println(Arrays.toString(array));

        }
    }
}