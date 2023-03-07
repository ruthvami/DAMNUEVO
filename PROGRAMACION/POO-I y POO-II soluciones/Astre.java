/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e2_astres;

/**
 *
 * @author angel
 */
public class Astre {
    private String nom;
    private double radi;
    private double rotacio;
    private double massa;
    private double temperatura;
    private double gravetat;
    
    public Astre(String nom,double radi,double rotacio,double massa,double temperatura,double gravetat){
        this.nom = nom;
        this.radi = radi;
        this.rotacio = rotacio;
        this.massa = massa;
        this.temperatura = temperatura;
        this.gravetat = gravetat;
    }
    
    public void mostrar(){
        System.out.println("Les característiques del " + this.getClass().getSimpleName() 
                + " " + this.getNom() + " són: ");
        System.out.println("- Radi                      : " + this.getRadi() +" Km");
        System.out.println("- Temps de rotació          : " + this.getRotacio() +" hores");
        System.out.println("- Massa                     : " + this.getMassa() +" mil·lions de Tones");
        System.out.println("- Temperatura mitjana       : " + this.getTemperatura() +" ºC");
        System.out.println("- Gravetat                  : " + this.getGravetat() +" m/s");        
    };

    public String getNom() {
        return nom;
    }
    public double getRadi() {
        return radi;
    }

    public double getRotacio() {
        return rotacio;
    }

    public double getMassa() {
        return massa;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getGravetat() {
        return gravetat;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
    public void setRadi(double radi) {
        this.radi = radi;
    }

    public void setRotacio(double rotacio) {
        this.rotacio = rotacio;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void setGravetat(double gravetat) {
        this.gravetat = gravetat;
    }   
}