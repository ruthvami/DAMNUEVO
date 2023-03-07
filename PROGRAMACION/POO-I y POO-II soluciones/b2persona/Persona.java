/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2persona;

/**
 *
 * @author AiA
 */
public class Persona {
    String DNI;
    String nom;
    String cognoms;
    int edat;
    
    public Persona(String DNI, String nom, String cognoms, int edat){
        this.DNI = DNI;
        this.cognoms = cognoms;
        this.edat = edat;
        this.nom = nom;
    }
    public Persona(String nom, String cognoms, int edat){
        this.cognoms = cognoms;
        this.edat = edat;
        this.nom = nom;
    }
}