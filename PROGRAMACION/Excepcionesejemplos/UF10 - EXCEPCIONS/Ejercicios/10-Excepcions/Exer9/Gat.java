/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer9;

/**
 *
 * @author AiA
 */
public class Gat {
    private String nom;
    private int edat;

    public Gat(String nom, int edat) throws NomIncorrecteException, EdatIncorrectaException {
        this.setNom(nom);
        this.setEdat(edat);
    }

    public void imprimir() {
        System.out.println("El gat " + this.getNom() + " te " + this.getEdat() + " anys");
    }

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setNom(String nom) throws NomIncorrecteException {
        if (nom.toLowerCase().matches("[a-zàáèéíóú]{3,}")) {
            this.nom = nom;
        } else {
            throw new NomIncorrecteException(nom);
        }
    }

    public void setEdat(int edat) throws EdatIncorrectaException {
        if (edat < 0) {
            throw new EdatIncorrectaException(edat);
        } else {
            this.edat = edat;
        }
    }

}
