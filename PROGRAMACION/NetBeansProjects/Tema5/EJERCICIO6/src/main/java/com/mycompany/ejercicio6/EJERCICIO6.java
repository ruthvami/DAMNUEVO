/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author ruth
 */
public class EJERCICIO6 {

    public static void main(String[] args) {
        int Sw , i;
        double num;
        
        Sw=1;
        i=1;
        
        while(i<=10){
            Scanner sc= new Scanner(System.in);
            System.out.println("Escribe el numero "+ i +" /10:");
            num=sc.nextDouble();
            if(num<0){
                Sw=0;
            }else{
            }
            i++;
        }
        
        if(Sw==1){
                System.out.print("No ");
            }else{
            }
        
        System.out.print("Se han introducido Numeros Negativos");
    }
}
