/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b5;

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
public class B5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File dic = new File("diccionari.txt");
        try {
            Scanner letras = new Scanner(dic);
            File nue = new File("Diccionari");
            nue.mkdir();

            ArrayList<String> nomb = new ArrayList<>();
            while (letras.hasNext()) {
                nomb.add(letras.nextLine());
            }
            System.out.println(nomb.size());
            System.out.println("Se ha creado la carpeta ");
            for (char i = 'a'; i <= 'z'; i++) {
                File nuevos = new File(nue.getPath() + "/" + i + ".txt");
                nuevos.createNewFile();
                System.out.println("Se ha creado el archivo " + nuevos.getName());
            }
            for (String palabra : nomb) {

                char firstLetter = Character.toLowerCase(palabra.charAt(0));
                if (firstLetter >= 'a' && firstLetter <= 'z') {
                    String filePath = nue.getPath() + "/" + firstLetter + ".txt";
                    FileWriter as = new FileWriter(new File(filePath), true);
                    as.write(palabra + "\n");
                    as.close();
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
        }catch(IOException e){
            System.out.println("Hay un error al escribir algo en un archivo");
        }
    }

}
