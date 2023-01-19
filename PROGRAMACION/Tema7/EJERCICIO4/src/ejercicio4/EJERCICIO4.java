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
    public static int dimeSigne(int a){
        int num=0;
        if(a<0){
            num=2;
        }if(a==0){
            num=0;
        }if(a>0){
            num=1;
        }
        return num;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        a = sc.nextInt();
        switch(dimeSigne(a)){
            case 0:
                System.out.println("El numero es igual a 0");
                break;
            case 1:
                System.out.println("EL numero es positivo");
                break;
            case 2:
                System.out.println("El numero es negativo");
                break;
                    
        }
    }
    
}
