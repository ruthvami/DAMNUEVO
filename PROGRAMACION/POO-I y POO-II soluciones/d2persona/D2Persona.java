/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d2persona;

/**
 *
 * @author AiA
 */
public class D2Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        Persona P1 = new Persona("12345678P","Peter","Pan",16);
        Persona P2 = new Persona("99999999D","Darth","Vader",54);  
        
        System.out.println(" ");
        System.out.print(P1.getNom() +" "+ P1.getCognoms() + " amb DNI " + P1.getDNI());
        if (P1.esMajorEdat()){
            System.out.println(" és major d'edat");
        }else{
            System.out.println(" no és major d'edat");
        }
        
        System.out.print(P2.getNom() +" "+ P2.getCognoms() + " amb DNI " + P2.getDNI());
        if (P2.esMajorEdat()){
            System.out.println(" és major d'edat");
        }else{
            System.out.println(" no és major d'edat");
        }
        
        System.out.println("AMB MÈTODES");
        P1.imprimeix();
        P2.imprimeix();
        
        System.out.println("La diferència d'edat entre ells és: " + P2.diferenciaEdat(P1));
        System.out.println("La diferència d'edat entre ells és: " + P1.diferenciaEdat(P2));
        
    }
    
}