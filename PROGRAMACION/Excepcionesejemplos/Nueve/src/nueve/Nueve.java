/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nueve;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ruthv
 */
public class Nueve {

    /**
     * Crea una aplicación que solicite al usuario ingresar el nombre de un
     * archivo. A continuación, el programa debe leer el contenido del archivo y
     * contar cuántas palabras hay en él. Si el archivo no existe o si se
     * produce un error al intentar leer el archivo, el programa debe mostrar un
     * mensaje de error adecuado y solicitar al usuario que ingrese otro nombre
     * de archivo.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nom = sc.nextLine().toLowerCase();
        File f1 = new File(nom);
        Scanner ar = new Scanner(f1);
        int cont = 0;
//        while (ar.hasNext()) {
//            System.out.println(ar.next());
//            cont++;
//        } 

        while (ar.hasNext()) {
            String linea = ar.nextLine();
            String[] palabras = linea.split(" ");

            for (String palabra : palabras) {
                if (!palabra.isEmpty()) { // Ignora las palabras vacías
                    cont++;
                }
            }

        }
        System.out.println("Hay " + cont + " palabras");
        ar.close();
    }
}
