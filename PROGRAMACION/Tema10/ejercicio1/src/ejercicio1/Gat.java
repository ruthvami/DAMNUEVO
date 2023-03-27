/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.InputMismatchException;

/**
 *
 * @author rutvac
 */
public class Gat {

    private String nom;
    private int edat;

    public Gat(String nom, int edat) throws Exception {
       
            if (!nom.matches("[A-Za-z]{3,}")) {
                throw new Exception("El nombre debe tener 3 letras minimo y no se puede introducir un numero-->"+nom);
            }
            this.nom = nom;
            if (edat < 0) {
                throw new Exception("No se puede introducir una edad negativa-->"+edat);
            }
            this.edat = edat;
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws Exception {
        if (nom.length() < 3) {
                throw new Exception("El nombre debe tener 3 letras minimo");
            }
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) throws Exception {
        if (edat < 0) {
                throw new Exception("No se puede introducir una edad negativa-->"+edat);
            }
        this.edat = edat;
    }

    public void imprimir() {
        System.out.println("EL gat : " + this.nom + " té l'edat de " + this.edat + " anys");
    }
}
