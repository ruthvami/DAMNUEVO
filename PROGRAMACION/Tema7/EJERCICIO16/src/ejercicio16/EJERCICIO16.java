/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ruthv
 */
public class EJERCICIO16 {

    /**
     * @param args the command line arguments
     */
    public static void random(double[] v) {
        for (int i = 0; i <v.length; i++) {
            v[i]= Math.random();
            
            
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        double numeros[];
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el tamaño del array: ");
        N=sc.nextInt();
        numeros =new double[N];
        random(numeros);
        System.out. println(Arrays.toString(numeros));
    }
    
}
