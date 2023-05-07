/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @version 5/5/2023
 * @author rutvac
 */
public class B3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Que archivo quieres ordenar?");
        File f = new File(" " + sc.nextLine());
        System.out.println("A donde lo quieres guardar?");
        File n = new File(" " + sc.nextLine());
//        FileWriter nuevo = new FileWriter(n, false);
        try {
            ArrayList<String> linies = new ArrayList<>();
            Scanner scanner = new Scanner(f);
            Collections.sort(linies);
            while (scanner.hasNextLine()) {
                linies.add(scanner.nextLine());
            }
            scanner.close();
            
            System.out.println("Fitxer '" + f.getName() + "' escrit correctament");

        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Algo ha ocurrido que no tenias previsto");
        }
    }

}
