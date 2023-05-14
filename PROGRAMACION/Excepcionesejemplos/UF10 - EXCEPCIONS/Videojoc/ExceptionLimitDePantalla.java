/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aq10_videojoc;

/**
 *
 * @author AiA
 */
class ExceptionLimitDePantalla extends Exception {
    
    private String nom;
    private int posicio;
    private String pla;

    public ExceptionLimitDePantalla(String nom, int posicio, String pla) {
        this.nom = nom;
        this.posicio = posicio;
        this.pla = pla;
    }    
    @Override
    public String toString(){
        return "*** LimitDePantalla {No es pot col·locar/moure a " + 
                this.nom + " fins a la posició " + this.posicio + " " + this.pla + "}";
    }    
}
