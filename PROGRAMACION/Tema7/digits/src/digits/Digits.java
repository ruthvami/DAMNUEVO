/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package digits;

import java.util.Scanner;

/**
 *
 * @author ruthv
 */
public class Digits {
    public static int cantidad(int a){
        int i=0;
        while( a > 0){
            a/=10;
            i++;
        }
         return i;
    }
    public static int suma(int a){
        int suma;
        for (int i = 0; a > 0; i++) {
           suma = a.charAt(i);
           suma+=suma;
        }
        
    }
    public static void  main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        num=sc.nextInt();
        System.out.println("El nombre de dígits del "+ num +" és " + cantidad(num));
                System.out.print("i la suma dels seus dígits és "+suma(num));
    }

    
    
}
