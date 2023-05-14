/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author AiA
 */
public class Exer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;       
        
        try{
            System.out.print("Quin és el valor sencer? ");
            num = sc.nextInt();
            System.out.println("El valor és: " + num);
        }
        catch(InputMismatchException e){
            System.out.println("Valor introduït incorrecte: " + e);
//            e.printStackTrace();
        }
        System.out.println("Fi del programa");
    }
    
}