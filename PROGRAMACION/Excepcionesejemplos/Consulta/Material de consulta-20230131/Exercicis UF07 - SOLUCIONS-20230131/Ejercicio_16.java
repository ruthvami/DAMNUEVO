/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_16;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_16 {
    
    public static void rellenaRandom(double[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = Math.random();
        }
    }
    
    public static void main(String[] args) {
        double vector[];
        int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce N: ");
        n = sc.nextInt();

        vector = new double[n];
        rellenaRandom(vector);
        
        System.out.println(Arrays.toString(vector));
    }
}