/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1.controld.acces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJ1CONTROLDACCES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map< String, String> m = new HashMap<>();
        m.put("hola", "HOLA");
        m.put("Contraseña", "estanoes");

        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduce un usuario:");
//        String x = sc.nextLine();
//        System.out.println("Introduce una contraseña:");
//        String y = sc.nextLine();
        boolean bien = true;
        int i = 0;
        do {
            System.out.println("Introduce un usuario:");
            String x = sc.nextLine();
            System.out.println("Introduce una contraseña:");
            String y = sc.nextLine();
            if (m.containsKey(x) && m.containsValue(y)) {
                System.out.println("Ha accedit correctament a l'area");
                bien = false;
            }
            if (!m.containsKey(x)) {
                System.out.println("Error al acceder el usuario");
                i++;
                System.out.println("Te quedan " + (3 - i) + " intentos");
            }else if (!m.containsValue(y)) {
                System.out.println("Error al acceder la contraseña");
                i++;
                System.out.println("Te quedan " + (3 - i) + " intentos");
            }
            if (i == 3) {
                bien = false;
            }

        } while (bien);

    }

}
