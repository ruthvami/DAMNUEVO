/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciostema5;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIOSTEMA5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int pares, imp,i;
//        pares=0;
//        imp=0;
//        for(i=100; i<=200;i++){
//            if(i%2==0){
//                pares=pares+i;
//            }else {
//                imp=imp+i;
//            }
//          
//        }
//        System.out.println("La suma de los pares es "+pares +" y los impares "+ imp);
          int num,fact;
          fact=1;
          
          Scanner sc = new Scanner(System.in);
          System.out.print("Introducir un numero :");
          num= sc.nextInt();
          
          while(num>1){
              fact= fact * num;
              num=num-1;
              }System.out.println("El factorial de "+ num + " es "+fact);
         
    }
    
}
