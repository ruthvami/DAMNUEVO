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
public class Enemic extends Personatge {
    private int vida;

    public Enemic(String nom, int x, int y, int velocitat, int vida) throws ExceptionLimitDePantalla {
        super(nom,x, y, velocitat);
        this.vida = vida;
    }

    public void tocat() throws ExceptionEnemicMort {
        if (this.vida> 0) {
            this.vida--;
            if (this.vida == 0) {
                System.out.println("Enemic " + this.getNom() + " ha estat eliminat!!!");
            } else {
                System.out.println("Enemic " + this.getNom() + " tocat!!! Vida restant: " + this.vida);
            }
        } else {
            throw new ExceptionEnemicMort();
        }
    }
    @Override
    public void info(){
        super.info();
        System.out.println("Vida disponible: " + this.vida);
    }
}
