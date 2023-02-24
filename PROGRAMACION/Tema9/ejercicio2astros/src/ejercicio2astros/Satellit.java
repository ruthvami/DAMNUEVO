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
public class Satellit extends Astre {
    private double distanciapl;
    private double orbitapl;
//    private ArrayList obj=nre ArrayList[Planeta];

    public Satellit(String nom, double radi, int rotacio, double massa, double temperatura, double gravetat,double distanciapl,double orbitapl) {
        super(nom, radi, rotacio, massa, temperatura, gravetat);
        this.distanciapl=distanciapl;
        this.orbitapl=orbitapl;
    }
    public Satellit(String nom, double radi, int rotacio, double massa, double temperatura, double gravetat,double distanciapl,double orbitapl) {
        super(nom, radi, rotacio, massa, temperatura, gravetat);
        this.distanciapl=distanciapl;
        this.orbitapl=orbitapl;
    }
    public void mostrar(){
       super.mostrar();
        System.out.println("Distancia al planeta:"+this.distanciapl+"\tOrbita al planeta:"+this.orbitapl);
   }
    public 
}
