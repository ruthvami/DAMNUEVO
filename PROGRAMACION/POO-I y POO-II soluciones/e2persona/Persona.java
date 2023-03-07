/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2persona;

import java.util.Scanner;

/**
 *
 * @author AiA
 */
public class Persona {
    private final String DNI;
    private String nom;
    private String cognoms;
    private int edat;
    static final int MAJORIAEDAT=18;    
    
    public Persona(String DNI, String nom, String cognoms, int edat){
        this.cognoms = cognoms;
        this.edat = edat;
        this.nom = nom;
        String CheckedDNI = DNI;
        Scanner sc = new Scanner(System.in);
        
        while(!validarDNI(CheckedDNI)){
            System.out.println("////ERROR: DNI " + CheckedDNI + 
                    " no vàlid. Format ha de ser xxxxxxxxA (excepte I, O i U)");
            System.out.print("Introdueix un nou DNI: ");
            CheckedDNI = sc.nextLine();            
        }
        this.DNI = CheckedDNI;
    }

    public String getDNI() {
        return this.DNI;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return this.cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public int getEdat() {
        return this.edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }
    
    public void imprimeix(){
        System.out.println("Nom: " + this.nom +", Cognoms: "+ this.cognoms + 
                ", DNI: " + this.DNI + ", edat: " + this.edat);
    }
    
    public boolean esMajorEdat(){
        return (this.edat >= MAJORIAEDAT);
    }
    public boolean esJubilat(){
        return (this.edat >= 65);
    }
    public int diferenciaEdat(Persona p){
        return Math.abs(this.edat-p.edat);
    }
    
    // Funció que rep un DNI i retorna si és vàlid o no. IMPORTANT: no comprova si la lletra és correcta!
    public static boolean validarDNI(String dni){
        // Expressió regular que indica 8 dígits i al final alguna de les lletres que es permeten
        // rangs A-H J-N P-T V-Z (recordeu, algunes no es permeten)    
        return dni.matches("\\d{8}[A-HJ-NP-TV-Z]");        
    }
       
}