/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc=new Scanner(System.in);
            
        int num[]=new int [20]; 
        int neg=0, pos=0;
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce un número entero: ");
            num[i]=sc.nextInt();
            if (num[i]<0){
                neg=neg +num[i];
                
            }else{
                pos=pos +num[i];
            }
        }
        System.out.println("La suma de los numeros positivos es " + pos);
        System.out.println("La suam de los numeros negativos es "+ neg);
       
    }
    
}
