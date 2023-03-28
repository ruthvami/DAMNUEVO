/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

import java.util.InputMismatchException;

/**
 *
 * @author rutvac
 */
public class Gat {

    private String nom;
    private int edat;

    public Gat(String nom, int edat) throws Exception {
       
            this.setNom(nom);
            this.setEdat(edat);
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws ExceptionNom {
       if (!nom.matches("[A-Za-z]{3,}")) {
                throw new ExceptionNom(nom);
            }
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) throws ExceptionEdat {
         if (edat < 0) {
                throw new ExceptionEdat(edat);
            }
        this.edat = edat;
    }

    public void imprimir() {
        System.out.println("EL gat  " + this.nom + " té l'edat de " + this.edat + " anys");
    }

    
}
