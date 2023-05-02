/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a3;

import java.io.File;

/**
 *
 * @author ruthv
 */
public class A3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File a1 = new File("C:/Users/ruthv/Documents/DAMNUEVO/PROGRAMACION/Tema11/A3/Documents");
        File foto = new File("C:/Users/ruthv/Documents/DAMNUEVO/PROGRAMACION/Tema11/A3/DOCS/Fotografies");
        File llibre = new File("C:/Users/ruthv/Documents/DAMNUEVO/PROGRAMACION/Tema11/A3/DOCS/Llibres");
        System.out.println(a1.exists());

        a1.renameTo(new File("C:/Users/ruthv/Documents/DAMNUEVO/PROGRAMACION/Tema11/A3/DOCS"));
        foto.renameTo(new File("C:/Users/ruthv/Documents/DAMNUEVO/PROGRAMACION/Tema11/A3/DOCS/FOTOS"));
        llibre.renameTo(new File("C:/Users/ruthv/Documents/DAMNUEVO/PROGRAMACION/Tema11/A3/DOCS/LECTURES"));
//        System.out.println(foto.exists());
        cambiarNombres(new File("C:/Users/ruthv/Documents/DAMNUEVO/PROGRAMACION/Tema11/A3/DOCS/FOTOS"));
        cambiarNombres(new File("C:/Users/ruthv/Documents/DAMNUEVO/PROGRAMACION/Tema11/A3/DOCS/LECTURES"));
    }

    public static void cambiarNombres(File carpeta) {
        // Obtener los archivos de la carpeta
        File[] archivos = carpeta.listFiles();
        
        for (File archivo : archivos) {
            String nombre = archivo.getName().replaceFirst("[.][^.]+$", "");

            archivo.renameTo(new File(archivo.getParent(), nombre));
        }
        
    }
}
