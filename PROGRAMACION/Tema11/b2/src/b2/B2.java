/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class B2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File f = new File("alumnes_notes.txt");
        ArrayList n = new ArrayList();

        try {
            Scanner sc = new Scanner(f);
            String[] es=sc.nextLine().split(" ");
            while (sc.hasNextLine()) {
                n.add(es);
            }
            

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error no se ha encontrado el archivo->" + f.getName());
        } catch (InputMismatchException e) {
            System.out.println("Error al escribir");
        } catch (NoSuchElementException e) {
            System.out.println("Error no hay nada más para leer");
        } catch (Exception e) {
            System.out.println("Algo ha ocurrido que no tenias previsto");
        }
    }
}
