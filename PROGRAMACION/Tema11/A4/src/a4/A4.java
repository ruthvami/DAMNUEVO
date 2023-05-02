/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a4;

import java.io.File;

/**
 *
 * @author ruthv
 */
public class A4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File carp1 = new File("Documents/LesMeuesCoses");
        File carp2 = new File("Documents/Alfabet");
        carp1.mkdir();
        carp2.mkdir();
        File foto = new File("C:/Users/ruthv/Documents//DAMNUEVO/PROGRAMACION/Tema11/A4/Documents/Fotografies");
        File llibre = new File("C:/Users/ruthv/Documents//DAMNUEVO/PROGRAMACION/Tema11/A4/Documents/Llibres");
        foto.renameTo(new File("C:/Users/ruthv/Documents//DAMNUEVO/PROGRAMACION/Tema11/A4/Documents/LesMeuesCoses/Fotografies"));
        llibre.renameTo(new File("C:/Users/ruthv/Documents//DAMNUEVO/PROGRAMACION/Tema11/A4/Documents/LesMeuesCoses/Llibres"));

        for (char letra = 'A'; letra <= 'Z'; letra++) {
            String valor=String.valueOf(letra);
            File carpet=new File("C:/Users/ruthv/Documents/DAMNUEVO/PROGRAMACION/Tema11/A4/Documents/Alfabet/");
            File hola=new File(carpet.getPath(),valor);
            hola.mkdir();
        }
    }

}
