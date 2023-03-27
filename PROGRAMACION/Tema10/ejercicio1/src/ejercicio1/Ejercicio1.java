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
    public static void main(String[] args) throws Exception {
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
//        int MIN = 1, MAX1 = 100, MAX2 = 10, pos=0;
//        int N = MIN + (int) (Math.random() * (MAX1 - MIN + 1));
//        int[] vector = new int[N];
//        for (int i = 0; i < vector.length; i++) {
//            vector[i] = MIN + (int) (Math.random() * (MAX2 - MIN + 1));
//        }
//       do{
//            try {
//                System.out.println("Que posicion quieres enseñar: (array: 0-"+(N-1)+")");
//                pos = sc.nextInt();
//                if(pos>=0) System.out.println("Valor : "+vector[pos]);
//            } catch (InputMismatchException e) {
//                System.out.println("Error al introducir un numero");
//            }catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Numero fuera de rango ");
//            }catch(Exception e){
//                System.out.println("Error no previsto");
//            }
//
//        }while(pos>=0);
//ejercicio6
        try {
            Gat g1 = new Gat("P", 3);
            g1.imprimir();
            g1.setEdat(-6);
            g1.setNom("Alte");
            g1.imprimir();
            
        } catch (InputMismatchException e) {
            System.out.println("Error al introducir un numero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Gat g1 = new Gat("aaaaaa", 3);
            g1.imprimir();
            g1.setEdat(-6);
            g1.setNom("Alte");
            g1.imprimir();
            
        } catch (InputMismatchException e) {
            System.out.println("Error al introducir un numero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Gat g2 = new Gat("Pepe3", 3);
            g2.imprimir();
            g2.setEdat(-3);
            g2.imprimir();
        } catch (InputMismatchException e) {
            System.out.println("Error al introducir un numero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

//    public static void mostrar(double v[]) {
//        System.out.println(Arrays.toString(v));
//    }
}
