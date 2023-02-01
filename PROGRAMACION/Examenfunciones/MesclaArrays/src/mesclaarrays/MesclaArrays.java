/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mesclaarrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class MesclaArrays {

    /**
     * @param args the command line arguments
     */
    public static int[] mescla(int[] array1, int[] array2) {
        int nuevo[] = new int[mayor(array1, array2)];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 8) + 2;

        }
        System.out.println(" ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10) + 20;

        }

        System.out.println(" ");
        for (int i = 0; i < mayor(array1, array2); i++) {
            for (int j = 0; j < mayor(array1, array2); j++) {
                if (j % 2 == 0 || j == 0) {
                    nuevo[i] = array1[i];
                } else {
                    nuevo[i] = array2[i];
                }
            }

        }

        return nuevo;
    }

    public static int mayor(int[] array1, int[] array2) {
        int compr;
        if (array1.length > array2.length) {
            compr = array1.length;
        } else {
            compr = array2.length;
        }
        return compr;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int primero, segundo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Que grandaria tendra el 1r array? ");
        primero = sc.nextInt();
        System.out.print("Que grandaria tendra el 2r array? ");
        segundo = sc.nextInt();

        int array1[] = new int[primero];
        int array2[] = new int[segundo];
        mescla(array1,array2);
        System.out.println("La mezcla de los arrays ");
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("es :");
        System.out.println(Arrays.toString(mescla(array1, array2)));
    }

}
