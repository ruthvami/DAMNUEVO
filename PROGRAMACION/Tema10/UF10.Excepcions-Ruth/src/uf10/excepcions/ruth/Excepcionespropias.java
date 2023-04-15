/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10.excepcions.ruth;

/**
 *
 * @author ruthv
 */
//La función LimitDePantalla muestra el mensaje de error si te pasas del limite de posicion
//      *Devuelve:es un void por lo que no devuelve nada
//      *Parámetros de entrada:nada
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
//La función SenseBales muestra el mensaje de error si te quedas sin balas
//      *Devuelve:es un void por lo que no devuelve nada
//      *Parámetros de entrada:nada

class SenseBales extends Exception {

    @Override
    public String toString() {
        return "*** SenseBales {No pots disparar. T'has quedat sense trets disponibles}";
    }

}

//La función EnemicMort muestra el mensaje de error si el enemigo esta muerto ya
//      *Devuelve:es un void por lo que no devuelve nada
//      *Parámetros de entrada:nada
class EnemicMort extends Exception {

    public String toString() {
        return "*** EnemicMort {L'enemic ja estava mort}";
    }

}
