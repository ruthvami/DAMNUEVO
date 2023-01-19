/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        //es un double porque es un numero real
        double num[]=new double [10];
        double max=num[0],min=num[0]; 
       
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce un número real: ");
            num[i]=sc.nextDouble();
            if (num[i]< min){
                min=num[i];
            }else if (num[i]>max){
                max=num[i];
            }
        }
        System.out.println("El maximo de estos números es el "+max+ " y el minimo es "+ min);
    }
    
}