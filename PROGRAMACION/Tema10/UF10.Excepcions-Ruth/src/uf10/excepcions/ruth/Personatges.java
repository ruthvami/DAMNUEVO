/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10.excepcions.ruth;

/**
 *
 * @author ruthv
 */
public abstract class Personatges {

    private String nom;
    private int posx;
    private int posy;
    private double velocidad;

    public Personatges(String nom, int posx, int posy, double velocidad) throws LimitDePantalla {
        this.nom = nom;
        this.setPosx(posx);
        this.setPosy(posy);
        this.velocidad = velocidad;
    }

    public String getNom() {
        return nom;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setPosx(int posx) throws LimitDePantalla {
        this.posx = posx;
        if (posx > 200 || posx < -200) {
            throw new LimitDePantalla(this);
        }
    }

    public void setPosy(int posy) throws LimitDePantalla {
        this.posy = posy;
        if (posy > 100 || posy < -100) {
            throw new LimitDePantalla(this);
        }
    }

    public void mourex(int a) {
        posx += a;
    }

    public void mourey(int a) {
        posy += a;
        velocidad *= 2;
    }
    public abstract void estat();
}
