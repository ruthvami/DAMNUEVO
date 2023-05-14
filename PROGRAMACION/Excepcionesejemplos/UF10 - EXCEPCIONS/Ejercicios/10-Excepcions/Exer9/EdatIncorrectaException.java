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
public class EdatIncorrectaException extends Exception {
    
    private int edat;
    
    public EdatIncorrectaException(int edat) {
        this.edat = edat;        
    }

    @Override
    public String toString() {
        return "*** EdatIncorrectaException { edat= " + this.edat + "} L'edat no pot ser negativa";
    } 
}
