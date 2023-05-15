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
public class NomIncorrecteException extends Exception {
    
    private String nom;

    public NomIncorrecteException(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "*** NomIncorrecteException { nom = " + this.nom + "} Ha de tindre min. 3 caràcters i només lletres";
    }
    
}
