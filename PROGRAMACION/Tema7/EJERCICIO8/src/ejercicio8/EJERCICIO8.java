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
    public static int suma(int N){
        int res=0;
        for (int i = 1; i <=N; i++) {
            res=res+i;
        }
        return res;
    }
    public static int product(int N){
        int res=1;
        for (int i = 1; i <= N; i++) {
            res*=i;
            
        }
        return res;
    }
    public static double intermedio(int N){
        return (N+1)/2;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero : ");
        N = sc.nextInt();
        System.out.println("Sumatorio : "+suma(N));
        System.out.println("Producto : "+product(N));
        System.out.println("Intermedio : "+ intermedio(N));
    }
    
}
