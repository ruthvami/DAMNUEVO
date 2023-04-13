/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10.excepcions.ruth;

/**
 *
 * @author ruthv
 */
public class Enemic extends Personatges{
    private int vida;

    public Enemic(int vida, String nom, int posx, int posy) throws LimitDePantalla {
        super(nom, posx, posy);
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }


    public void decrement(){
        vida--;
    }
    public void estat(){
        System.out.println("Nom: "+this.getNom() );
        System.out.println("Tipus de personatge: "+this.getClass().getSimpleName());
        System.out.println("Posició: x("+this.getPosx()+"), y("+this.getPosy()+")");
        System.out.println("Vidas: "+this.getVida());
    }
}
