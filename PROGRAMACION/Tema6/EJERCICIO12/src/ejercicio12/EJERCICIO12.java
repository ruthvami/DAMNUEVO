/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char el = 0;
        int cambio = 0;
        int num, lugar = 0;

        int array[] = new int[10];

        while (cambio == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nElige una opcion :\n a) Mostrar valores \n b) Introducir valor\n c) Salir ");
            el = sc.nextLine().charAt(0);

            switch (el) {
                case 'a':
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                    }
                    break;
                case 'b':
                    System.out.println("¿Que número quieres introducir?");
                    num = sc.nextInt();
                    System.out.println("¿Donde quieres introducir el número?");
                    lugar = sc.nextInt();
                    array[lugar] = num;
                    break;
                case 'c':
                    cambio++;
                    break;

            }
        }

    }
}

