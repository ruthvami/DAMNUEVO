package ejemplosexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class Ejemplosexcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
////1
//        int div, x, y;
//
//        x = 3;
//        y = 0;
//        
//        div = x / y;
//        
//        System.out.println("El resultado es " + div);
//
////2
//        String cadena = "56s";
//        int num;
//        num = Integer.parseInt(cadena);
//        System.out.println("El numero es " + num);
//
////3
//          int v[]={1,2,3};
//          int elem;
//          
//          elem=v[5];
//          
//          System.out.println("El elemento es "+elem);
        int div, x, y;
        Scanner sc = new Scanner(System.in);
        int v[] = {1, 2, 3,};

        try {
            System.out.println("Introduce el valor del nominador");
            x = sc.nextInt();
            System.out.println("Introduce el valor del denominador");
            y = sc.nextInt();
            div = x / y;
            System.out.println("El resultado es "+div );
            System.out.println("Que posicion quieres enseñar");
            System.out.println("El numero es "+v[sc.nextInt()]);

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("El numero introducido esta fuera del rango");
        } catch (InputMismatchException e) {
            System.out.println("No se puede añadir un valor diferente a un int");
        } finally {
            System.out.println("Fin del programa");
        }

    }

}
