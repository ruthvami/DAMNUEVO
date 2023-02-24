/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2astros;

/**
 *
 * @author rutvac
 */
public class Astre {

    private String nom;
    private double radi;
    private int rotacio;
    private double massa;
    private double temperatura;
    private double gravetat;

    public Astre(String nom,double radi,int rotacio,double massa,double temperatura,double gravetat) {
        this.gravetat=gravetat;
        this.massa=massa;
        this.nom=nom;
        this.radi=radi;
        this.rotacio=rotacio;
        this.temperatura=temperatura;
        
    }
   public void mostrar(){
       System.out.println("****Caracteristicas del Astre***");
       System.out.println("Nom:"+this.nom+"\tMassa:"+this.massa);
       System.out.println("Radi:"+this.radi+"\tTemperatura:"+this.temperatura);
       System.out.println("Gravetat:"+this.gravetat+"\tRotacio:"+this.rotacio);
   }
    
}
