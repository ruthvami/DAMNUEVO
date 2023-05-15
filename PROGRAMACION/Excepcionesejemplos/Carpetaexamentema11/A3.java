/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a3;

import java.io.File;
import java.util.Arrays;

public class A3 {

    public static void main(String[] args) {

        ///////////////////////
        // Reanomenar carpetes
        String UserPath = System.getProperty("user.dir");     // per a extraure el directori de treball
        File docOrigen = new File(UserPath + "/Documents");   // File a partir del user path, 
        File docDesti = new File(UserPath + "/DOCS");         // tot i que no faria falta si utilitzem rutes relatives
        docOrigen.renameTo(docDesti);

        File fotOrigen = new File(docDesti.getAbsoluteFile() + "/Fotografies");
        File fotDesti = new File(docDesti.getAbsoluteFile() + "/FOTOS");
        fotOrigen.renameTo(fotDesti);

        File libOrigen = new File(docDesti.getAbsoluteFile() + "/Llibres");
        File libDesti = new File(docDesti.getAbsoluteFile() + "/LECTURES");
        libOrigen.renameTo(libDesti);

        /////////////////////////////////////////
        // Canviar extensions fotos
        // Imprimeix la llista d'arxius ordenada abans de llevar les extensions
        System.out.println("Llistat d'arxius " + fotDesti.getName() + " abans de llevar les extensions: ");
        imprimirLlistaArxius(fotDesti);
        System.out.println("");

        // Canvia de nom els arxius llevant-los l'extensió
        llevarExtensioArxius(fotDesti);

        // Imprimeix la llista d'arxius ordenada després de llevar les extensions
        System.out.println("Llistat d'arxius " + fotDesti.getName() + " després de llevar les extensions: ");
        imprimirLlistaArxius(fotDesti);
        System.out.println("");

        ////////////////////////////////////////////
        // Canviar extensions lectures
        // Imprimeix la llista d'arxius ordenada abans de llevar les extensions
        System.out.println("Llistat d'arxius " + libDesti.getName() + " abans de llevar les extensions: ");
        imprimirLlistaArxius(libDesti);
        System.out.println("");

        // Canvia de nom els arxius llevant-los l'extensió
        llevarExtensioArxius(libDesti);

        // Imprimeix la llista d'arxius ordenada després de llevar les extensions
        System.out.println("Llistat d'arxius " + libDesti.getName() + " després de llevar les extensions: ");
        imprimirLlistaArxius(libDesti);
        System.out.println("");
    }

    // Canvia de nom els arxius llevant-los l'extensió
    public static void llevarExtensioArxius(File ruta) {
        // Recorre el llistat d'arxius
        for (File f : ruta.listFiles()) {
            // trosseja el nom de l'arxiu sobre la base del punt
            String[] trosArxiu = f.getName().split("\\.");
            File fDesti = new File(f.getParent() + "/" + trosArxiu[0]);
            // Reanomena l'arxiu
            f.renameTo(fDesti);
        }
    }

    // Imprimeix la llista d'arxius ordenada
    public static void imprimirLlistaArxius(File ruta) {
        File[] llista = ruta.listFiles();
        // Ordena la llista alfabèticament
        Arrays.sort(llista);
        // Recorre la llista mostrant el nom dels arxius
        for (File f : llista) {
            if (f.isFile()) {
                System.out.println(f.getName());
            }
        }
    }
}
