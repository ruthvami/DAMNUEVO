/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temp;

import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;

/**
 *
 * @author rutvac
 */
public class Temp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int j = 0, puntos = 0;

        String[] mes = {"Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Decembre"};
        int temperatura[] = new int[12];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 12; i++) {
            System.out.println("Introduce la temperatura media de " + mes[j] + " mes del año: ");
            int grados = sc.nextInt();
            temperatura[i] = grados;
            j++;

        }

        for (int i = 0; i < 12; i++) {
            System.out.print(mes[i] + "|");
            while (puntos < temperatura[i]) {
                System.out.print("*");
                puntos++;

            }
            puntos = 0;
            System.out.println(temperatura[i] + "ºC");

        }

    }

}
