/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,mayor,i=0,par=0;
        Scanner sc= new Scanner (System.in);
        System.out.println("Introduce un número : ");
        num=sc.nextInt();
        
        System.out.println("Introduce un número mayor al anterior: ");
        mayor=sc.nextInt();
        
        while(mayor>=num){
            System.out.print(" " + num +"");
            if(num%2==0){
            par++;}
            num++;
        }
        System.out.println("");
        System.out.println("La cantidad de pares es "+ par);
    }
    
}
