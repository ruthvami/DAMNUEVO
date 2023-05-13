/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dos;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ruthv
 */
public class Dos {

    /**
     * @param args the command line arguments Escribe un programa en Java que
     * reciba como entrada una cadena de texto y que genere un conjunto (set)
     * con las palabras que aparecen en la cadena. El programa debe ignorar las
     * palabras que contienen números o caracteres especiales, y sólo considerar
     * aquellas que consisten únicamente de letras. El conjunto resultante debe
     * estar ordenado alfabéticamente. Si la entrada es una cadena vacía, el
     * programa debe lanzar una excepción del tipo IllegalArgumentException.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String texto = "Hola mundo, 123 ejemplo set texto, OpenAI";
        Set<String> palabras = new HashSet<>();

        try {
            if (texto.isEmpty()) {
                throw new IllegalArgumentException("La cadena de texto no puede estar vacía.");
            }

            String[] palabrasArray = texto.split("\\W+");//la \\W quita los caracteres como comas
            for (String palabra : palabrasArray) {
                if (palabra.matches("[a-zA-Z]+")) {
                    palabras.add(palabra);
                }
            }

            for (String string : palabras) {
                System.out.println(string);
            }

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        String teto = "Este  es    un   ejemplo  de     texto";
        String[] palabr = teto.split("\\s+");
// resultado: ["Este", "es", "un", "ejemplo", "de", "texto"]

String txto = "¡Hola! ¿Cómo estás? Espero que bien.";
String[] alabras = txto.split("[^\\p{L}]+");
// resultado: ["Hola", "Cómo", "estás", "Espero", "que", "bien"]
    }
}
