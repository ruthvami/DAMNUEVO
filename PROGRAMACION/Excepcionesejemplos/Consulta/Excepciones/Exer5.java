/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author AiA
 */
public class Exer5 {

   public static void main(String[] args) throws Exception{
        
        Scanner in = new Scanner(System.in);
        int num;        
        for(int i = 0; i < 5; i++){
            try{
                System.out.print("Introdueix un sencer positiu: ");
                num = in.nextInt();
                imprimeixPositiu(num);
                
                System.out.print("Introdueix un sencer negatiu: ");
                num = in.nextInt();
                imprimeixNegatiu(num);
            }
            catch(InputMismatchException e){
                System.out.println("Valor introduït és del tipus incorrecte");
                in.nextLine();                
            }catch(Exception e){
                System.out.println(e);            
            } 
        }
    }
    
    public static void imprimeixPositiu(int p) throws Exception{
        if(p < 0){
            throw new Exception ("Error: el número és negatiu");
        }        
        System.out.println("El número positiu és el: " + p);       
    }
    
    public static void imprimeixNegatiu(int n) throws Exception{
        if(n >= 0){
            throw new Exception("Error: el número és positiu");
        }        
        System.out.println("El número negatiu és el: " + n);
    }
}
