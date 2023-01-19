/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO14 {

    /**
     * @param args the command line arguments
     */
    public static void linea(int a, String b) {
        int alt=1;
    
       while ( alt<= a) {

            for (int espacio = 1; espacio <= a - alt; espacio++) {
                System.out.print(" ");
                }
            
            
            for (int asteriscos = 1; asteriscos <= (alt * 2) - 1; asteriscos++) {
                
                
                    System.out.print(b);}
             
            
            System.out.println();
            alt++;
        }

    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        String tipo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que caracter quieres imprimir :");
        tipo = sc.nextLine();
        
        System.out.println("Dime el número de filas que tendrá el triangulo : ");
        num = sc.nextInt();
        linea( num, tipo);
    } 

}
