package exer12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @source
 * http://puntocomnoesunlenguaje.blogspot.com/2020/06/excepciones-en-java-con-ejemplos.html
 */
public class Exer12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = 0;
        int posicio = 0;
        String cadena;
        boolean repetir;
        double[] valors = {9.83, 4.5, -3.06, 0.06, 2.52, -11.3, 7.60, 3.00, -30.4, 105.2};

        System.out.println("Contingut de l'array abans de modificar:");
        for (int i = 0; i < valors.length; i++) {
            System.out.printf("%.2f ", valors[i]);
        }

        do {
            repetir = false;
            try {
                System.out.print("\n\nIntrodueix la posició de l'array a modificar: ");
                cadena = sc.nextLine();
                posicio = Integer.parseInt(cadena); // NumberFormatException

                System.out.print("\nIntrodueix el nou valor de la posició " + posicio + ": ");
                n = sc.nextDouble();    // InputMismatchException

                valors[posicio] = n;    // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Índex incorrecte: " + e);
                repetir = true;
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Tipus incorrecte: " + e);
                repetir = true;
                sc.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Format incorrecte: " + e);
                repetir = true;
            } catch (Exception e) {
                System.out.println(e.toString());
                repetir = true;
            }
        } while (repetir);

        System.out.println("\nPosició a modificar " + posicio);
        System.out.println("Nou valor: " + n);
        System.out.println("Contingut de l'array modificat:");
        for (int i = 0; i < valors.length; i++) {
            System.out.printf("%.2f ", valors[i]);
        }

    }
}
