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
public class Jugador extends Personatge {
    private int numTrets;

    public Jugador(String nom, int x, int y, int velocitat, int numTrets) throws ExceptionLimitDePantalla {
        super(nom, x, y, velocitat);
        this.numTrets = numTrets;
    }

    public void disparar(Enemic enemic) throws ExceptionSenseBales, ExceptionEnemicMort {
        if (this.numTrets > 0) {            
            this.numTrets--;            
            enemic.tocat();
            
        } else {
            throw new ExceptionSenseBales();
        }
    }
    @Override
    public void info(){
        super.info();
        System.out.println("Trets disponibles: " + this.numTrets);
    }
}