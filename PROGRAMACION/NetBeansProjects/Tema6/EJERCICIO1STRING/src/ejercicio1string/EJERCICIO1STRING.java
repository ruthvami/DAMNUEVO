/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1string;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO1STRING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String tecla="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        tecla=sc.nextLine();
        
        
        System.out.println("La frase dividida es : " );
        
        String[] array=tecla.split("");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
         
        
       
        
    }
            
}
