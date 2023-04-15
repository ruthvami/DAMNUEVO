
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10.excepcions.ruth;

/**
 *
 * @author ruthv
 */
public class Jugadors extends Personatges {

    private int nomtrets;

    public Jugadors(int nomtrets, String NOM, int posx, int posy, double velocidad) throws LimitDePantalla {
        super(NOM, posx, posy, velocidad);
        this.nomtrets = nomtrets;
    }
//La función disparar dispara a un enemigo quitandole vida, mostrando errores si se queda sin balas
//      *Devuelve:es un void por lo que no devuelve nada
//      *Parámetros de entrada:
//          -Enemic en:el enemigo al que disparas
//    public void disparar(Enemic en) throws SenseBales {
//        if (nomtrets == 0) {
//            throw new SenseBales();
//        }
//        System.out.println("Jugador " + this.getNom() + " dispara a enemigo " + en.getNom());
//        en.decrement();
//        nomtrets--;
//        if (en.getVida() == 0) {
//            System.out.println("Enemic " + en.getNom() + " ha estat eliminat!!!");
//        } else {
//            System.out.println("Enemic " + en.getNom() + " tocat!!! Vida restant: " + en.getVida());
//        }
//        e.rebreTret(nomtrets);
//        j.disparar(j, e);
//    }
    public void disparar(Enemic e) throws SenseBales, EnemicMort {
        System.out.println("Jugador " + this.getNom() + " dispara a enemigo " + e.getNom());

        if (this.nomtrets <= 0) {
            throw new SenseBales();
        }

        if (e.getVida() == 0) {
            throw new EnemicMort();

        }
        if (e.getVida() == 0) {
            System.out.println("Enemic " + e.getNom() + " ha estat eliminat!!!");
        } else {
            System.out.println("Enemic " + e.getNom() + " tocat!!! Vida restant: " + e.getVida());
        }
        e.rebreTret(nomtrets);
//        this.disparar(e);

    }
//La función estat muestra el estado del objeto
//      *Devuelve:es un void por lo que no devuelve nada
//      *Parámetros de entrada:nada
    public void estat() {
        System.out.println("Nom: " + this.getNom());
        System.out.println("Tipus de personatge: " + this.getClass().getSimpleName());
        System.out.println("Posició: x(" + this.getPosx() + "), y(" + this.getPosy() + ")");
        System.out.println("Trets: " + this.nomtrets);
        System.out.println(" ");
    }
}

