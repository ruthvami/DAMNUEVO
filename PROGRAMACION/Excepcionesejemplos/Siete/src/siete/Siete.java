/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package siete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ruthv
 */
public class Siete {

    /**
     * Escribe un programa que lea un archivo de texto y escriba su contenido al revés en otro archivo.
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        File ar = new File("a.txt");
        Scanner sc = new Scanner(ar);
        String var="";
        FileWriter d = new FileWriter("p.txt", false);
        while (sc.hasNextLine()) {
            var+=sc.nextLine()+"\n";
            
        }
        for (int i =1; i <var.length() ; i++) {
            d.write(var.charAt(var.length()-i));
        }
        d.write(var.charAt(0));
        d.close();
    }

}
