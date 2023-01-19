/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,i=1;
        Scanner sc= new Scanner (System.in);
        System.out.println("Introduce un número: ");
        num=sc.nextInt();
        if(num<=0){
                System.out.print("*");
                
                }
        
        while(i<=num){
                   System.out.print("*");
                  
                   i++;
        }
        System.out.println("");
        }
    }
