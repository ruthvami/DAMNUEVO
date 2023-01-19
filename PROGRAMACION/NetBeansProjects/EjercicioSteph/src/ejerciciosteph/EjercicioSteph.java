/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosteph;

import java.util.Scanner;

/**
 *
 * @author ruth
 */
public class EjercicioSteph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int espacio=0; 
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase=sc.nextLine();
        
        
        String[] array=frase.split("");
        for (int i = 0; i < array.length; i++) {
            
           espacio++;
        }
        System.out.println(espacio);
    }
    
}
