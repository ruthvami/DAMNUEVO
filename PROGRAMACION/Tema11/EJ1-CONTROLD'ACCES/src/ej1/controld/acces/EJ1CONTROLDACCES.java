/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1.controld.acces;

import java.util.ArrayList;
import java.util.Collections;
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
//        //ejercicio1
        Map< String, String> m = new HashMap<>();
        m.put("hola", "HOLA");
        m.put("RUTVAC", "estanoes");

        Scanner sc = new Scanner(System.in);
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
            } else if (!m.containsValue(y)) {
                System.out.println("Error al acceder la contraseña");
                i++;
                System.out.println("Te quedan " + (3 - i) + " intentos");
            }
            if (i == 3) {
                bien = false;
            }

        } while (bien);

//    }
////ejercicio2
//        Map<String, String> m = new HashMap<>();
//        m.put("hello", "hola");
//        m.put("goodbye", "adiós");
//        m.put("thank you", "gracias");
//        m.put("please", "por favor");
//        m.put("sorry", "lo siento");
//        m.put("yes", "sí");
//        m.put("no", "no");
//        m.put("how are you?", "¿cómo estás?");
//        m.put("I'm fine, thanks", "estoy bien, gracias");
//        m.put("what's your name?", "¿cómo te llamas?");
//        m.put("my name is...", "mi nombre es...");
//        m.put("where are you from?", "¿de dónde eres?");
//        m.put("I'm from...", "soy de...");
//        m.put("what time is it?", "¿qué hora es?");
//        m.put("I don't understand", "no entiendo");
//        m.put("can you help me?", "¿puedes ayudarme?");
//        m.put("where is the bathroom?", "¿dónde está el baño?");
//        m.put("how much does it cost?", "¿cuánto cuesta?");
//        m.put("I would like...", "me gustaría...");
//        m.put("do you speak English?", "¿hablas inglés?");
//        m.put("I don't speak Spanish", "no hablo español");
//        m.put("good luck", "buena suerte");
//        int cor = 0;
//        ArrayList<String> pre = new ArrayList<>(m.keySet());
//        Collections.shuffle(pre);
//
//        for (int i = 1; i <= 5; i++) {
//
//            int x = 1 + (int) (Math.random() * (22 - 1 + 1));
//            String pregunta = pre.get(i);
//            System.out.println(i + "- Introduce la traduccion de " + pregunta);
//            String resp = sc.nextLine();
//
//            if (resp.equals(m.get(pre))) {
//                System.out.println("Correcte!");
//                cor++;
//            } else {
//                System.out.println("Resposta incorrecta. La resposta correcta és " + m.get(pregunta));
//            }
//
//        }
//        System.out.println("Has tingut " + cor + " resposta/es correcta/es");
    }
}
