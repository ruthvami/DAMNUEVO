/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
            
        double real[]=new double [10]; 
       
        for (int i = 0; i < real.length; i++) {
            System.out.println("Introduce un número real: ");
            real[i]=sc.nextDouble();
        }
        System.out.println("----------------------------------------");
        for (int j = 0; j < real.length; j++) {
            System.out.println(real[j]);
            
        }
    }
    
}
