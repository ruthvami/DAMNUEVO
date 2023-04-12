/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10.excepcions.ruth;

/**
 *
 * @author ruthv
 */
class LimitDePantalla extends Exception {

    private Personatges per;

    public LimitDePantalla(Personatges per1) {
        this.per = per1;
    }

    @Override
    public String toString() {
        if (this.per.getPosy() == 0) {
            return "*** LimitDePantalla {No es pot col·locar/moure a " + this.per.getNom() + " fins a la posició " + this.per.getPosx() + " horitzontal}";
        } else {
            return "*** LimitDePantalla {No es pot col·locar/moure a " + this.per.getNom() + " fins a la posició " + this.per.getPosy() + " vertical}";
        }
    }

}

class SenseBales extends Exception{
    @Override
    public String toString() {
        return "*** SenseBales {No pots disparar. T'has quedat sense trets disponibles}";
    }

}
class DisparosEnem extends Exception{
private Personatges ene;

    public DisparosEnem(Enemic ene) {
        this.ene = ene;
    }

    @Override
    public String toString() {
        int i;
        if(i!=this.ene.getVida()) return "Enemic "+ this.ene.getNom()+" tocat!!! Vida restant: "+this.ene.getVida();
        else return "Enemic "+this.ene.getNom()+" ha estat eliminat!!!";
        i++;
    }

}

class EnemicMort extends Exception{

    public String toString() {
       return "*** EnemicMort {L'enemic ja estava mort}";
    }

}
