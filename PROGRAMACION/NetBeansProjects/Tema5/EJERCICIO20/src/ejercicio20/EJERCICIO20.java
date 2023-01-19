/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner sc= new Scanner (System.in);
        System.out.println("Introduce un número del 1 al 20: ");
        num=sc.nextInt();
        
            for(int i=1;i<=num;i++){
                for(int rep=1;rep<=i;rep++){
                    System.out.print(i);
                } 
                System.out.println("");
            }
    
    }
}
