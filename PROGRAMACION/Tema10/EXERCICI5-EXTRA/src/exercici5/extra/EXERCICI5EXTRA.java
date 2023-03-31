/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici5.extra;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author ruthv
 */
public class EXERCICI5EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int p = 0, n = 0;
        for (int i = 0; i < 5; i++) {

            try {

                System.out.println("Introduce un numero positivo:");
                p = sc.nextInt();
                imprimeixPositiu(p);

            } catch (InputMismatchException e) {
                System.out.println("Error detectado: " + e.toString());
                sc.nextLine();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            try {
                System.out.println("Introduce un numero negativo:");
                n = sc.nextInt();
                imprimeixNegatiu(n);

            } catch (InputMismatchException e) {
                System.out.println("Error detectado: " + e.toString());
                sc.nextLine();
            } catch (Exception e) {
                System.out.println(e.toString());
            }

        }
    }
//La función imprimeixPositiu si es negativo el numero lanza un error
//      *Devuelve:es un void por lo que no devuelve nada
//      *Parámetros de entrada:
//          -int p:numero para identificar

    public static void imprimeixPositiu(int p) throws Exception {
        if (p < 0) {
            throw new Exception("El numero introducido no es positivo");
        }System.out.println("Numero: "+p);
    }
//La función imprimeixNegatiu si es positivo el numero lanza un error
//      *Devuelve:es un void por lo que no devuelve nada
//      *Parámetros de entrada:
//          -int n:numero para identificar

    public static void imprimeixNegatiu(int n) throws Exception {
        if (n >= 0) {
            throw new Exception("El numero introducido no es negativo");
        }
        System.out.println("Numero: "+n);
    }
}
