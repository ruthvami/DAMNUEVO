/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probando;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ruth
 */
public class Probando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont=0;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce una letra: ");
        char letra=sc.nextLine().charAt(0);
        System.out.println("Introduce una cadena");
        String c=sc.nextLine();
        
        String arr[]=new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=c;
            if(i==letra){
                cont++;
            }
            
        }
        System.out.println(Arrays.toString(arr));
        
    }
    
}
