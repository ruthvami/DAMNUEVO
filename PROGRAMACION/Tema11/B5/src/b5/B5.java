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
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        File dic = new File("diccionari.txt");
        Scanner letras = new Scanner(dic);
        File nue = new File("Diccionari");
        nue.mkdir();
       
        ArrayList<String> nomb = new ArrayList<>();
        while(letras.hasNext()){
            nomb.add(letras.nextLine());
        }
        System.out.println(nomb.size());
        System.out.println("Se ha creado la carpeta ");
        for (char i = 'a'; i < 'z'; i++) {
            File nuevos = new File(nue.getPath() + "/" + i + ".txt");
            nuevos.createNewFile();
            while(letras.hasNext()){
            nomb.add(letras.nextLine());
        }
            System.out.println("Se ha creado el archivo "+nuevos.getName());
        }
        File[]a=nue.listFiles(); 
              char l = 'a';
        for (int i = 0; i < nomb.size(); i++) {
            if (nomb.get(i).charAt(0)==l) {
                FileWriter as=new FileWriter(new File(nue.getPath()+"/"+l+".txt"),true);
                
                as.write(nomb.get(i)+"\n");
                    
                as.close();
            }else{
                l++;
                i--;
            }
        }
        
    }

}
