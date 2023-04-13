
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
    private double velocidad;
    private int nomtrets;

    public Jugadors(int nomtrets, String nom, int posx, int posy, double velocidad) throws LimitDePantalla {
        super(nom,posx,posy);

        this.nomtrets = nomtrets;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void mourex(int a) throws LimitDePantalla {
        this.setPosx((int) (this.getPosx()+this.velocidad*a));
    }
 
    public void mourey(int a) throws LimitDePantalla {
        this.setPosy((int) (this.getPosy()+ this.velocidad * 2*a));
    }

    public void disparar(Enemic en) throws EnemicMort {
        if (en.getVida() == 0) {
            throw new EnemicMort();
        }
        System.out.println("Jugador " + this.getNom() + " dispara a enemigo " +en.getNom());
        en.decrement();
        nomtrets--;
    }

    public void estat() {
        System.out.println("Nom: " + this.getNom());
        System.out.println("Tipus de personatge: " + this.getClass().getSimpleName());
        System.out.println("Posició: x(" + this.getPosx() + "), y(" + this.getPosy() + ")");
        System.out.println("Trets: " + this.nomtrets);
    }
}
