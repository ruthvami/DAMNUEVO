
package a;

import java.util.Scanner;

/**
 *
 * @author ruthv
 */
public class A {


public class Main {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Introduce el importe: ");
      double importe = input.nextDouble();

      System.out.print("Introduce el porcentaje de IVA: ");
      double porcentajeIVA = input.nextDouble();

      double resultado = importe * (porcentajeIVA / 100);

      System.out.println("El IVA es: " + resultado);
   }
}}
