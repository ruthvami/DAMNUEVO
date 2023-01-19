/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fore;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class Fore {
    
    public static String parono(int a){
        String result;
        if(a%2==0){
            result="par";
        }else{
            result="impar";
        }
        
        return result;
    }
    public static int suma(int a,int b){
        
        return a+b;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Inserta un numero:");
        a=sc.nextInt();
        System.out.println(parono(a));
    }
    
}
