package ej1.controldeaccso;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author ingdea
 */
public class Ej1ControldeAcceso {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param
     */
    public static void main(String[] args) {

        Map<String, String> senhas = new HashMap<>();
        senhas.put("ingdea", "321A");
        senhas.put("rutvac", "123B");
        boolean valido = true;
        int intentos = 3;

        System.out.print("** User: ");
        String user = sc.next().stripIndent();
        while (valido) {
            System.out.print("** Password: ");
            String pass = sc.next().stripIndent();
            if (senhas.containsKey(user)) {
                if (pass.equals(senhas.get(user))) {
                    System.out.println("Has accedido al àrea restringida!");
                    valido = false;
                } else {
                    intentos--;
                    System.out.println("La contraseña no coincide. ");
                    if (intentos > 0) {
                        System.out.println("Te quedan " + intentos + " oportunidades.");
                    } else {
                        System.out.println("Lo siento, no puedes acceder al àrea restringida.");
                        valido = false;
                    }
                }
            } else {
                System.out.println("Usuario no encontrado.");
                intentos--;
                if (intentos > 0) {
                    System.out.println("Te quedan " + intentos + " oportunidades.");
                }
                System.out.print("** User: ");
                user = sc.next().stripIndent();
            }
        }
    }
}
