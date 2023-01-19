/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static boolean edad(int a){
        boolean edad=true;
            if(a<18){
                edad=false;
                }
        return edad;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        a= sc.nextInt();
        if(edad(a)==false){
            System.out.println("Menor de edad");
            
        }else{
            System.out.println("Mayor de edad");}
    }
    
}
