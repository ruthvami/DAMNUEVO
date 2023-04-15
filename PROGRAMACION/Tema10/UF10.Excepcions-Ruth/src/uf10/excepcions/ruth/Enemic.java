/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10.excepcions.ruth;

/**
 *
 * @author ruthv
 */
public class Enemic extends Personatges {

    private int vida;

    public Enemic(int vida, String NOM, int posx, int posy, double velocidad) throws LimitDePantalla {
        super(NOM, posx, posy, velocidad);
        this.vida = vida;
    }
//La función rebreTret muestra si el enemigo esta murto o si le han disparado su estado
//      *Devuelve:es un void por lo que no devuelve nada
//      *Parámetros de entrada:
//    -int dany:el saño que se le hace
    public void rebreTret(int dany) throws EnemicMort {
        if (vida <= 0) {
            throw new EnemicMort();
        } else {
            vida -= dany;
            if (vida <= 0) {
                System.out.println("Enemic " + getNom() + " ha estat eliminat!!!");
            } else {
                System.out.println("Enemic " + getNom() + " tocat!!! Vida restant: " + vida);
            }
        }
        
    }

    public int getVida() {
        return vida;
    }

    public void decrement() {
        vida--;

    }
//La función estat muestra el estado del objeto
//      *Devuelve:es un void por lo que no devuelve nada
//      *Parámetros de entrada:nada
    public void estat() {
        System.out.println("Nom: " + this.getNom());
        System.out.println("Tipus de personatge: " + this.getClass().getSimpleName());
        System.out.println("Posició: x(" + this.getPosx() + "), y(" + this.getPosy() + ")");
        System.out.println("Vidas: " + this.vida);
        System.out.println(" ");
    }
}
