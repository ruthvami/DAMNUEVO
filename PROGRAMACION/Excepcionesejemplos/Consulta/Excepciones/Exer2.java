/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author AiA
 */
public class Exer2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;

        try {
            System.out.print("Quin és el valor A? ");
            A = sc.nextInt();
            System.out.print("Quin és el valor B? ");
            B = sc.nextInt();
            System.out.println("A/B = " + A / B);
        } catch (InputMismatchException e) {
            System.out.println("Valor introduït incorrecte: " + e);
//            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("ERROR: No es pot dividir per '0': " + e);
//            e.printStackTrace();
        } finally {
            System.out.println("Fi del programa");
        }
    }
}
