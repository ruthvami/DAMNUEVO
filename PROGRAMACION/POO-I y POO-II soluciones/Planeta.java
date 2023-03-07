/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e2_astres;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class Planeta extends Astre {
    private double distanciaSol;
    private double orbitaSol;
    private boolean teSatelits;
    private ArrayList<Satelit> satelits;    
    
    
    public Planeta(String nom,double radi,double rotacio,double massa,double temperatura,
            double gravetat,double distanciaSol, double orbitaSol, ArrayList<Satelit> satelits){
        
        super(nom,radi,rotacio,massa,temperatura,gravetat);
        
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.teSatelits = true;
        this.satelits = satelits;
    }
    // Constructor sense ArrayList<Satelit>
    public Planeta(String nom,double radi,double rotacio,double massa,double temperatura,
            double gravetat,double distanciaSol, double orbitaSol){
        
        super(nom,radi,rotacio,massa,temperatura,gravetat);
        
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.teSatelits = false;
        this.satelits =  new ArrayList<>();
    }
    
    @Override
    public void mostrar(){
        super.mostrar();

        System.out.println("- Distància al Sol      : " + this.distanciaSol +" Km");
        System.out.println("- Temps d'òrbita al Sol : " + this.orbitaSol +" dies");
        if(this.teSatelits){
            System.out.println("- Té els següents satel.lits:");
            for (int i = 0; i < this.satelits.size(); i++) {
                System.out.println("\t - " + this.satelits.get(i).getNom());
            }
        }else{
            System.out.println("- No té satèl.lits associats");
        }        
    }

    // Mètode per a afegir un satèl.lit
    public void afegirSatelit(Satelit s) {
        this.satelits.add(s);
        this.teSatelits = true;
    }
    
    public double getDistanciaSol() {
        return this.distanciaSol;
    }

    public double getOrbitaSol() {
        return this.orbitaSol;
    }

    public boolean getTeSatelits() {
        return this.teSatelits;
    }
    public ArrayList<Satelit> getSatelits() {
        return this.satelits;
    }  

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public void setOrbitaSol(double orbitaSol) {
        this.orbitaSol = orbitaSol;
    }

    public void setTeSatelits(boolean teSatelits) {
        this.teSatelits = teSatelits;
    }   
    public void setSatelits(ArrayList<Satelit> satelits) {
        this.satelits = satelits;
        this.teSatelits = true;
    }  
}