/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;
/**
 *
 * @author ruth
 */
public class EJERCICIO14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantidad;
        int n=500,numbill;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe una cantidad en euros :");
        cantidad =sc.nextInt();
        
        while(cantidad>0){
            numbill=cantidad/n;
            cantidad=cantidad%n;
            System.out.println(numbill+" billetes de "+ n);
            switch(n){
                case 500:
                    n=200;
                    break;
                case 200:
                    n=100;
                    break;
                case 100:
                    n=50;
                    break;
                case 50:
                    n=20;
                    break;
                case 20:
                    n=10;
                    break;
                case 10:
                    n=5;
                    break;
                    
            }
        }
    }
    
}
