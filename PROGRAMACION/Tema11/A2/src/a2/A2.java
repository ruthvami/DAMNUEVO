/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class A2 {

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
        boolean mas = true;
        File lista[] = ruta.listFiles();
        if (ruta.isFile()) {
            System.out.println("Nom: " + ruta.getName());
        } else if (ruta.isDirectory()) {
            Arrays.sort(lista);
            for (File lista1 : lista) {
                if (lista1.isDirectory()) {
                    System.out.print("[*]" + lista1.getName());
                    if (mas == false) {
                        System.out.println(" ");
                    } else {
                        Date fecha = new Date(lista1.lastModified());
                        System.out.println("[" + lista1.length() + "]" + "[" + fecha + "]");
                    }
                }
            }
            for (int i = 0; i < lista.length; i++) {
                if (lista[i].isFile()) {
                    System.out.println("[A]" + lista[i].getName());
                }
            }
            if (!ruta.exists() && ruta.getPath() != "") {
                throw new FileNotFoundException("***FileNotFoundException:Ruta no encontrada->" + ruta.getPath());

            }
        }
    }
}
