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
public class Persona {
    private String DNI;
    private String nom;
    private String cognoms;
    private int edat;
    
    public Persona(String DNI, String nom, String cognoms, int edat){
        this.DNI = DNI;
        this.cognoms = cognoms;
        this.edat = edat;
        this.nom = nom;
    }

    public String getDNI() {
        return this.DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
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
        return (this.edat >= 18);
    }
    public boolean esJubilat(){
        return (this.edat >= 65);
    }
    public int diferenciaEdat(Persona p){
        return Math.abs(this.edat-p.getEdat());
    }
    
    
}