/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO10 {

    /**
     * @param args the command line arguments
     */
    public static String fecha(int a, int b, int c) {
        if (a > 30 || a <= 0 || b > 12 || b <= 0 || c < 0) {
            return "incorrecta";
        }
        return "correcta";
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int dia, mes, anyo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un dia : ");
        dia = sc.nextInt();
        System.out.println("Introduce un mes : ");
        mes = sc.nextInt();
        System.out.println("Introduce un año : ");
        anyo = sc.nextInt();
        System.out.println("La fecha es " + fecha(dia, mes, anyo));
    }
}
