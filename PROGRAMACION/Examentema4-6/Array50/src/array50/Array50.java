/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array50;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class Array50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int max = 99, min = 0, N = 0, mayor = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de números que quieres introducir: ");
        N = sc.nextInt();
        
        int num[] = new int[N];
        
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * max) - min;
            
            if (num[i] >= 50) {                
                mayor++;
                
            }
            int num2[] = new int[mayor];
            
            for (int j = 0; j < num2.length; j++) {
                num2[j] = num[i];
            }
            i++;
            
            System.out.println(Arrays.toString(num2));
        }
        
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
            System.out.println(Arrays.sort(num2));
        }
    }
    
}
