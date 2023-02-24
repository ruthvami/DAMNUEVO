/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2astros;

import java.util.ArrayList;

/**
 *
 * @author rutvac
 */
public class Planeta extends Satellit{

    private double distanciasol;
    private double orbitasol;
    private String satelits;
    private ArrayList satelits=new ArrayList[];

    public Planeta(String nom, double radi, int rotacio, double massa, double temperatura, double gravetat,double distanciapl,double orbitapl,double distanciasol, double orbitasol,boolean satelits) {
        super(nom, radi, rotacio, massa, temperatura, gravetat,distanciapl,orbitapl);
        this.distanciasol=distanciasol;
        this.orbitasol=orbitasol;
        this.satelits=satelits;
    }

}
