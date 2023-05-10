/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class B6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            File arch = new File("pi-million.txt");
            Scanner mil = new Scanner(arch);
            Scanner sc = new Scanner(System.in);
            String num;
            System.out.println("Introduce un numero que quieras buscar: ");
            num = sc.nextLine();
            System.out.print("El numero " + num);
            while (mil.hasNext()) {
                if (mil.) {
                    System.out.print(" SI");
                    break;
                } else {
                    System.out.print(" NO");
                }
            }
            System.out.println(" esta en " + arch.getName());
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe.");
        }
    }
}
