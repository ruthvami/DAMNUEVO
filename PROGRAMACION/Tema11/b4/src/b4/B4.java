/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class B4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Como quieres nombrar al nuevo archivo?");
        File nuevo = new File(sc.nextLine());
        System.out.println("Cuantos nombres quieres?");
        int N = sc.nextInt();

        File noms = new File("usa_noms.txt");
        File cognoms = new File("usa_cognoms.txt");
        
        try {
            Scanner n = new Scanner(noms);
            ArrayList<String> nomb = new ArrayList<>();
            ArrayList<String> apell = new ArrayList<>();
            Scanner c = new Scanner(cognoms);
            ArrayList<String> completo = new ArrayList<>();

            while (n.hasNextLine()) {
                nomb.add(n.nextLine());

            }
            while (c.hasNextLine()) {
                apell.add(c.nextLine());
            }
            c.close();
            n.close();
            for (int i = 0; i < N; i++) {
                String x = nomb.get(0 + (int) (Math.random() * nomb.size()));
                String y = apell.get(0 + (int) (Math.random() * apell.size()));

                completo.add(x + " " + y + "\n");
            }
            FileWriter ultimo = new FileWriter(nuevo, false);
            for (String object : completo) {
                ultimo.write(object);
            }
            ultimo.close();
            System.out.println("Fitxer '" + nuevo.getName() + "' escrit correctament");
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
