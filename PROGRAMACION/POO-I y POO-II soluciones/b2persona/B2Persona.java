/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2persona;

import java.util.Scanner;

/**
 *
 * @author AiA
 */
public class B2Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        Scanner sc = new Scanner(System.in);
        String DNI;
        String nom;
        String cognoms;
        int edat;
        
        System.out.print("Persona 1 - DNI: ");
        DNI=sc.nextLine();
        System.out.print("Persona 1 - Nom: ");
        nom=sc.nextLine();
        System.out.print("Persona 1 - Cognoms: ");
        cognoms=sc.nextLine();
        System.out.print("Persona 1 - Edat: ");
        edat=sc.nextInt();  
        
        Persona P1 = new Persona(DNI,nom,cognoms,edat);
                
        sc.nextLine();
        System.out.println("");
        System.out.print("Persona 2 - DNI: ");
        DNI=sc.nextLine();
        System.out.print("Persona 2 - Nom: ");
        nom=sc.nextLine();
        System.out.print("Persona 2 - Cognoms: ");
        cognoms=sc.nextLine();
        System.out.print("Persona 2 - Edat: ");
        edat=sc.nextInt();
        
        Persona P2 = new Persona(DNI,nom,cognoms,edat);       
        
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