/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package d2.persona;

/**
 *
 * @author rutvac
 */
public class Persona {

    private String dni;
    private String nom;
    private String cognom;
    private int edat;

    public Persona(String dni, String nom, String cognom, int edat) {
        this.dni = dni;
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }
    public void imprimeix() {
        System.out.println("Dni: " + getDni() + "\n Nom: " + getNom() + " \n Cognom: " + getCognom() + "\n Edat: " + getEdat());
    }

    public boolean jubilat() {
        if (this.getEdat()>= 65) {

            return true;
        } else {

            return false;
        }
    }
    public boolean edad(){
    return (this.getEdat()>= 18);

             

    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
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
}
