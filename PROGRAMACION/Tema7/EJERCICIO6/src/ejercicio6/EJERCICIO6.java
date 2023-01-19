/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO6 {

    /**
     * @param args the command line arguments
     */
    public static double iva(double a){
        return (a*0.21)+a;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        double preu=0;
        for (int i = 0; i <5; i++) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Precio sin IVA :");
            preu=sc.nextDouble();
            
            System.out.println("Precio con IVA: "+ iva(preu));
        }
        
        
    }
    
}
