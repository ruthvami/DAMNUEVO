/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        ejercicio1
        Scanner sc = new Scanner(System.in);
//        int a;
//        try{
//            System.out.println("Introduce un valor entero:");
//            a=sc.nextInt();
//            
//            System.out.println("Valor introducido: "+a);
//        }
//        catch (InputMismatchException e){
//                System.out.println("***Valor introducido incorrecto");
//        }
//ejercicio2
//        int a, b;
//        try {
//            System.out.println("Introduce un valor entero:");
//            a = sc.nextInt();
//            System.out.println("Introduce otro valor entero:");
//            b = sc.nextInt();
//            double res = a / b;
//            System.out.println("Resultado " + res);
//        } catch (InputMismatchException e) {
//            System.out.println("***Valor introducido incorrecto");
//        }catch (ArithmeticException e) {
//            System.out.println("***No se puede dividi entre 0");
//        }
// ejercicio3
//        double v[] = new double[5];
//        
//
//        for (int i = 0; i < v.length; i++) {
//            try {
//                System.out.println("Introduce un valor: ");
//                v[i] = sc.nextDouble();
//
//            } catch (InputMismatchException e) {
//                System.out.println("Error al introducir un numero");
//                sc.next();
//                i--;
//
//            }
//
//        }
//        mostrar(v);
//ejercicio4
        int MIN = 1, MAX1 = 10, MAX2 = 100, pos;
        int N = MIN + (int) (Math.random() * (MAX1 - MIN + 1));
        int[] vector = new int[N];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = MIN + (int) (Math.random() * (MAX2 - MIN + 1));
        }
        for (int i = 0; i < vector.length; i++) {
            try {
                System.out.println("Que posicion quieres enseñar: (array:"+vector.length+")");
                pos = sc.nextInt();
                if (pos < 0) {
                  
                }
                System.out.println(vector[i]);
            } catch (InputMismatchException e) {
                System.out.println("Error al introducir un numero");
            }
//catch ( e) {
//                System.out.println("Error al introducir un numero");
//            }

        }
    }

//    public static void mostrar(double v[]) {
//        System.out.println(Arrays.toString(v));
//    }
}
