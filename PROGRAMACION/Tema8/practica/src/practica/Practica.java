/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static String comprobar(String x) {
        
    }

    public static void vocal(String x) {
        if (x == "A" || x == "E" || x == "I" || x == "O" || x == "U") {
            System.out.println("Es vocal");
        }else{
            System.out.println("No es vocal");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        String voc = "0";

        while (comprobar(voc) != " ") {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce una letra: ");
            voc = sc.nextLine().toUpperCase();
            
            vocal(voc);
        }
    }

}
