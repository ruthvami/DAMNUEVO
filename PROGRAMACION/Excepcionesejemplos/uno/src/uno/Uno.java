/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uno;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ruthv
 */
public class Uno {

    /**
     * @param args the command line arguments
     */
    /**
     * Escribe un programa en Java que lea el archivo, y para cada línea, cree
     * un objeto de la clase Persona con los datos correspondientes y lo
     * almacene en un mapa (utilizando el nombre como clave y el objeto Persona
     * como valor). Si el archivo no existe, el programa debe lanzar una
     * excepción del tipo FileNotFoundException. Si se produce un error de
     * formato al leer una línea, el programa debe lanzar una excepción del tipo
     * NumberFormatException.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File css=new File("css.txt");
        try{
        Scanner sc=new Scanner(css);
        Map<String,Persona> m1=new HashMap<>();
        while(sc.hasNextLine()){
            String a=sc.nextLine();
            String[] tamaño=a.split(",");
            if (tamaño.length==3) {
                String nom=tamaño[0];
                int edad=Integer.getInteger(tamaño[1]);
                String pais=tamaño[2];
                Persona p1=new Persona(nom,edad,pais);
                m1.put(nom,p1 );
            }else{
                throw new NumberFormatException("Error al introducir datos");
            }
            
            sc.close();
        }
        }catch(FileNotFoundException e){
            System.out.println("No se ha encontrado el archivo->" + css.getName());
        }catch(NumberFormatException e){
            System.out.println(e);
        }
    }
   

}
