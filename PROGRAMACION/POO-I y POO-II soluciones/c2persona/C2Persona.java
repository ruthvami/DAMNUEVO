/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2persona;

import java.util.Scanner;

/**
 *
 * @author AiA
 */
public class C2Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String DNI;
        String nom;
        String cognoms;
        int edat;        
           
        Persona P1 = new Persona("12345678P","Peter","Pan",16);
        Persona P2 = new Persona("99999999D","Darth","Vader",54);  
        
        System.out.println("");
        if (P1.getEdat() >= 18){
            System.out.println(P1.getNom() +" "+ P1.getCognoms() + " amb DNI " + P1.getDNI() + " és major d'edat");
        }else{
            System.out.println(P1.getNom() +" "+ P1.getCognoms() + " amb DNI " + P1.getDNI() + " no és major d'edat");
        }
        if (P2.getEdat() >= 18){
            System.out.println(P2.getNom() +" "+ P2.getCognoms() + " amb DNI " + P2.getDNI() + " és major d'edat");
        }else{
            System.out.println(P2.getNom() +" "+ P2.getCognoms() + " amb DNI " + P2.getDNI() + " no és major d'edat");
        }
        
        P1.setEdat(P1.getEdat() + 2);
        System.out.println("\nDos anys més tard ...");
        if (P1.getEdat() >= 18){
            System.out.println(P1.getNom() +" "+ P1.getCognoms() + " amb DNI " + P1.getDNI() + " és major d'edat");
        }else{
            System.out.println(P1.getNom() +" "+ P1.getCognoms() + " amb DNI " + P1.getDNI() + " no és major d'edat");
        }
    }
    
}