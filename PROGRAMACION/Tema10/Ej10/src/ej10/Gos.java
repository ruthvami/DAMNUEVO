/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej10;

import java.util.Date;

/**
 *
 * @author rutvac
 */
public class Gos extends Mascotas {

    private String raza;
    private boolean puses;

    public Gos(String nom, int edat, String estat, String dataNaixement, String raza, boolean puses) throws Exception {
        super(nom, edat, estat, dataNaixement);

        this.raza = raza;
        this.puses = puses;
    }

    @Override
    public void mostrar() {
        System.out.println("Nom         : " + this.getNom());
        System.out.println("Estat       : " + this.getEstat());
        System.out.println("DataNaix    : " + this.getDataNaixement());
        System.out.println("Edat        : " + this.getEdat());
        System.out.println("Raza        : " + this.getRaza());
        System.out.println("Té puses?   : " + this.getPuses());
    }

    @Override
    public void parla() {
        System.out.println("GUAU GUAU !!!!");
    }

    public String getRaza() {
        return raza;
    }

    public boolean getPuses() {
        return puses;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setPuses(boolean puses) {
        this.puses = puses;
    }
}
