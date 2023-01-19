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
    public static int minim(int a, int b){
        int num=0;
        if(a<b){
            num=a;
        }if(b<a){
        num=b;
        }
        return num;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        a = sc.nextInt();
        System.out.println("Introduce otro numero:");
        b = sc.nextInt();
        System.out.println("El numero minimo es "+ minim(a,b));
    }
    
}
