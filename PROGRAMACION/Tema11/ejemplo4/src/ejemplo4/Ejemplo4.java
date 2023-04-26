/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo4;

import java.io.File;

/**
 *
 * @author rutvac
 */
public class Ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File fotos = new File("/home/rutvac/Temporal/Fotos/");
        File doc = new File("/home/rutvac/Temporal/Backup/Fotografies/");
        File mou = new File("/home/rutvac/Temporal/Pic1.png");
        File pic1 = new File("/home/rutvac/Temporal/Backup/Fotografies/Pic1.png");
        File cinco = new File("/home/rutvac/Temporal/");
//        boolean mkadirFot = fotos.mkdir();
//
//        if (mkadirFot) {
//            System.out.println("Creada carpeta " + fotos.getName() + "? " + mkadirFot);
//        } else {
//            boolean delCa = fotos.delete();
//            System.out.println("Esborrada carpeta " + fotos.getName() + "? " + delCa);
//            boolean delAr = doc.delete();
//            System.out.println("Esborrat arxiu " + doc.getName() + "? " + delAr);
//        }
//        fotos.renameTo(doc);
//        pic1.renameTo(mou);
//        System.out.println(fotos);
//        System.out.println(doc);
//        System.out.println(mou);
//        System.out.println(pic1);
          File lista[]=cinco.listFiles();
          if (!cinco.exists()) {
              System.out.println("La carpeta no existeix");
        }else{
              System.out.println("La carpeta existe");
          }
          System.out.println("La carpeta tiene "+lista.length+" elements");
          
          for (int i = 0; i <lista.length; i++) {
              if (lista[i].isFile()) {
                  System.out.println("[ARX]"+lista[i].getName());
              }else{
                  System.out.println("[DIR]"+lista[i].getName());
              }
        }
    }

}
