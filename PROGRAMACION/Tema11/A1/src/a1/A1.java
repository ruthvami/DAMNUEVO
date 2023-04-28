/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class A1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        File ruta;
        do {
            System.out.println("Introduce una ruta: ");
            ruta = new File(sc.nextLine());
            try {
                mostraInfoRuta(ruta);
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        } while (!"".equals(ruta.getPath()));
    }

    public static void mostraInfoRuta(File ruta) throws FileNotFoundException {
        File lista[] = ruta.listFiles();
        if (ruta.isFile()) {
            System.out.println("Nom: " + ruta.getName());
        } else if (ruta.isDirectory()) {
            for (File lista1 : lista) {
                if (lista1.isDirectory()) {
                    System.out.println("[*]" + lista1.getName());
                }
                for (int i = 0; i < lista.length; i++) {
                    if (lista[i].isFile()) {
                        System.out.println("[A]" + lista[i].getName());
                    }

                }
            }
            if (!ruta.exists() && ruta.getPath() != "") {
                throw new FileNotFoundException("***FileNotFoundException:Ruta no encontrada->" + ruta.getPath());

            }
        }
    }
}
