/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N = 0, M = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos numero :");
        N = sc.nextInt();
        M = sc.nextInt();
        
        int array[] = new int[N];
        
        Arrays.fill(array, M);
        System.out.println(Arrays.toString(array));
    }
    
}
