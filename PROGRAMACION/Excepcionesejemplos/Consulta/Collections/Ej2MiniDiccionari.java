package ej2.mini.diccionari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author Ingrid de Aro
 */
public class Ej2MiniDiccionari {

    static Scanner sc = new Scanner(System.in);

    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {

        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("cachorro", "perro");
        diccionario.put("cadeira", "silla");
        diccionario.put("geladeira", "nevera");
        diccionario.put("carro", "coche");
        diccionario.put("avião", "avión");
        diccionario.put("cerveja", "cerveza");
        diccionario.put("presunto", "jamón");
        diccionario.put("oi", "hola");
        diccionario.put("tchau", "adiós");
        diccionario.put("pão", "pan");
        diccionario.put("suco", "zumo");
        diccionario.put("meias", "calcetines");
        diccionario.put("biscoito", "galleta");
        diccionario.put("namorado", "novio");
        diccionario.put("bolo", "tarta");
        diccionario.put("panela", "olla");
        diccionario.put("feijão", "alubia");
        diccionario.put("computador", "ordenador");
        diccionario.put("travesseiro", "almohada");
        diccionario.put("almofada", "cojín");
        diccionario.put("janela", "ventana");
        diccionario.put("floresta", "bosque");

        ArrayList<String> portugues = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(portugues);

        int aciertos = 0;
        System.out.println("** Programa para aprender portugués:\n ");
        for (int i = 0; i < 5; i++) {
            String clave = portugues.get(i);
            System.out.print("- Portugués: ");
            System.out.println(clave);
            System.out.print("- Traducción: ");
            String traduccion = sc.nextLine().stripIndent().toLowerCase();
            if (traduccion.equals(diccionario.get(clave))) {
                System.out.println("\nCorrecto!");
                aciertos++;
            } else {
                System.out.print("\nRespuesta Incorrecta!\nLa respuesta correcta es: ");
                System.out.println(diccionario.get(clave).toUpperCase());
            }
            System.out.println("");
        }
        System.out.println("Has adivinado: " + aciertos + " palabras.");

    }
}
