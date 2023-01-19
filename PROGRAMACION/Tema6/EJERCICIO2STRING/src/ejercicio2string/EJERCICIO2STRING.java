/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2string;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO2STRING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String num1 = "", num2 = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        num1 = sc.nextLine();
        System.out.println("Introduce otra frase:");
        num2 = sc.nextLine();
        
        if(num1.equals(num2)){
            System.out.println("Son exactamente iguals");
        }else if (num1.equalsIgnoreCase(num2)){
            System.out.println("Son iguales");
        }else{System.out.println("No son iguals");
        }
        
    }

}
