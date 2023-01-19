/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author ruth
 */
public class EJERCICIO15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num;
        int multi=0,i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un número: ");
        num=sc.nextDouble();
        while(i<num){
            if(i%3==0){
                multi++;
            }
            i++;
        }
        System.out.println("La cantidad de multiplos de 3 es = " + multi);

    }
    
}
