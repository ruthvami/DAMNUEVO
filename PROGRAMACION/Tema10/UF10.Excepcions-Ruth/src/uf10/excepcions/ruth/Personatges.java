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

    private int posx;
    private int posy;
    private String nom;

    public Personatges(String nom,int posx,int posy) throws LimitDePantalla {
        this.nom = nom;
        this.setPosx(posx);
        this.setPosy(posy);
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public String getNom() {
        return nom;
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

    public abstract void estat();
}
