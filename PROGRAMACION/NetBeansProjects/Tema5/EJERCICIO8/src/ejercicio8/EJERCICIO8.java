/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int negativo=0, positivo=0;
        double num;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        num=sc.nextDouble();
        
        while (num!=0){
            if(num<0){
                negativo++;
            }else{
                positivo++;
            }
            
        
        System.out.println("Introduce un número: ");
        num=sc.nextDouble();
        }
        if(negativo>0){
            System.out.println("Se han añadido números negativos");
        }else{
        }
        System.out.println("Se han añadido "+ negativo + " números negativos");
        System.out.println("Se han añadido "+ positivo + " números positivos");

    }
}
