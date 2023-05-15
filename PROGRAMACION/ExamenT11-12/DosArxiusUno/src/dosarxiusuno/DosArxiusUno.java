/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosarxiusuno;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class DosArxiusUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File n = new File("noms.txt");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Introduce el numero de parejas:");
            int num = sc.nextInt();
            if (num < 0) {
                throw new ExcepcioNombreCombinacionsIncorrecte(num);

            }

            Scanner noms = new Scanner(n);
            File f = new File("frases.txt");
            Scanner frases = new Scanner(f);
            try (FileWriter wr = new FileWriter("resultat.txt", false)) {
                for (int i = 0; i < num; i++) {

                    if (noms.hasNextLine()) {
                        String nom = noms.nextLine();
                        wr.write(nom + "\n");
                    }
                    if (frases.hasNextLine()) {
                        String frase = frases.nextLine();
                        wr.write(frase + "\n");

                    }

                    if (!noms.hasNextLine() && !frases.hasNextLine()) {
                        System.out.println("Archivo creado correctamente");
                        break;
                    }

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
        } catch (IOException e) {
            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println("No has introducido un int");
        } catch (ExcepcioNombreCombinacionsIncorrecte e) {
            System.out.println(e.toString());
        }
    }

    private static class ExcepcioNombreCombinacionsIncorrecte extends Exception {
        private int num;
        private ExcepcioNombreCombinacionsIncorrecte(int num) {
            this.num=num;
        }

        public String toString() {
            return "***Error:El nombre de combinacions no pot ser " + num;
        }
    }

}
