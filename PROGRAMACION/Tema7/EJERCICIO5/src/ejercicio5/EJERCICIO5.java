/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO5 {

    /**
     * @param args the command line arguments
     */
    public static double milles(int milles) {
        return milles * 1.60934;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de millas:");
        a = sc.nextInt();
        System.out.println("En quilometros equivale a " + milles(a) + "km");
    }

}
