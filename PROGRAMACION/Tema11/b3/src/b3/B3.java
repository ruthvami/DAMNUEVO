/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b3;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
        Scanner sc=new Scanner(System.in);
        System.out.println("Que archivo quieres ordenar?");
        File f = new File(" "+sc.nextLine());
        System.out.println("A donde lo quieres guardar?");
        File n = new File(" "+sc.nextLine());
        FileWriter nuevo = new FileWriter(n, false);
        try {
           File[]h= f.listFiles();
            for (int i = 0; i <f.length(); i++) {
                
                nuevo.write(resultado+"\n");
                resultado *= 2;
            }
            nuevo.close();
            System.out.println("Fitxer '" + f.getName() + "' escrit correctament");

        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Algo ha ocurrido que no tenias previsto");
        }
    }
    
}
