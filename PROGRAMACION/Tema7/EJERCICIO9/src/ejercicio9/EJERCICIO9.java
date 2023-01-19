/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO9 {

    /**
     * @param args the command line arguments
     */
    public static int mayor(int a, int b){
        int num=0;
        if(a>b){
            num=a;
        }if(b>a){
        num=b;
        }
        return num;
    }
    public static void main(String[] args) {
        // TODO code application logic here
         int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero : ");
        a = sc.nextInt();
        System.out.println("Introduce otro numero : ");
        b = sc.nextInt();
        System.out.println("Introduce otro numero : ");
        c = sc.nextInt();
        System.out.println("El maximo es "+ mayor(mayor(a,b),c));
    }
    
}
