/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a5;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author rutvac
 */
public class A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
//        File uno = new File("Documents/Fotografies");
//        File dos = new File("Documents/Llibres");
        File tres = new File("Documents");
        try {
//            esborraTot(uno);
//            esborraTot(dos);
            esborraTot(tres);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean esborraTot(File f) throws FileNotFoundException {
        if (f.exists()) {
            if (f.isFile()) {
                f.delete();
                System.out.println("Intento de borrar " + f.getName());
            } else if (f.isDirectory()) {
                for (File elements : f.listFiles()) {
                    elements.delete();
                    System.out.println("Intento de borrar " + elements.getName());
                    if (elements.isDirectory()) {
                        esborraTot(elements);
                    }
                }
                f.delete();

            }
        } else {
            throw new FileNotFoundException("***FileNotFoundException:Ruta no encontrada->" + f.getPath());
        }
        if (f.exists() == true) {
            System.out.println("***No se ha podido borrar");
            return false;
        } else {
            System.out.println("***Se ha borrado correctamente");
            return true;
        }
    }
}
