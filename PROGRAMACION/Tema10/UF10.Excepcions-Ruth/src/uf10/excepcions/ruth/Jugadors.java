
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

    public void disparar(Enemic e) throws SenseBales, EnemicMort {
        System.out.println("Jugador " + this.getNom() + " dispara a enemigo " + e.getNom());

        if (this.nomtrets <= 0) {
            throw new SenseBales();
        }

        if (e.getVida() == 0) {
            throw new EnemicMort();

        }

        e.rebreTret(nomtrets);
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
