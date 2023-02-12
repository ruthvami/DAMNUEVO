/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2persona;

/**
 *
 * @author AiA
 */
public class E2Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        Persona P1 = new Persona("12345678P","Peter","Pan",16);
        Persona P2 = new Persona("99999999D","Darth","Vader",54);  
       
        P1.imprimeix();
        P2.imprimeix();
        
        String TestDNI = "45879844R";
        System.out.println("El DNI de test " + TestDNI + " es: " + Persona.validarDNI(TestDNI));
        
        TestDNI = "45879844";
        System.out.println("El DNI de test " + TestDNI + " es: " + Persona.validarDNI(TestDNI));
        
        Persona P3 = new Persona("123","Tom","Brady",45);  
        P3.imprimeix();
        System.out.println(P3.getNom() + " és major d'edat: " + P3.esMajorEdat());
        
    }
    
}