/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ruthv
 */
public class Seis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        File archivo = new File("a.txt");
        Set<Integer> m = new TreeSet<>(Collections.reverseOrder());//de mayor a menor
        try ( Scanner sc = new Scanner(archivo)) {

            while (sc.hasNext()) {
                m.add(sc.nextInt());
            }
            try ( FileWriter wr = new FileWriter("dos.txt", false)) {
                String var = "";
                for (Integer integer : m) {
                    var+=integer + ", ";
                }
                wr.write(var.substring(0, var.length()-2));//para quitar la ultima coma
               
                wr.close();
            }
        }
    }

}
