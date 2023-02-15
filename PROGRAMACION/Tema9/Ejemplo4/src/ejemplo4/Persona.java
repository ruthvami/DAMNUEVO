/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo4;

/**
 *
 * @author rutvac
 */
public class Persona {

    private String nom;
    private String dni;
    private String adreça;
    private int telefon;

    public Persona(String nom, String dni, String adreça, int telefon) {
        this.nom = nom;
        this.dni = dni;
        this.adreça = adreça;
        this.telefon = telefon;
    }

    public void mostrarPersona() {
        System.out.println("Nom: " + this.nom);
        System.out.println("DNI: " + this.dni);
        System.out.println("Adreça: " + this.adreça);
        System.out.println("Telefon: " + this.telefon);
    }

    public String getNom() {
        return nom;
    }

    public String getDni() {
        return dni;
    }

    public String getAdreça() {
        return adreça;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

}
