/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author rutvac
 */
public class EJERCICIO9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        int igual = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        num = sc.nextInt();

        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9 + 1);
            System.out.println(array[i]);

//        }
//        for (int j = 0; j < array.length; j++) {
            if (num == array[i]) {
                System.out.println("se encuentra en el "+i);
            }
        }

    }

}
