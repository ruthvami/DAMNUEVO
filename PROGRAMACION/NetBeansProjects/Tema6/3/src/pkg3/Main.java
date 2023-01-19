/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre, apellido1,apellido2,n,a,ap;
   

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        nombre = sc.nextLine();
        System.out.println("Introduce tu primer apellido:");
        apellido1 = sc.nextLine();
        System.out.println("Introduce  tu segundo apellido:");
        apellido2 = sc.nextLine();
        
        n=nombre.substring(0,3);
        a=apellido1.substring(0,3);
        ap=apellido2.substring(0,3);
        System.out.println((n.concat(a).concat(ap)).toUpperCase());
    }
    
}
