/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b_04;
import java.util.Scanner;

/**
 *
 * Ejercicio B-04: Crea un programa que muestre por pantalla cuantas vocales 
 * de cada tipo hay (cuantas ‘a’,cuantas  ‘e’,  etc.)  en una  frase  
 * introducida  por  teclado. No  se  debe   diferenciar 
 * entremayúsculas y minúsculas. Por ejemplo dada la frase 
 * “Mi mama me mima” 
 * dirá que hay:
 * Nº de A's: 3
 * Nº de E's: 1
 * Nº de I's: 2
 * Nº de O's: 0
 * Nº de U's: 0
 */
public class B_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase;
        int a, e, i, o, u, posicion;

        a = 0;
        e = 0;
        i = 0;
        o = 0;
        u = 0;

        System.out.print("Introduce una frase: ");
        frase = in.nextLine();

        frase = frase.toLowerCase(); // Pasamos todo a minúsculas.

        for (posicion = 0; posicion < frase.length(); posicion++) {
            switch (frase.charAt(posicion)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
        }

        System.out.println("El número de 'a' es: " + a);
        System.out.println("El número de 'e' es: " + e);
        System.out.println("El número de 'i' es: " + i);
        System.out.println("El número de 'o' es: " + o);
        System.out.println("El número de 'u' es: " + u);

    }

}