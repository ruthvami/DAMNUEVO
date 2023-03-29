/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej10;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rutvac
 */
public abstract class Mascotas {

    private String nom;
    private int edat;
    private String estat; // jugant, dormint, mort ...
    private String dataNaixement;

    public Mascotas(String nom, int edat, String estat, String dataNaixement) throws  Excepcionnombre, Excepcionedadm {
        this.setNom(nom);
        this.setEdat(edat);
        this.setEstat(estat);
        this.setDataNaixement(dataNaixement);
    }

    public String getNom() {
        return this.nom;
    }

    public int getEdat() {
        return this.edat;
    }

    public String getEstat() {
        return this.estat;
    }

    public String getDataNaixement() {
        return this.dataNaixement;
    }

    public void setNom(String nom) throws Excepcionnombre {
        if (nom.isEmpty()) {
            throw new Excepcionnombre(nom);
        }
        this.nom = nom;
    }

    public void setEdat(int edat) throws Excepcionedadm {
        if (edat < 0) {
            throw new Excepcionedadm(edat);
        }
        this.edat = edat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }

    public void setDataNaixement(String dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    public abstract void mostrar();

    public abstract void parla();

    public void aniversari() {
        this.edat = this.edat + 1;
    }

    public void morir() {
        this.estat = "mort";
    }
}
