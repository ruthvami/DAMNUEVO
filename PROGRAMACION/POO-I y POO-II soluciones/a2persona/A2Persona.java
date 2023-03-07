/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2persona;
import java.util.Scanner;

/**
 *
 * @author AiA
 */
public class A2Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona P1 = new Persona();
        Persona P2 = new Persona();        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Persona 1 - DNI: ");
        P1.DNI=sc.nextLine();
        System.out.print("Persona 1 - Nom: ");
        P1.nom=sc.nextLine();
        System.out.print("Persona 1 - Cognoms: ");
        P1.cognoms=sc.nextLine();
        System.out.print("Persona 1 - Edat: ");
        P1.edat=sc.nextInt();        
        sc.nextLine();
        
        System.out.println("");
        System.out.print("Persona 2 - DNI: ");
        P2.DNI=sc.nextLine();
        System.out.print("Persona 2 - Nom: ");
        P2.nom=sc.nextLine();
        System.out.print("Persona 2 - Cognoms: ");
        P2.cognoms=sc.nextLine();
        System.out.print("Persona 2 - Edat: ");
        P2.edat=sc.nextInt();
        sc.nextLine();
        
        System.out.println("");
        if (P1.edat >= 18){
            System.out.println(P1.nom +" "+ P1.cognoms + " amb DNI " + P1.DNI + " és major d'edat");
        }else{
            System.out.println(P1.nom +" "+ P1.cognoms + " amb DNI " + P1.DNI + " no és major d'edat");
        }
        if (P2.edat >= 18){
            System.out.println(P2.nom +" "+ P2.cognoms + " amb DNI " + P2.DNI + " és major d'edat");
        }else{
            System.out.println(P2.nom +" "+ P2.cognoms + " amb DNI " + P2.DNI + " no és major d'edat");
        }
                
    }
    
}