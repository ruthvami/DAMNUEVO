/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a6;

import java.io.*;

public class A6 {

    public static void main(String[] args) {

        File documents = new File("Documents");

        try {
            // Esborrem la carpeta 'Documents' i tot el contingut de forma recursiva
            boolean res = esborraTot(documents);
            if (res) {
                System.out.println("La carpeta 'Documents' ha estat esborrada");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    // Esborra tots els arxius i carpetes de forma recursiva
    public static boolean esborraTot(File ruta) throws FileNotFoundException {

        if (!ruta.exists()) {
            throw new FileNotFoundException("La ruta introducida no existeix");
        }

        if (ruta.isFile()) {
            return ruta.delete();
        }

        if (ruta.isDirectory()) {

            for (File f : ruta.listFiles()) {
                if (f.isFile()) {
                    f.delete();
                }

                // Si és una carpeta esborrem amb esborraTot() usant recursivitat
                if (f.isDirectory()) {
                    esborraTot(f);
                }
            }

            return ruta.delete();
        }

        // No deuria arribar ací
        return false;
    }
}
