/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num=0;
        int array[]=new int[5];
        int array2[]=new int [5];
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 10 numeros :");
        num= sc.nextInt();
        
        
        for (int i = 0; i <5; i++) {
            if(i<=5){
                array[i]=num;
            }else{
                array2[i-5]=num;
            }
            
        }
        System.out.println(Arrays.equals(array, array2));
        
    }

}
