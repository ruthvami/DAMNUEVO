/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numinicial , i=0,numfin,fallo=0;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un número inicial : ");
        numinicial=sc.nextInt();
        i++;
        
        do{
            System.out.println("Introduce un número : ");
            numfin=sc.nextInt();
            i++;
            
            if (numfin<numinicial && numfin !=0){
                System.err.println("ERROR es menor");
                fallo++;
                
            }
            numinicial=numfin;
        }while(numfin!=0 );
        System.out.println("Total de numros introducidos es "+ i);
        System.out.println("Números fallados = " + fallo);
    }
    
}
