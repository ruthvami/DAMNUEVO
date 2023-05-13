/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a5;

import java.io.*;

public class A5 {

    public static void main(String[] args) {

        File boxeo = new File("Documents/Fotografies/boxeo.jpg");
        File fotografies = new File("Documents/Fotografies");
        File llibres = new File("Documents/Llibres");
        File documents = new File("Documents");

        boolean res;

        try {
            res = esborraTot(boxeo);
            if (res) {
                System.out.println("L'arxiu 'boxeo.jpg' ha estat esborrat");
            } else {
                System.out.println("*** ERROR: no es pot esborrar l'arxiu 'boxeo.jpg'");
            }

            res = esborraTot(fotografies);
            if (res) {
                System.out.println("La carpeta 'Fotografies' ha estat esborrada");
            } else {
                System.out.println("*** ERROR: no es pot esborrar la carpeta 'Fotografies'");
            }

            res = esborraTot(llibres);
            if (res) {
                System.out.println("La carpeta 'Llibres' ha estat esborrada");
            }else {
                System.out.println("*** ERROR: no es pot esborrar la carpeta 'Llibres'");
            }

            res = esborraTot(documents);
            if (res) {
                System.out.println("La carpeta 'Documents' ha estat esborrada");
            }else {
                System.out.println("*** ERROR: no es pot esborrar la carpeta 'Documents'");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public static boolean esborraTot(File ruta) throws FileNotFoundException {
        if (!ruta.exists()) {
            throw new FileNotFoundException("La ruta introduïda:\n" + ruta.getAbsolutePath() + "\nno existeix");
        }

        if (ruta.isFile()) {
            return ruta.delete();
        }

        if (ruta.isDirectory()) {
            for (File f1 : ruta.listFiles()) {
                f1.delete();
            }
            return ruta.delete();
        }

        // No deuria arribar ací
        return false;
    }
}
