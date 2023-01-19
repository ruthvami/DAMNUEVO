/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio7;

import java.util.Scanner;

/**
 *
 * @author ruth
 */
public class EJERCICIO7 {

    public static void main(String[] args) {
       int pos,neg,i,num;
       pos=0;
       neg=0;
       i=1;
        
        while(i<=10){
            Scanner sc= new Scanner(System.in);
            System.out.println("Escribe el numero "+ i +" /10:");
            num=sc.nextInt();
            if(num<0){
                neg++;
            }else{
                pos++;
            }
            i++;
        }
        System.out.println("Se han introducido "+ pos + " numeros positivos");
        System.out.println("Se han introducido "+ neg + " numeros negativos");
    }
}
