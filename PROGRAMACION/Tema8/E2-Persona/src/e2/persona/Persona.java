/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e2.persona;

/**
 *
 * @author rutvac
 */
public class Persona {

    private final String dni;
    private String nom;
    private String cognom;
    private int edat;
    private static final int MAJOREDAT = 18;

    public Persona(String dni, String nom, String cognom, int edat) {
        while(!validarDNI(dni)){
            
        }
        
        this.dni = dni;
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public void imprimeix() {
        System.out.println("Dni: " + getDni() + "\nNom: " + getNom() + " \nCognom: " + getCognom() + "\nEdat: " + getEdat());
    }

    public boolean jubilat() {
        if (this.getEdat() >= 65) {

            return true;
        } else {

            return false;
        }
    }

    public boolean edad() {
        return (this.getEdat() >= 18);

    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the cognom
     */
    public String getCognom() {
        return cognom;
    }

    /**
     * @param cognom the cognom to set
     */
    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    /**
     * @return the edat
     */
    public int getEdat() {
        return edat;
    }

    /**
     * @param edat the edat to set
     */
    public void setEdat(int edat) {
        this.edat = edat;
    }

    public final boolean major() {
        if (edat >= MAJOREDAT) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean validarDNI(String dni) {
        return dni.toUpperCase().matches("\\d{8}[A-HJ-NP-TV-Z]");
    }
}


