/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;
import java.util.Scanner;
/**
 *
 * @author rutvac
 */
public class EJERCICIO16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,i;
        boolean primo=true;
        
        do{
            Scanner sc= new Scanner(System.in);
            System.out.println("Introduce un número : ");
            num=sc.nextInt();
            if (num<=0){
            }
        }while (num<=0);
        
        i =num-1;
        while (primo ==true && i>1){
            if (num %i==0){
                primo =false;
            }
            i--;
            
        }
       if(primo){
           System.out.println("Es primo");
       }else{
           System.out.println("No es primo");
       }
        
    }
    
}
