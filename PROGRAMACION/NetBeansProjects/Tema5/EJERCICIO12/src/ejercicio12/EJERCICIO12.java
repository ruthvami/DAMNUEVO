/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double A,B,exp=1,veces;
        int i=1;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un valor:");
        A=sc.nextDouble();
        
        System.out.println("Introduce otro valor:");
        B=sc.nextDouble();
        
        if(B<0){
            veces= -B;
        }else{
            veces =B;
        }
        while(i<=veces){
            exp=exp*A;
            i++;
        }
        if(B<0){
            exp=1/exp;
        }else{
        }
        System.out.println(A + " elevado a "+ B + " es = " + exp);
        
    }
    
}
